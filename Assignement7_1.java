package week3.day1;

public class Assignement7_1 {
public static void main(String[] args) {
	String text = "Java Exercise";
	char[] chartext= text.toCharArray();
	for(int i=0;i<text.length();i++)
	{
				if (chartext[i]=='e' ||chartext[i]=='E' ) {
			System.out.println("index of "+ chartext[i]+ i);			
		}
	}
}
}
