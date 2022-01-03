
import java.util.ArrayList;

/**
 * This class contains all the supporting methods
 * needed to create a school management system.
 **/

 public class School{

    /**
     * Declare all the variables as mentioned in the UML
    **/
	 private static int totalMoneyEarned;
	 private static int totalMoneySpent;
	 private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	 private ArrayList<Student> students = new ArrayList<Student>();
	 

    /**
     * Write the constructor as given in the UML
     * also initialize the remaining variables in the class.
    **/
public School() {
	totalMoneyEarned = 0;
	totalMoneySpent = 0;
	this.teachers = null;
	this.students = null;
}

public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {

	this.teachers = teachers;
	this.students = students;
	totalMoneyEarned = 0;
	totalMoneySpent = 0;
}

    /**
     * return the teachers in the school
    **/
public ArrayList<Teacher> getTeachers() {
	return this.teachers;
}

    /**
     * add a teacher to the school
    **/
public void addTeacher(Teacher teacher) {
	teachers.add(teacher);
}

    /**
     * return the number of students in the school
    **/
public ArrayList<Student> getStudents() {
	return this.students;
}

    /**
     * add a student to the school
    **/
public void addStudent(Student student) {
	students.add(student);
}

    /**
     * return the total money earned by the school
    **/
public int getTotalMoneyEarned() {
	return totalMoneyEarned;
}

    /**
     * return the total money spent by the school
    **/
public int getTotalMoneySpent() {
	return totalMoneySpent;
}

    /**
     * update the money earned by the School
     * In this method you will add the moneyEarned (passed by parameter)
     * to the total money earned
     * The money earned will be updated whenever the fees is collected by the students
    **/
public static void updateTotalMoneyEarned(int salary) {
	totalMoneyEarned += salary;
}

    /**
     * update the money spent by the School
     * In this method you will add the moneySpent (passed by parameter)
     * to the total money spent
     * The money spent will be updated whenever the salary is issued to the teachers
    **/
public static void updateTotalMoneySpent(int salary) {
	totalMoneySpent += salary;
}

}
