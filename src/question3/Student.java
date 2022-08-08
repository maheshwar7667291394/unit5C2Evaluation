package question3;

public class Student {
	private int RollNo;
	private int marks;
	private String Name;

	

	public Student() {
		
	}



	public Student(int rollNo, int marks, String name) {
		super();
		RollNo = rollNo;
		this.marks = marks;
		Name = name;
	}



	public int getRollNo() {
		return RollNo;
	}



	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", marks=" + marks + ", Name=" + Name + "]";
	}

	

}
