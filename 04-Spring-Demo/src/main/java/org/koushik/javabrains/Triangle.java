package org.koushik.javabrains;


public class Triangle implements Shape {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;

		public Point getPointA() {
			return pointA;
		}

		public void setPointA(Point pointA) {
			this.pointA = pointA;
		}

		public Point getPointB() {
			return pointB;
		}

		public void setPointB(Point pointB) {
			this.pointB = pointB;
		}

		public Point getPointC() {
			return pointC;
		}

		public void setPointC(Point pointC) {
			this.pointC = pointC;
		}

		public void draw() {
			System.out.println("Drawing Triangle");
			System.out.println("point A = ("+getPointA().getX()+", "+getPointA().getY()+")");
			System.out.println("point B = ("+getPointB().getX()+", "+getPointB().getY()+")");
			System.out.println("point C = ("+getPointC().getX()+", "+getPointC().getY()+")");
		}

		
	}



	/*
	  
public class Triangle {
	
	public void draw() {
		System.out.println("Triangle drawn");
	}
		
}



public class Triangle { 
		
		private String type;	  
	  
	  
        public String getType() {
			return type;
		}
	
		public void setType(String type) {
			this.type = type;
		}	  
	  
	  	public void draw() {
		System.out.println(getType() + "Triangle drawn");
	    }
	  
}



public class Triangle { 
		
		private String type;
		
		public Triangle(String type) {
		  this.type = type;
		}  
			  
	  
        public String getType() {
			return type;
		}
	
		public void setType(String type) {
			this.type = type;
		}	  
	  
	  	public void draw() {
		System.out.println(getType() + "Triangle drawn");
	    }
	  
}
	  
	  
	 
public class Triangle { 

		private String type;
		private int height;
		
		public Triangle(String type) {
			this.type = type;
		}
		
		public Triangle(String type, int height) {
			this.type = type;
			this.height = height;
		}
		
		public Triangle (int height) {
		
			this.height = height;
		}
	
		public String getType() {
			return type;
		}
	
		public void setType(String type) {
			this.type = type;
		}
	
		public int getHeight() {
			return height;
		}
	
		public void setHeight(int height) {
			this.height = height;
		}
		
		public void draw() {
			System.out.println(getType() + "Triangle drawn of height "+getHeight());
		}
}	

	

public class Triangle {

	    private Point pointA;
		private Point pointB;
		private Point pointC;
	
		public Point getPointA() {
			return pointA;
		}
	
		public void setPointA(Point pointA) {
			this.pointA = pointA;
		}
	
		public Point getPointB() {
			return pointB;
		}
	
		public void setPointB(Point pointB) {
			this.pointB = pointB;
		}
	
		public Point getPointC() {
			return pointC;
		}
	
		public void setPointC(Point pointC) {
			this.pointC = pointC;
		}
	
		public void draw() {
			
			System.out.println("point A = ("+getPointA().getX()+", "+getPointA().getY()+")");
			System.out.println("point B = ("+getPointB().getX()+", "+getPointB().getY()+")");
			System.out.println("point C = ("+getPointC().getX()+", "+getPointC().getY()+")");
		}
		
}
	
	
	
public class Triangle {

		private List<Point> points;
	
		public List<Point> getPoints() {
			return points;
		}
	
		public void setPoints(List<Point> points) {
			this.points = points;
		}
		
		public void draw() {
			for(Point point: points) {
				System.out.println("Point = ("+point.getX()+", "+point.getY()+")");
			}
		}
}
	
		
		
public class Triangle {
	
	    private Point pointA;
		private Point pointB;
		private Point pointC;

		public Point getPointA() {
			return pointA;
		}

		public void setPointA(Point pointA) {
			this.pointA = pointA;
		}

		public Point getPointB() {
			return pointB;
		}

		public void setPointB(Point pointB) {
			this.pointB = pointB;
		}

		public Point getPointC() {
			return pointC;
		}

		public void setPointC(Point pointC) {
			this.pointC = pointC;
		}

		public void draw() {
			
			System.out.println("point A = ("+getPointA().getX()+", "+getPointA().getY()+")");
			System.out.println("point B = ("+getPointB().getX()+", "+getPointB().getY()+")");
			System.out.println("point C = ("+getPointC().getX()+", "+getPointC().getY()+")");
		}
		
}

	

public class Triangle implements ApplicationContextAware, BeanNameAware{
	
	    private Point pointA;
		private Point pointB;
		private Point pointC;
		private ApplicationContext context = null;

		public Point getPointA() {
			return pointA;
		}

		public void setPointA(Point pointA) {
			this.pointA = pointA;
		}

		public Point getPointB() {
			return pointB;
		}

		public void setPointB(Point pointB) {
			this.pointB = pointB;
		}

		public Point getPointC() {
			return pointC;
		}

		public void setPointC(Point pointC) {
			this.pointC = pointC;
		}

		public void draw() {
			
			System.out.println("point A = ("+getPointA().getX()+", "+getPointA().getY()+")");
			System.out.println("point B = ("+getPointB().getX()+", "+getPointB().getY()+")");
			System.out.println("point C = ("+getPointC().getX()+", "+getPointC().getY()+")");
		}

		@Override
		public void setApplicationContext(ApplicationContext context) throws BeansException {
			this.context = context;
		}

		@Override
		public void setBeanName(String beanName) {
			System.out.println("Bean name is: "+ beanName);
			
		}
		
}

	

public class Triangle implements InitializingBean, DisposableBean {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;

		public Point getPointA() {
			return pointA;
		}

		public void setPointA(Point pointA) {
			this.pointA = pointA;
		}

		public Point getPointB() {
			return pointB;
		}

		public void setPointB(Point pointB) {
			this.pointB = pointB;
		}

		public Point getPointC() {
			return pointC;
		}

		public void setPointC(Point pointC) {
			this.pointC = pointC;
		}

		public void draw() {
			
			System.out.println("point A = ("+getPointA().getX()+", "+getPointA().getY()+")");
			System.out.println("point B = ("+getPointB().getX()+", "+getPointB().getY()+")");
			System.out.println("point C = ("+getPointC().getX()+", "+getPointC().getY()+")");
		}

		@Override
		public void afterPropertiesSet() throws Exception {
			System.out.println("InitializingBean init method called for Triangle");
			
		}

		@Override
		public void destroy() throws Exception {
			System.out.println("DisposableBean destroy method called for Triangle");
			
		}
		
}



public class Triangle implements InitializingBean, DisposableBean {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;

		public Point getPointA() {
			return pointA;
		}

		public void setPointA(Point pointA) {
			this.pointA = pointA;
		}

		public Point getPointB() {
			return pointB;
		}

		public void setPointB(Point pointB) {
			this.pointB = pointB;
		}

		public Point getPointC() {
			return pointC;
		}

		public void setPointC(Point pointC) {
			this.pointC = pointC;
		}

		public void draw() {
			
			System.out.println("point A = ("+getPointA().getX()+", "+getPointA().getY()+")");
			System.out.println("point B = ("+getPointB().getX()+", "+getPointB().getY()+")");
			System.out.println("point C = ("+getPointC().getX()+", "+getPointC().getY()+")");
		}

		@Override
		public void afterPropertiesSet() throws Exception {
			System.out.println("InitializingBean init method called for Triangle");
			
		}

		@Override
		public void destroy() throws Exception {
			System.out.println("DisposableBean destroy method called for Triangle");
			
		}
		
		
		public void myInit() {
			System.out.println("My init method called for Triangle");
		}
		
		public void cleanUp() {
			System.out.println("My Cleanup method called for Triangle");
		}
		
}
	


public class Triangle implements Shape{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;

		public Point getPointA() {
			return pointA;
		}

		public void setPointA(Point pointA) {
			this.pointA = pointA;
		}

		public Point getPointB() {
			return pointB;
		}

		public void setPointB(Point pointB) {
			this.pointB = pointB;
		}

		public Point getPointC() {
			return pointC;
		}

		public void setPointC(Point pointC) {
			this.pointC = pointC;
		}

		public void draw() {
			System.out.println("Drawing Triangle");
			System.out.println("point A = ("+getPointA().getX()+", "+getPointA().getY()+")");
			System.out.println("point B = ("+getPointB().getX()+", "+getPointB().getY()+")");
			System.out.println("point C = ("+getPointC().getX()+", "+getPointC().getY()+")");
		}

		
}
 
 */


