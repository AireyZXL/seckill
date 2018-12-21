package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * TODO
 *
 * @author zxlei1
 * @date 2018/11/24 14:56
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {
    @Autowired
    private SuccessKilledDao succDao;


    @Test
    public void insertSuccessKilled() {
        long id = 3;
        long phone = 18883179959L;
        int insertCount = succDao.insertSuccessKilled(id, phone);
        System.out.println("insertCount: " + insertCount);

    }

    @Test
    public void queryByIdWithSeckill() {
        long id=2;
        long phone=18883179959L;
        SuccessKilled successKilled=succDao.queryByIdWithSeckill(id,phone);
        System.out.println(successKilled);

    }
}