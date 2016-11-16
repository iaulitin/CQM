import org.cqm.data.configuration.AppConfig;
import org.cqm.data.entity.Reports;
import org.cqm.data.entity.Users;
import org.cqm.data.repositories.CafeteriaRepository;
import org.cqm.data.repositories.ReportsRepository;
import org.cqm.data.repositories.UsersRepository;
import org.cqm.data.services.UsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Dmitriy on 08.11.2016.
 */

/**
 * Use ApplicationContext for the permission of dependencies
 */

public class Tester {

    //private static final Logger logger = Logger.getLogger(Tester.class.getName());

    public static void main(String[] args) {
        //logger.info("Testing configuration...");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //UsersService service = context.getBean(UsersService.class);
        UsersRepository repository = context.getBean(UsersRepository.class);
        Users user = new Users();
        user.setFirstName("wtf?");
        repository.save(user);
    /*
        UsersRepository repository = context.getBean(UsersRepository.class);

        Users user = new Users();
        user.setFirstName("Vadim");
        user.setLastName("Ivanov");
        user.setUserEmail("tester@mail.ru");
        user.setHashPassword("123");
        user.setSaltPassword("456");
        user.setAdmin(true);
        user.setUserLogin("ivadim");
        user.setUserRating(1);

        repository.save(user);
*/

//        System.out.println(repository.);
    }
}
