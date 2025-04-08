package console.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // calling file system bean factory
        // BeanFactory beanFactory = new FileSystemXmlApplicationContext("spring-dispatcher.xml");
        // Professor professor = beanFactory.getBean("professor3", Professor.class);
        // System.out.println(professor);

        // calling classpath bean factory
        // dependency injection
        ApplicationContext factory = new ClassPathXmlApplicationContext("myfactory.xml");
        ProfessorList professorList = factory.getBean("academic",ProfessorList.class);
        System.out.println(professorList);
    }
}
