package com.spring.springJDBC.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program worked successfully !!!!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springJDBC/springjdbc/config.xml");
        JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        String query="insert into student (id, name, city) values (?,?,?)";
        
        int result=template.update(query,234,"vaibhav","Sangaon");
        System.out.println("no of records inserted successfully  "+result);
    }
}
