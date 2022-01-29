
public class TypeCasting {
	public static void main(String[] args) {
//widening, small-> big, implicit, automatic
	byte age = 58;
	int new_age = age;
	System.out.println(new_age);
	
	//narrowing, big-> small, explicit, manual
	
	int salary = 20000;
	short new_salary = (short) salary;
	System.out.println(new_salary);
	
	float per = 91.2f;
	int new_per = (int) per;
	System.out.println(new_per);
	
	
}
}