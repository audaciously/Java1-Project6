public class Teacher{

    /**
     * Declare all the variables as mentioned in the UML
    **/
private int id;
private String name;
private int salary;
private int salaryEarned;

    /**
     * Write the constructor as given in the UML
     *
    **/
public Teacher() {
	this.id = 0;
	this.name = "";
	this.salary = 0;
	this.salaryEarned = 0;
}

public Teacher(int id, String name, int salary) {
	this.id = id;
	this.name = name;
	this.salary = salary;
}

    /**
     * return the number of id of the teacher
    **/
public int getId() {
	return this.id;
}

    /**
     * add a teacher's id to the school
    **/
public void setId(int id) {
	this.id = id;
}

    /**
     * return the name of the teachers in the school
    **/
public String getName() {
	return this.name;
}

    /**
     * add the teacher name to the school
    **/
public void setName(String name) {
	this.name = name;
}

    /**
     * return the salary of the teachers in the school
    **/
public int getSalary() {
	return this.salary;
}

    /**
     * add the salary of teacher to the school
    **/
public void setSalary(int salary) {
	this.salary = salary;
}

    /**
     * Adds to salaryEarned.
     * Which means the school is spending money.
     * Therefore, update appropriate funds to the school.
     * @param salary
    **/
public void receiveSalary(int salary) {
	this.salaryEarned +=salary;
	School.updateTotalMoneySpent(salary);
}

    /**
     * Display method
    **/

    public String displayInfo(){
        return "Name of the teacher: " + name +
                " Total salary earned so far: $" + salaryEarned;
    }
}
