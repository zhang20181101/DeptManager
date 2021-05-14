package com.zwl.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.InputStream;

/**
 * @author Zhang Weilei
 * @Program SqlSessionFactoryUtil
 * @create 2021-05-12 16:46
 * @Description: TODO
 */

public class SqlSessionFactoryUtil {

    private static SqlSessionFactory sqlSessionFactory;

    static{
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession openSession(boolean temp){
        return sqlSessionFactory.openSession(temp);
    }

}
