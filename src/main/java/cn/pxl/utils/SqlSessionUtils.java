package cn.pxl.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xlpeng
 * @create 2020-10-29-19:58
 */
public class SqlSessionUtils {
    private static SqlSessionFactory factory;
    private static String config="applicationContext.xml";
    static {
        try {
            InputStream is = Resources.getResourceAsStream(config);
            factory= new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        SqlSession ss=null;
        if (factory!=null) {
            ss= factory.openSession();
        }
        return ss;
    }
}
