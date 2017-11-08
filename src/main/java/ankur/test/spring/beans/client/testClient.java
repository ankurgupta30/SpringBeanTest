package ankur.test.spring.beans.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import ankur.test.spring.beans.bean.User;

public class testClient {

	public static void main(String[] args) {
		new testClient().test1();
	}

	private void test1() {
		Resource resource =  new ClassPathResource("myconfig.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		User user = (User)factory.getBean("user");
		System.out.println("Name " + user.getName());
		System.out.println("Age " + user.getAge());
		
	}

}
