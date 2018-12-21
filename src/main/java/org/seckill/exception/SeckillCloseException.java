package org.seckill.exception;


/**
 * 秒杀关闭异常
 *
 * @author zxlei1
 * @date 2018/11/29 19:08
 */
public class SeckillCloseException extends SeckillException {
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
