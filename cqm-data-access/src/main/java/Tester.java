import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import org.cqm.data.configuration.AppConfig;
import org.cqm.data.entity.Cafeteria;
import org.cqm.data.entity.User;
import org.cqm.data.repositories.CafeteriaRepository;
import org.cqm.data.repositories.UserRepository;
import org.cqm.data.services.CafeteriaService;
import org.cqm.data.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.*;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Logger;

/**
 * Use ApplicationContext for the permission of dependencies
 */

public class Tester {

    private static final Logger logger = Logger.getLogger(Tester.class.getName());

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        logger.info("Testing configuration...");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserRepository userRepository = context.getBean(UserRepository.class);
        UserService userService = context.getBean(UserService.class);

        Cafeteria cafeteria = null;
        CafeteriaRepository cafeteriaRepository = context.getBean(CafeteriaRepository.class);
        CafeteriaService cafeteriaService = context.getBean(CafeteriaService.class);

        List<Cafeteria> oneCafe = cafeteriaRepository.findByCafeName("КСП");
        cafeteria = oneCafe.get(0);
//        try {
//            byte[] bytea = new byte[1000000];
//            FileInputStream fis = new FileInputStream(cafeteria.getPhoto());
//            fis.read(bytea);
//            FileOutputStream fos = new FileOutputStream("C:\\Users\\iauli\\Desktop\\imagefromdbfromclass.jpg");
//            fos.write(bytea);
//        } catch (FileNotFoundException e1) {
//            e1.printStackTrace();
//        } catch (IOException e1) {
//            e1.printStackTrace();
//        }


        /*try{

            String dirName="C:\\";
            ByteArrayOutputStream baos=new ByteArrayOutputStream(1000000);
            BufferedImage img=ImageIO.read(new File(dirName,"rose.jpg"));
            ImageIO.write(img, "jpg", baos);
            baos.flush();
            String base64String=Base64.encode(baos.toByteArray());
            baos.close();

            byte[] bytearray = Base64.decode(base64String);

            BufferedImage imag=ImageIO.read(new ByteArrayInputStream(bytearray));
            ImageIO.write(imag, "jpg", new File(dirName,"snap.jpg"));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
*/
//        BufferedImage img = ImageIO.w
//        FileOutputStream stream = new FileOutputStream("C:\\Users\\iauli\\Desktop\\testimg.jpg");
//        stream.write(cafeteria.getPhotoByte());
//        stream.close();
//        } catch (IOException e) {
//        e.printStackTrace();
//    }
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

        List<User> listUsers = userRepository.findAllUserOrderByIdAsc();
        System.out.println(listUsers);*/

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

//        List<Cafeteria> listCafeterias = cafeteriaRepository.findAllCafeteriasOrderByCafeIdAsc();
//        System.out.println(listCafeterias);
//        List<User> oneUser = userRepository.findByLastName("Vorobyev");
//        System.out.println(oneUser);
//
//        List<User> user = userRepository.findByEmail("");
//        System.out.println(user);

//        User user1 = userService.findUserByLogin("lo");
//        MessageDigest digest = MessageDigest.getInstance("SHA-1");
//        digest.update(user1.getPassword().getBytes("utf8"));
//        byte[] digestBytes = digest.digest();
//        String digestStr = javax.xml.bind.DatatypeConverter.printHexBinary(digestBytes);



       /* // open image
        File imgPath = new File("C:\\Users\\iauli\\Desktop\\b025236306e00a2d18c00a961219c761.jpg");
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(imgPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // get DataBufferBytes from Raster
        WritableRaster raster = bufferedImage .getRaster();
        DataBufferByte data   = (DataBufferByte) raster.getDataBuffer();
        System.out.println(data.getData());*/






















/*

        File fi = new File("C:\\Users\\iauli\\Desktop\\b025236306e00a2d18c00a961219c761.jpg");
        byte[] fileContent = null;
        FileOutputStream fos = null;

        try {
            fileContent = Files.readAllBytes(fi.toPath());
            fos = new FileOutputStream("C:\\Users\\iauli\\Desktop\\bytes.txt");
            fos.write(fileContent);
            fos.close();

            FileOutputStream stream = new FileOutputStream("C:\\Users\\iauli\\Desktop\\imageback.jpg");
            stream.write(fileContent);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/








    }
}
