package daopattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao{

    List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<Student>();
        Student student = new Student("Rob",0);
        students.add(student);
        student = new Student("John",1);
        students.add(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll no " + student.getRollNo() + " updated");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll no " + student.getRollNo() + " removed");
    }
}
