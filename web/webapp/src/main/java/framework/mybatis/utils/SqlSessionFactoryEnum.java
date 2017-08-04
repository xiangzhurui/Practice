package framework.mybatis.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 
 * @author XZR
 * @version 2016.07.28
 */
public enum SqlSessionFactoryEnum {
    INSTANCE;

    private SqlSessionFactory factory;

    private SqlSessionFactoryEnum() {
        System.out.println(System.currentTimeMillis());
        String resource = "mybatis/mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(inputStream);
    }

    public SqlSessionFactory getFactory() {
        return factory;
    }
}