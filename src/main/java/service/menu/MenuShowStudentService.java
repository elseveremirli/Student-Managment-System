package service.menu;

import com.elseveremirli.bean.Config;
import com.elseveremirli.bean.Student;
import service.inter.MenuShowStudentServiceInter;

public class MenuShowStudentService implements MenuShowStudentServiceInter {
    @Override
    public void process() {
        Student[] allStudent = Config.instance().getStudents();
        for (Student student : allStudent) {
            System.out.println(student);
        }
    }
}
