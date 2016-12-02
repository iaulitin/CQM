import org.cqm.data.configuration.AppConfig;
import org.cqm.data.entity.User;
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
        UserRepository repository = context.getBean(UserRepository.class);

//        User user1 = new User();
//        user1.setFirstName("Dmitry");
//        user1.setLastName("Vorobyev");
//        user1.setUserEmail("123vorobiev.dima@yandex.ru");
//        user1.setHashPassword("12qw");
//        user1.setSaltPassword("34er");
//        user1.setAdmin(false);
//        user1.setUserLogin("mazalTov");
//        user1.setUserRating(2);
//
//        User user2 = new User();
//        user2.setFirstName("Ilya");
//        user2.setLastName("Ulitin");
//        user2.setUserEmail("123iaulitin@yandex.ru");
//        user2.setHashPassword("qw12");
//        user2.setSaltPassword("er34");
//        user2.setAdmin(false);
//        user2.setUserLogin("bigSmoke");
//        user2.setUserRating(2);
//
//        repository.save(user1);
//        repository.save(user2);

//        List<String> users = repository.findByLastName("Vorobyev");
//        System.out.println(users);

        List<String> allUsers = repository.findAllByOrderByIdAsc();
        System.out.println(allUsers);



        //System.out.println(repository);
    }
}
