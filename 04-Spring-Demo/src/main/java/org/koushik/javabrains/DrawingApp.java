package org.koushik.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
	}
}


/*

public class DrawingApp {

		public static void main(String[] args) {
	
			// Triangle triangle = new Triangle();
			  BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
			  Triangle triangle = (Triangle)factory.getBean("triangle");
			  triangle.draw();
	
		}

}



public class DrawingApp {

	public static void main(String[] args) {

		// Triangle triangle = new Triangle();
		// BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle-alias");
		triangle.draw();

	}

}



public class DrawingApp {

	public static void main(String[] args) {

		// Triangle triangle = new Triangle();
		// BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle1");
		triangle.draw();

	}

}



public class DrawingApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();

	}

}



public class DrawingApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();

	}

}



public class DrawingApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
	}
}



public class DrawingApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
	}
}



public class DrawingApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		System.out.println(context.getMessage("greeting", null, "Default Greeting", null));
	}
}

*/