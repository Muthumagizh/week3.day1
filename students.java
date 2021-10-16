package week3.day1;

public class students {
	public void getStudentInfo(int id) {
		System.out.println(id);

	}
	public void getStudentInfo(int id,String name, String email, long phone) {
		System.out.println(id+name+email+phone);

	}
	
	public static void main(String[] args) {
		students stud=new students();
		stud.getStudentInfo(1234);
		stud.getStudentInfo(1234, "Muthu", "mail2muthukumaran@gmail.com", 829887213712l);
	}
}
