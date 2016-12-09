import org.cqm.data.configuration.AppConfig;
import org.cqm.data.entity.Cafeteria;
import org.cqm.data.entity.User;
import org.cqm.data.repositories.CafeteriaRepository;
import org.cqm.data.repositories.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

/**
 * Use ApplicationContext for the permission of dependencies
 */

public class Tester {

    //private static final Logger logger = Logger.getLogger(Tester.class.getName());

    public static void main(String[] args) {
        //logger.info("Testing configuration...");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserRepository userRepository = context.getBean(UserRepository.class);

     /*   User user1 = new User();
        user1.setFirstName("Dmitry");
        user1.setLastName("Vorobyev");
        user1.setUserEmail("vorobiev.dima@yandex.ru");
        user1.setHashPassword("12qw");
        user1.setSaltPassword("34er");
        user1.setIsAdmin(true);
        user1.setUserLogin("teaset");
        user1.setUserRating(1);

        User user2 = new User();
        user2.setFirstName("Ilya");
        user2.setLastName("Ulitin");
        user2.setUserEmail("iaulitin@yandex.ru");
        user2.setHashPassword("qw12");
        user2.setSaltPassword("er34");
        user2.setIsAdmin(true);
        user2.setUserLogin("mobilnik");
        user2.setUserRating(1);

        userRepository.save(user1);
        userRepository.save(user2);

        List<User> listUsers = userRepository.findAllByOrderByUserIdAsc();
        System.out.println(listUsers);*/

      CafeteriaRepository cafeteriaRepository = context.getBean(CafeteriaRepository.class);

//        Cafeteria cafeteria1 = new Cafeteria();
//        cafeteria1.setCafeName("КСП");
//        cafeteria1.setCafeAddress("Россия, Московская область, Долгопрудный, Первомайская улица, 7");
//
//        Cafeteria cafeteria2 = new Cafeteria();
//        cafeteria2.setCafeName("Veryfood ГК");
//        cafeteria2.setCafeAddress("Россия, Московская область, Долгопрудный, Институтский переулок, 9");
//
//        Cafeteria cafeteria3 = new Cafeteria();
//        cafeteria3.setCafeName("Veryfood НК");
//        cafeteria3.setCafeAddress("Россия, Московская область, Долгопрудный, Институтский переулок, 9");
//
//        Cafeteria cafeteria4 = new Cafeteria();
//        cafeteria4.setCafeName("Veryfood КПМ");
//        cafeteria4.setCafeAddress("Россия, Московская область, Долгопрудный, Институтский переулок, 9");
//
//        cafeteriaRepository.save(cafeteria1);
//        cafeteriaRepository.save(cafeteria2);
//        cafeteriaRepository.save(cafeteria3);
//        cafeteriaRepository.save(cafeteria4);

//        List<Cafeteria> listCafeterias = cafeteriaRepository.findAllByOrderByCafeIdAsc();
//        System.out.println(listCafeterias);
//        List<User> oneUser = userRepository.findByLastName("Vorobyev");
//        System.out.println(oneUser);

        List<User> user = userRepository.findByLogin("teaset");
        System.out.println(user);
    }
}
