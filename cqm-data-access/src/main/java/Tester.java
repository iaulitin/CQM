import org.cqm.data.configuration.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

/**
 * Created by Dmitriy on 08.11.2016.
 */

/**
 * Use ApplicationContext for the permission of dependencies
 */
public class Tester {

    private static final Logger logger = Logger.getLogger(String.valueOf(Tester.class));

    public static void main(String[] args) {
        logger.info("Testing configuration...");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
