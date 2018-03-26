package aop;

import java.lang.reflect.Proxy;

public class LogFactory {
	
	@SuppressWarnings("unused")
	private static Object getLogBase(Object object,AOPMethod aopMethod) {
		return Proxy.newProxyInstance(object.getClass().getClassLoader(), 
				object.getClass().getInterfaces(), new AOPHandle(object,aopMethod));
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getLog(Object object,AOPMethod aopMethod) {
		return (T) getLogBase(object,aopMethod);
	}
	
	@SuppressWarnings({ "unused", "unchecked" })
	private static <T> T getLog(String className,AOPMethod aopMethod) {
		Object object = null;
		try {
			object = getLogBase(Class.forName(className).newInstance(),aopMethod);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return (T) object;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> T getLog(Class cls,AOPMethod aopMethod) {
		Object object = null;
		try {
			object = getLogBase(cls.newInstance(),aopMethod);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return (T)object;
	}
}
