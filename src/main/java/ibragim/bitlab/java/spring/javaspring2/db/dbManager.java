package ibragim.bitlab.java.spring.javaspring2.db;

import java.util.ArrayList;

public class dbManager {

    private static ArrayList<Student> students = new ArrayList<>();

    static Long id = 6L;

    static{
        students.add(new Student(1L, "Ibargim", "Uzhakhov", 10));
        students.add(new Student(2L, "Mukhammad", "Uzhakhov", 55));
        students.add(new Student(3L, "Safiya", "Uzhakhova", 85));
        students.add(new Student(3L, "Isa", "Uzhakhov", 75));
        students.add(new Student(4L, "Ali", "Uzhakhov", 55));
        students.add(new Student(5L, "Shamil`", "Uzhakhov", 65));
        students.add(new Student(6L, "Adam", "Uzhakhov", 95));
        students.add(new Student(7L, "Akhmed", "Uzhakhov", 35));
        students.add(new Student(8L, "Zelimkhan", "Uzhakhov", 65));
        students.add(new Student(9L, "Abu", "Uzhakhov", 45));
    }

    public static ArrayList<Student> getStudents(){
        return students;
    }

    public static void addStudent(Student student){
        if(student!=null){
            student.setId(id);
            students.add(student);
            id++;
        }
    }

    public static Student getStudent(Long id){
        Student s = null;
        for(Student st : students){
            if(st.getId() == id){
                id = st.getId();
                s = st;
                break;
            }
        }
        return s;
    }
}
