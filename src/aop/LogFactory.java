package aop;

import java.lang.reflect.Proxy;

public class LogFactory {
	
	@SuppressWarnings("unused")
	private static Object getAnimalBase(Object object,AOPMethod aopMethod) {
		return Proxy.newProxyInstance(object.getClass().getClassLoader(), 
				object.getClass().getInterfaces(), new AOPHandle(object,aopMethod));
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getAnimal(Object object,AOPMethod aopMethod) {
		return (T) getAnimalBase(object,aopMethod);
	}
	
	@SuppressWarnings({ "unused", "unchecked" })
	private static <T> T getAnimal(String className,AOPMethod aopMethod) {
		Object object = null;
		try {
			object = getAnimalBase(Class.forName(className).newInstance(),aopMethod);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return (T) object;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> T getAnimal(Class cls,AOPMethod aopMethod) {
		Object object = null;
		try {
			object = getAnimalBase(cls.newInstance(),aopMethod);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return (T)object;
	}
}
