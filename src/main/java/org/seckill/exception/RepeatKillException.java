package org.seckill.exception;

/**
 * 重复秒杀异常(运行期异常)
 *
 * @author zxlei1
 * @date 2018/11/29 19:07
 */
public class RepeatKillException extends SeckillException{

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
