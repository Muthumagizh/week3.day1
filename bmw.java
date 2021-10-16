package week3.day1;

public class bmw extends cars {
	public static void main(String[] args) {
		bmw b=new bmw();
		b.drivevehicle();
		b.accelarate();
		b.applybrake();
		b.fillfuel();
		b.shiftgear();
		b.closeDoor();
		b.enableAirbag();
		
		audi a=new audi();
		a.drivevehicle();
		a.accelarate();
		a.applybrake();
		a.fillfuel();
		a.shiftgear();
		a.closeDoor();
		a.enableAirbag();
	}
	

}
