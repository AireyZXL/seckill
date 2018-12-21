package org.seckill.exception;

/**
 * 秒杀相关的业务异常
 *
 * @author zxlei1
 * @date 2018/11/29 19:10
 */
public class SeckillException  extends  RuntimeException{


    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }

}
