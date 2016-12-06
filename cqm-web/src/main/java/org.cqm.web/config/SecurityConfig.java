package org.cqm.web.config;

import org.cqm.data.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by Dmitriy on 06.12.2016.
 */

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{

//    @Autowired
//    private UserDetailsServiceImpl userDetailsService;
//
//    //регистрируем нашу реализацию UserService
//    //а также PasswordEncoder для приведения пароля в формат SHA1
//    @Autowired
//    public void registerGlobalAuthentication(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .userDetailsService(userDetailsService)
//                .passwordEncoder(getShaPasswordEncoder());
//    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password("user").roles("USER");
        auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("superadmin").password("superadmin").roles("SUPERADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //включаем защиту от CSRF атак
        http.csrf()
                .disable()
                //указываем правила запросов
                //по которым будет опрделятся доступ к ресурсам и остальным данным
                .authorizeRequests()
                .antMatchers("/resources/**", "/**").permitAll()
                .anyRequest().permitAll()
                .and();
        http.formLogin()
                //указываем страницу с формой логина
                .loginPage("/login")
                //указываем action с формы логина
                .loginProcessingUrl("/j_spring_security_check")
                //указываем url при неудачном логине
                .failureUrl("/login?error")
                //Указываем параметры логина и пароля с формы логина
                .usernameParameter("j_username")
                .passwordParameter("j_password")
                //дает доступ к форме логина всем
                .permitAll();
        http.logout()
                //разрешаем делать логаут всем
                .permitAll()
                //указываем url логаута
                .logoutUrl("/logout")
                //указываем url при неудачном логауте
                .logoutSuccessUrl("/login?logout")
                //делаем невалидной текущую сессию
                .invalidateHttpSession(true);
    }

    @Bean
    public ShaPasswordEncoder getShaPasswordEncoder() {
        return new ShaPasswordEncoder();
    }
}
