package week3.day1;

public class Assignement7_2 {
public static void main(String[] args) {
	String Str1="I am Learning Java"; 
	String Str2="I am learning java";
	
	if (Str1==Str2) {
		System.out.println("String equal");
		
	}
	else {System.out.println("different");}
	
	if(Str1.equals(Str2)) {System.out.println("equals using equals method");}
	else{System.out.println("not equals using equals method");}
	if(Str1.equalsIgnoreCase(Str2)) {System.out.println("equals using equals ignore case method");}
	else{System.out.println("not equals using equals ignore case method");}
}
}
