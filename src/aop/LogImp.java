package aop;

public class LogImp implements LogInterface{

	@Override
	public void log_info() {
		// TODO Auto-generated method stub
		System.out.println("log_info:"+"һ�㼶����־��Ϣ��¼");
	}

	@Override
	public void log_warn() {
		// TODO Auto-generated method stub
		System.out.println("log_warn:"+"���漶����־��Ϣ��¼");
	}

	@Override
	public void log_error() {
		// TODO Auto-generated method stub
		System.out.println("log_error:"+"���󼶱���־��Ϣ��¼");
	}

	@Override
	public void log_fatal() {
		// TODO Auto-generated method stub
		System.out.println("log_fatal:"+"����������־��Ϣ��¼");
	}
	
}
