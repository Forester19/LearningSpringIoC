package javamen.go.lerningSpringIoC;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Владислав on 28.05.2017.
 */
public class MessageSender {
    public static void main(String[] args) {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("message-bean.xml"));
        Message message = (Message) xmlBeanFactory.getBean("fromBeanMessage");
        System.out.println(message.getMessage());
    }
}
