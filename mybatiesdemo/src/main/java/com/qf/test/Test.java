package com.qf.test;

import com.qf.dao.FcOrderDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) {

        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession sqlSession = sqlSessionFactory.openSession();

            FcOrderDao mapper = sqlSession.getMapper(FcOrderDao.class);



        } catch (IOException e) {
            e.printStackTrace();
        }





    }
}
