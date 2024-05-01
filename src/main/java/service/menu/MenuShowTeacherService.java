package service.menu;

import com.elseveremirli.bean.Config;
import com.elseveremirli.bean.Student;
import com.elseveremirli.bean.Teacher;
import service.inter.MenuShowTeacherServiceInter;

public class MenuShowTeacherService implements MenuShowTeacherServiceInter {
    @Override
    public void process() {
        Teacher[] allTeahcer = Config.instance().getTeachers();
        for (Teacher teacher : allTeahcer) {
            System.out.println(teacher);
        }
    }
}
