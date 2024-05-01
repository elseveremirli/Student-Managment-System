package service.menu;

import com.elseveremirli.bean.Config;
import com.elseveremirli.bean.Student;
import com.elseveremirli.bean.Teacher;
import service.inter.MenuAddTeacherServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {
    @Override
    public void process() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter teacher name");
        String name = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter teacher password");
        String surname = scanner1.nextLine();

        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setSurname(surname);

        Config.instance().appendTeacher(teacher);
        System.out.println("teacher added");
    }
}
