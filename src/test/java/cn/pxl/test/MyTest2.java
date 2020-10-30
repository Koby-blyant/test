package cn.pxl.test;

import cn.pxl.domain.Student;
import cn.pxl.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xlpeng
 * @create 2020-10-29-19:56
 */
public class MyTest2 {
    ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
    @Test
    public void testStudent(){
        Student studentOne= (Student) ac.getBean("studentOne");
        System.out.println(studentOne);
    }
}
