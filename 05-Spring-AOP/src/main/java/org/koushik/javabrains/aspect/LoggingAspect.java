package org.koushik.javabrains.aspect;


import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		
		Object returnValue = null;
		try {
			System.out.println("Before advice");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("After Returning");
		} catch (Throwable e) {
			System.out.println("After Throwing");
		}
		System.out.println("After Finally");
		return returnValue;
	}
	
	
	public void loggingAdvice() {
		System.out.println("Logging from the advice");
	}

}

/*
  
@Aspect 
public class LoggingAspect {
 
  @Before("execution(public String getName())") 
  public void LoggingAdvice() {
  System.out.println("Advice run. Get Method called"); 
  } 
  
}
 
  
 
 @Aspect 
 public class LoggingAspect {
 
  @Before("execution(public String org.koushik.javabrains.model.Circle.getName())") 
  public void LoggingAdvice() {
  System.out.println("Advice run. Get Method called"); 
  }
   
}
 
  
  
@Aspect 
public class LoggingAspect {
  
  @Before("execution(public * get*())") 
  public void LoggingAdvice() {
  System.out.println("Advice run. Get Method called"); 
  } 
  
}
 
  
  
@Aspect 
public class LoggingAspect {
  
  @Before("execution(* get*(*))") 
  public void LoggingAdvice() {
  System.out.println("Advice run. Get Method called"); 
  } 
  
}
  
  
  
@Aspect 
public class LoggingAspect {
  
  @Before("execution(* get*(..))") 
  public void LoggingAdvice() {
  System.out.println("Advice run. Get Method called"); 
  } 
  
}
  
  
  
@Aspect 
public class LoggingAspect {
  
  @Before("execution(* org.koushik.javabrains.model.*.get*())") 
  public void LoggingAdvice() { 
  System.out.println("Advice run. Get Method called"); 
  } 
  
}
  
  
  
@Aspect 
public class LoggingAspect {
  
  @Before("execution(* get*())") 
  public void LoggingAdvice() {
  System.out.println("Advice run. Get Method called"); 
  }
  
  
  @Before("execution(* get*())") 
  public void secondAdvice() {
  System.out.println("Second Advice executed."); 
  } 
  
}
  
  
  
@Aspect 
public class LoggingAspect {
  
  @Before("allGetters()") 
  public void LoggingAdvice() {
  System.out.println("Advice run. Get Method called"); 
  }
  
  
  @Before("allGetters()") 
  public void secondAdvice() {
  System.out.println("Second Advice executed."); 
  }
  
  @Pointcut("execution(* get*())") 
   public void allGetters() {}
  
}


  
  
@Aspect 
public class LoggingAspect {
  
  @Before("allGetters()") 
  public void LoggingAdvice() {
  System.out.println("Advice run. Get Method called"); 
  }

  
  @Before("allGetters()") 
  public void secondAdvice() {
  System.out.println("Second Advice executed."); 
  }
  
  @Pointcut("execution(* get*())") 
  public void allGetters() {}
  
  @Pointcut("execution(* * org.koushik.javabrains.model.Circle.*(..))") public
  void allCircleMethods() {}
  
}
  
  
  
@Aspect 
public class LoggingAspect {
  
  @Before("allGetters()") 
  public void LoggingAdvice() {
  System.out.println("Advice run. Get Method called"); 
  }
  
  
  @Before("allGetters()") 
  public void secondAdvice() {
  System.out.println("Second Advice executed."); 
  }
  
  @Pointcut("execution(* get*())") 
  public void allGetters() {}
  
  @Pointcut("within(org.koushik.javabrains.model.Circle)") 
  public void allCircleMethods() {}
  
}
  
  
  
@Aspect 
public class LoggingAspect {
  
  @Before("allGetters()") 
  public void LoggingAdvice() {
  System.out.println("Advice run. Get Method called"); 
  }
  
  
  @Before("allGetters()") 
  public void secondAdvice() {
  System.out.println("Second Advice executed."); 
  }
  
  @Pointcut("execution(* get*())") 
  public void allGetters() {}
  
  @Pointcut("within(org.koushik.javabrains.model.*)") 
  public void allCircleMethods() {}
  
  
}
 
  
  
@Aspect 
public class LoggingAspect {
  
  @Before("allGetters() && allCircleMethods()") 
  public void LoggingAdvice() {
  System.out.println("Advice run. Get Method called"); 
  }
  
  
  @Before("allGetters()") 
  public void secondAdvice() {
  System.out.println("Second Advice executed."); 
  }
  
  @Pointcut("execution(* get*())") public void allGetters() {}
  
  @Pointcut("within(org.koushik.javabrains.model.Circle)") 
  public void allCircleMethods() {}
 
}

  
  
@Aspect 
public class LoggingAspect {
  
  @Before("allCircleMethods()") 
  public void LoggingAdvice(JoinPoint joinPoint) { 
        System.out.println(joinPoint.toString()); 
        }
  
  
  @Pointcut("execution(* get*())") 
  public void allGetters() {}
  
  @Pointcut("within(org.koushik.javabrains.model.Circle)") 
  public void allCircleMethods() {}
  
}
  
  
  
@Aspect 
public class LoggingAspect {
  
  @Before("allCircleMethods()") 
  public void LoggingAdvice(JoinPoint joinPoint) { 
  Circle circle = (Circle) joinPoint.getTarget(); 
  }
  
  
  @Pointcut("execution(* get*())") 
  public void allGetters() {}
  
  @Pointcut("within(org.koushik.javabrains.model.Circle)") 
  public void allCircleMethods() {}
  
}
  
  
@Aspect 
public class LoggingAspect {
  
  @Before("allCircleMethods()") 
  public void LoggingAdvice(JoinPoint joinPoint) {}
  
  @Before("args(String)") 
  public void stringArgumentMethods() {
  System.out.println("A method that takes String arguments has been called"); 
  }
  
  
  @Pointcut("execution(* get*())") 
  public void allGetters() {}
  
  @Pointcut("within(org.koushik.javabrains.model.Circle)") 
  public void allCircleMethods() {}
  
}

 
  
@Aspect 
public class LoggingAspect {
  
  @Before("allCircleMethods()") 
  public void LoggingAdvice(JoinPoint joinPoint) {}
  
  @Before("args(name)") 
  public void stringArgumentMethods(String name) {
  System.out.println("A method that takes String arguments has been called. The value is "+ name); 
  }
  
  
  @Pointcut("execution(* get*())") 
  public void allGetters() {}
  
  @Pointcut("within(org.koushik.javabrains.model.Circle)") 
  public void allCircleMethods() {}
  
}

  
  
@Aspect 
public class LoggingAspect {
  
  @Before("allCircleMethods()") 
  public void LoggingAdvice(JoinPoint joinPoint) {}
  
  
  @After("args(name)") 
  public void stringArgumentMethods(String name) {
  System.out.println("A method that takes String arguments has been called. The value is "+ name); 
  }
  
  
  @Pointcut("execution(* get*())") 
  public void allGetters() {}
  
  @Pointcut("within(org.koushik.javabrains.model.Circle)") 
  public void allCircleMethods() {}
 
}
  
  
  
@Aspect 
public class LoggingAspect {
  
  @Before("allCircleMethods()") 
  public void LoggingAdvice(JoinPoint joinPoint) {}
  
  @AfterReturning("args(name)") 
  public void stringArgumentMethods(String name) { 
    System.out.println("A method that takes String arguments has been called. The value is "+ name); 
    }
  
  
  @Pointcut("execution(* get*())") 
  public void allGetters() {}
  
  @Pointcut("within(org.koushik.javabrains.model.Circle)") 
  public void allCircleMethods() {}
  
}
  

  
@Aspect 
public class LoggingAspect {
  
  @Before("allCircleMethods()") 
  public void LoggingAdvice(JoinPoint joinPoint) {
  
  }
  
  @AfterReturning("args(name)") 
  public void stringArgumentMethods(String name){ 
  System.out.println("A method that takes String arguments has been called. The value is "+ name); 
  }
  
  @AfterThrowing("args(name") 
  public void exceptionAdvice(String name) {
  System.out.println("An exception has been thrown"); 
  }
  
  @Pointcut("execution(* get*())") 
  public void allGetters() {}
  
  @Pointcut("within(org.koushik.javabrains.model.Circle)") 
  public void allCircleMethods() {}
  
  
}

  
  
@Aspect 
public class LoggingAspect {
  
  @Before("allCircleMethods()") 
  public void LoggingAdvice(JoinPoint joinPoint) {
  
  }
  
  @AfterReturning(pointcut="args(name)", returning="returnString") 
  public void stringArgumentMethods(String name, String returnString) { 
    System.out.println("A method that takes String arguments has been called. The value is "+ name + "The output Value is "+ returnString); 
    }
  
  @AfterThrowing("args(name") 
  public void exceptionAdvice(String name) {
  System.out.println("An exception has been thrown"); 
  }
  
  @Pointcut("execution(* get*())") 
  public void allGetters() {}
  
  @Pointcut("within(org.koushik.javabrains.model.Circle)") public void allCircleMethods() {}
  
}

  
  
@Aspect 
public class LoggingAspect {
  
  @Before("allCircleMethods()") 
  public void LoggingAdvice(JoinPoint joinPoint) {
  
  }
  
  @AfterReturning(pointcut="args(name)", returning="returnString") 
  public void stringArgumentMethods(String name, Object returnString) { 
       System.out.println("A method that takes String arguments has been called. The value is "+ name + "The output Value is "+ returnString); 
       }
  
  @AfterThrowing(pointcut="args(name", throwing="ex") 
  public void exceptionAdvice(String name, Exception ex) {
  System.out.println("An exception has been thrown" + ex); 
  }
  
  @Pointcut("execution(* get*())") 
  public void allGetters() {}
  
  @Pointcut("within(org.koushik.javabrains.model.Circle)") 
  public void allCircleMethods() {}
  
}
 
  
  
@Aspect
public class LoggingAspect {

	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinPoint) {

	}

	@AfterReturning(pointcut = "args(name)", returning = "returnString")
	public void stringArgumentMethods(String name, Object returnString) {
		System.out.println("A method that takes String arguments has been called. The value is " + name
				+ "The output Value is " + returnString);
	}

	@AfterThrowing(pointcut = "args(name", throwing = "ex")
	public void exceptionAdvice(String name, Exception ex) {
		System.out.println("An exception has been thrown" + ex);
	}

	@Around("allGetters()")
	public void myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {

		try {
			System.out.println("Before advice");
			proceedingJoinPoint.proceed();
			System.out.println("After Returning");
		} catch (Throwable e) {
			System.out.println("After Throwing");
		}
		System.out.println("After Finally");
	}

	@Pointcut("execution(* get*())")
	public void allGetters() {
	}
	

	@Pointcut("within(org.koushik.javabrains.model.Circle)")
	public void allCircleMethods() {
	}

} 

  
  
@Aspect
public class LoggingAspect {

	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinPoint) {

	}

	@AfterReturning(pointcut = "args(name)", returning = "returnString")
	public void stringArgumentMethods(String name, Object returnString) {
		System.out.println("A method that takes String arguments has been called. The value is " + name
				+ "The output Value is " + returnString);
	}

	@AfterThrowing(pointcut = "args(name", throwing = "ex")
	public void exceptionAdvice(String name, Exception ex) {
		System.out.println("An exception has been thrown" + ex);
	}

	@Around("allGetters()")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		
		Object returnValue = null;
		try {
			System.out.println("Before advice");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("After Returning");
		} catch (Throwable e) {
			System.out.println("After Throwing");
		}
		System.out.println("After Finally");
		return returnValue;
	}
	

	@Pointcut("execution(* get*())")
	public void allGetters() {
	}
	

	@Pointcut("within(org.koushik.javabrains.model.Circle)")
	public void allCircleMethods() {
	}

} 
 
 
 
 @Aspect
public class LoggingAspect {

	@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinPoint) {

	}

	@AfterReturning(pointcut = "args(name)", returning = "returnString")
	public void stringArgumentMethods(String name, Object returnString) {
		System.out.println("A method that takes String arguments has been called. The value is " + name
				+ "The output Value is " + returnString);
	}

	@AfterThrowing(pointcut = "args(name", throwing = "ex")
	public void exceptionAdvice(String name, Exception ex) {
		System.out.println("An exception has been thrown" + ex);
	}

	@Around("@annotation(org.koushik.javabrains.aspect.Loggable)")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		
		Object returnValue = null;
		try {
			System.out.println("Before advice");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("After Returning");
		} catch (Throwable e) {
			System.out.println("After Throwing");
		}
		System.out.println("After Finally");
		return returnValue;
	}
	

	@Pointcut("execution(* get*())")
	public void allGetters() {
	}
	

	@Pointcut("within(org.koushik.javabrains.model.Circle)")
	public void allCircleMethods() {
	}

}



public class LoggingAspect {

	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		
		Object returnValue = null;
		try {
			System.out.println("Before advice");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("After Returning");
		} catch (Throwable e) {
			System.out.println("After Throwing");
		}
		System.out.println("After Finally");
		return returnValue;
	}
	

	public void allGetters() {
	}

}



public class LoggingAspect {

	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		
		Object returnValue = null;
		try {
			System.out.println("Before advice");
			returnValue = proceedingJoinPoint.proceed();
			System.out.println("After Returning");
		} catch (Throwable e) {
			System.out.println("After Throwing");
		}
		System.out.println("After Finally");
		return returnValue;
	}
	
	
	public void loggingAdvice() {
		System.out.println("Logging from the advice");
	}

}

 */