package com.elseveremirli.bean;

import java.io.Serializable;

public class Config implements Serializable {
    private static Config config = null;
    private Student[] students= new Student[0];
    private Teacher[] teachers= new Teacher[0];
    private static boolean loggedIn = false;

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }


    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }



    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void appendStudent(Student student) {
        Student[] newStudets = new Student[students.length+1];
        for(int i=0; i<students.length;i++){
            newStudets[i] = students[i];
        }
        newStudets[newStudets.length-1] = student;
        students = newStudets;
    }
    public void appendTeacher(Teacher teacher) {
        Teacher[] newTeacher = new Teacher[teachers.length+1];
        for(int i=0; i<teachers.length;i++){
            newTeacher[i] = teachers[i];
        }
        newTeacher[newTeacher.length-1] = teacher;
        teachers = newTeacher;
    }

    public static Config instance(){
       if(config==null){
           config = new Config();
       }
       return config;
    }

}
