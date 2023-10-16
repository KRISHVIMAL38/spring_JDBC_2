package com.spring.dao2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "My program worked successfully !!!!" );
        //ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/dao2/config.xml");
    	ApplicationContext context=	new AnnotationConfigApplicationContext(JavaConfig.class);
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
        
        //Student student=studentDao.getStudent(232);
        
        List<Student>students=studentDao.getAllStudents();
        System.out.println(students);
    }
}
