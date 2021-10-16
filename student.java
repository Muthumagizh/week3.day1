package week3.day1;

public class student extends department{
	public void studentName() {
		System.out.println("studentName");
		}
	public void studentDept() {
		System.out.println("studentDept");
		}
	public void studentId() {
		System.out.println("studentId");
		}
	public static void main(String[] args) {
		student stud = new student();
		stud.collegeDept();
		stud.collegeId();
		stud.collegeName();
		stud.deptname();
		stud.studentDept();
		stud.studentId();
		stud.studentName();
	}
}
