package daopattern;

public class DaoPatternDemo {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        //print all students
        for(Student student : studentDao.getAllStudents()){
            System.out.println("Student: [ RollNo : " + student.getRollNo() + ", Name : " + student.getName()
                                + " ]");
        }

        //update student
        Student student = studentDao.getStudent(0);
        student.setName("Philip");
        studentDao.updateStudent(student);

        //get the student
        Student student1 = studentDao.getStudent(0);
        System.out.println("Student: [ RollNo : " + student1.getRollNo() + ", Name : " + student1.getName()
                + " ]");
    }

}
