package com.spring.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "My program worked successfully !!!!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/dao/config.xml");
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        
//        Student student=new Student();
//        student.setId(234);
//        student.setName("Akshay");
//        student.setCity("Bidri");
        
        //int result=studentDao.insert(student);
//        int result=studentDao.change(student);
//        System.out.println(result +" no of rows updated.....");
        
//        int result=studentDao.delete(233);
//        System.out.println(result +" no of entries deleted successfully....");
        
        Student student=studentDao.getStudent(232);
        System.out.println(student);
    }
}
