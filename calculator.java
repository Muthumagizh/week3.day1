package week3.day1;

public class calculator {
	public void add(int a, int b) {

		int sum = a + b;
		System.out.println(sum);
	}

	public void add(int a, int b, int c) {

		int sum = a + b + c;
		System.out.println(sum);
	}

	public void multiply(int a, int b) {

		int mul = a * b;
		System.out.println(mul);
	}

	public void multiply(int a, double b) {

		double mul = a * b;
		System.out.println(mul);
	}
	
	public void sub(int a, int b) {

		int sub = a - b;
		System.out.println(sub);
	}

	public void sub(int a, double b) {

		double sub = a-b;
		System.out.println(sub);
	}
	public void div(int a, int b) {

		int div = a / b;
		System.out.println(div);
	}

	public void div(int a, double b) {

		double div = a / b;
		System.out.println(div);
	}
	public static void main(String[] args) {
		calculator cal=new calculator();
		cal.div(3,5.5);
		cal.div(3,5);
		cal.add(2, 3, 4);
		cal.add(5, 5);cal.sub(6, 5.50);
		cal.sub(10,11);
		cal.multiply(11, 22.5);
		cal.multiply(11, 22);
		
		

	}
}
