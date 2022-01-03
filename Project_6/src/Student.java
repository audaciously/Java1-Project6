public class Student{

    /**
     * Declare all the variables as mentioned in the UML
    **/
private int id;
private String name;
private char grade;
private int feesPaid;
private int feesTotal;

    /**
     * Write the constructor as given in the UML
     * Also initialize remaining variables which belong to the class.
     * For example, you have to initialize the feesPaid of a student to 0
    **/
public Student() {
	this.id = 0;
	this.name = "";
	this.grade = '\0';
	this.feesPaid = 0;
	this.feesTotal = 0;
}

public Student(int id, String name, int feesTotal) {
	this.id = id;
	this.name = name;
	this.feesTotal = feesTotal;
}

    /**
     * return the number of id of the student
    **/
public int getId() {
	return this.id;
}

    /**
     * add a student's id to the school
    **/
public void setId(int id) {
	this.id = id;
}

    /**
     * return the name of the student in the school
    **/
public String getName() {
	return this.name;
}

    /**
     * add the student name to the school
    **/
public void setName(String name) {
	this.name = name;
}

    /**
     * @return the fees paid by the student
    **/
public int getFeesPaid() {
	return this.feesPaid;
}

	/**
     * @return the total fees of the student
    **/
public int getFeesTotal() {
	return this.feesTotal;
}

    /**
     *
     * @return the grade of the student.
    **/
public char getGrade() {
	return this.grade;
}

    /**
     * Used to update the student's grade.
     * @param grade new grade of the student.
    **/
public void setGrade(char grade) {
	this.grade = grade;
}

    /**
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the fees paid.
     * The school is going receive the funds,
	 * Therefore, update appropriate funds to the school.
     * @param fees the fees that the student pays.
    **/
public void payFees(int feesPaid) {
	this.feesPaid += feesPaid;
	School.updateTotalMoneyEarned(feesPaid);
}

    /**
     *
     * @return the remaining fees.
    **/
public int getRemainingFees() {
	
	return (this.feesTotal - this.feesPaid);
}

    /**
     * Display method
    **/
    public String displayInfo(){
        return "Name of the Student: " + name +
                " Remaining fees to be paid: $" + getRemainingFees();
    }
}
