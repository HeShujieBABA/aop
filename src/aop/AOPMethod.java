package aop;

import java.lang.reflect.Method;

public interface AOPMethod {
	//ʵ��ִ��ǰ
	void after(Object proxy,Method method,Object[] args);
	//ʵ��ִ�к�
	void before(Object proxy,Method method,Object[] args);
}
