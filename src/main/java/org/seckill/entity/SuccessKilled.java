package org.seckill.entity;

import java.util.Date;

/**
 * 秒杀成功表
 *
 * @author zxlei1
 * @date 2018/11/11 19:38
 */
public class SuccessKilled {

    private long seckillId;

    private long userPhone;

    private short status;

    private Date createTime;

    //变通
    //多对一
    private Seckill seckill;


    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public short getStatus() {
        return status;
    }

    public void setStatus(short status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckillId=" + seckillId +
                ", userPhone=" + userPhone +
                ", status=" + status +
                ", createTime=" + createTime +
                '}';
    }
}
