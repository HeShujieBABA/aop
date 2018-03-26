package aop;

public class LogImp implements LogInterface{

	@Override
	public void log_info() {
		// TODO Auto-generated method stub
		System.out.println("log_info:"+"一般级别日志信息记录");
	}

	@Override
	public void log_warn() {
		// TODO Auto-generated method stub
		System.out.println("log_warn:"+"警告级别日志信息记录");
	}

	@Override
	public void log_error() {
		// TODO Auto-generated method stub
		System.out.println("log_error:"+"错误级别日志信息记录");
	}

	@Override
	public void log_fatal() {
		// TODO Auto-generated method stub
		System.out.println("log_fatal:"+"致命级别日志信息记录");
	}
	
}
