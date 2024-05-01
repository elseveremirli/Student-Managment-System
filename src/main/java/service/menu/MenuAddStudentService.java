package service.menu;

import com.elseveremirli.bean.Config;
import com.elseveremirli.bean.Student;
import com.elseveremirli.util.FileUtility;
import service.inter.MenuAddStudentServiceInter;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {
    @Override
    public void process() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        String name = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter surname");
        String surname = scanner1.nextLine();

        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);

        Config.instance().appendStudent(student);
        System.out.println("added student");

        Config.save();

    }
}
