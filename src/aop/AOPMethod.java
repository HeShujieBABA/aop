package aop;

import java.lang.reflect.Method;

public interface AOPMethod {
	//实例执行前
	void after(Object proxy,Method method,Object[] args);
	//实例执行后
	void before(Object proxy,Method method,Object[] args);
}
