package aop;

import java.lang.reflect.Method;

public class AOPTest {

	public static void main(String[] args) {
		
		LogInterface logInterface = LogFactory.getLog(LogImp.class,new AOPMethod() {

			@Override
			public void before(Object proxy, Method method, Object[] args) {
				// TODO Auto-generated method stub
				//可在此拦截自定义方法
				System.out.println("------------before:"+method.getName()+"------------");
			}
			
			@Override
			public void after(Object proxy, Method method, Object[] args) {
				// TODO Auto-generated method stub
				System.out.println("------------after:"+method.getName()+"------------\n");
			}
		});
		
		logInterface.log_info();
		logInterface.log_warn();
		logInterface.log_error();
		logInterface.log_fatal();
	}
	
}
