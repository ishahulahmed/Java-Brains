package org.koushik.javabrains;

import org.koushik.javabrains.service.FactoryService;
import org.koushik.javabrains.service.ShapeService;

public class AopMain {

	public static void main(String[] args) {
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		// ShapeService shapeService = ctx.getBean("shapeService",ShapeService.class);
		
		FactoryService factoryService = new FactoryService();
		ShapeService shapeService = (ShapeService)factoryService.getBean("shapeService");
		shapeService.getCircle();

	}

}

/*

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = ctx.getBean("shapeService",ShapeService.class);
		System.out.println(shapeService.getCircle().getName());

	}

}



public class AopMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = ctx.getBean("shapeService",ShapeService.class);
		shapeService.getCircle().setName("Dummy name");
		System.out.println(shapeService.getCircle().getName());

	}

}



public class AopMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = ctx.getBean("shapeService",ShapeService.class);
		shapeService.getCircle().setName("Dummy name");

	}

}



public class AopMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = ctx.getBean("shapeService",ShapeService.class);
		shapeService.getCircle().setNameandReturn("Dummy name");

	}

}



public class AopMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = ctx.getBean("shapeService",ShapeService.class);
		shapeService.getCircle();

	}

}



public class AopMain {

	public static void main(String[] args) {
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		// ShapeService shapeService = ctx.getBean("shapeService",ShapeService.class);
		
		FactoryService factoryService = new FactoryService();
		ShapeService shapeService = (ShapeService)factoryService.getBean("shapeService");
		shapeService.getCircle();

	}

}


*/