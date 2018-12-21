package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器
 * spring-test，jUnit
 *
 * @author zxlei1
 * @date 2018/11/24 13:50
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {

    //注入Dao实现类的依赖
    @Autowired
    private SeckillDao seckillDao;


    /**
     *
     *14:52:23.242 [main] DEBUG o.m.s.t.SpringManagedTransaction - JDBC Connection [com.mchange.v2.c3p0.impl.NewProxyConnection@f43c82] will not be managed by Spring
     *14:52:23.246 [main] DEBUG o.s.dao.SeckillDao.reduceNumber - ==>  Preparing: update seckill set number =number -1 where seckill_id = ? and start_time <= ? and end_time >= ? and number >0;
     *14:52:23.283 [main] DEBUG o.s.dao.SeckillDao.reduceNumber - ==> Parameters: 1(Long), 2018-11-24 14:52:22.972(Timestamp), 2018-11-24 14:52:22.972(Timestamp)
     *
     */

    @Test
    public void reduceNumber() {
        Date killTime = new Date();
        int updateCount = seckillDao.reduceNumber(1, killTime);
        System.out.println("updateCount: " + updateCount);
    }

    @Test
    public void queryById() {
        long id = 2;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
    }

    /**
     * java沒有保存形参的记录
     */
    @Test
    public void queryAll() {
        List<Seckill> seckills = seckillDao.queryAll(0, 100);
        System.out.println(seckills.toString());
    }
}