package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AOPHandle implements InvocationHandler{
	private AOPMethod aopMethod;
	private Object object;
	
	public AOPHandle(Object object,AOPMethod aopMethod) {
		// TODO Auto-generated constructor stub
		this.object = object;
		this.aopMethod  =aopMethod;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		//方法返回值
		Object ret = null;
		//切面前
		this.aopMethod.before(proxy, method, args);
		//反射调用方法
		ret = method.invoke(object, args);	
		//切面后
		this.aopMethod.after(proxy, method, args);	
		return ret;
	}

}
