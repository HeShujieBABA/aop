package aop;

public interface LogInterface {

/**
 * 一般级别日志信息记录函数
 */
abstract public void log_info();

/**
 * 警告级别日志信息记录函数
 */
abstract public void log_warn();

/**
 * 错误级别日志信息记录函数
 */
abstract public void log_error();

/**
 * 致命级别日志信息记录函数
 */
abstract public void log_fatal();
}
