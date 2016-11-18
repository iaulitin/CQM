import org.cqm.data.configuration.AppConfig;
import org.cqm.data.entity.User;
import org.cqm.data.repositories.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;

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
        UserRepository repository = context.getBean(UserRepository.class);

        User user1 = new User();
        user1.setFirstName("Dmitry");
        user1.setLastName("Vorobyev");
        user1.setUserEmail("vorobiev.dima@yandex.ru");
        user1.setHashPassword("12qw");
        user1.setSaltPassword("34er");
        user1.setAdmin(true);
        user1.setUserLogin("teaset");
        user1.setUserRating(1);

        User user2 = new User();
        user2.setFirstName("Ilya");
        user2.setLastName("Ulitin");
        user2.setUserEmail("iaulitin@yandex.ru");
        user2.setHashPassword("qw12");
        user2.setSaltPassword("er34");
        user2.setAdmin(true);
        user2.setUserLogin("mobilnik");
        user2.setUserRating(1);

        repository.save(user1);
        repository.save(user2);

        List<String> users = repository.findByLastName("Vorobyev");
        System.out.println(users);


        //System.out.println(repository);
    }
}
