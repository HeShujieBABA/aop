package aop;

public interface LogInterface {

/**
 * һ�㼶����־��Ϣ��¼����
 */
abstract public void log_info();

/**
 * ���漶����־��Ϣ��¼����
 */
abstract public void log_warn();

/**
 * ���󼶱���־��Ϣ��¼����
 */
abstract public void log_error();

/**
 * ����������־��Ϣ��¼����
 */
abstract public void log_fatal();
}
