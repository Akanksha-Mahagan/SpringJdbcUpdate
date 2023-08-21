package test;

import org.mahagan.Dao.ProjectDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        ProjectDao projectDao = applicationContext.getBean("projectDao", ProjectDao.class);
        int rowCount = projectDao.UpdateProject(1, "org/mahagan/Dao");
        System.out.println("Update our row sucessfully" + rowCount);
    }
}