package basic;

public class Student1 implements Comparable<Student1>{
	private String name;
	private int roll;
	private double fees;
	
	public Student1(int i, String stringg, double j) {
		// TODO Auto-generated constructor stub
		this.roll=i;
		this.name=stringg;
		this.fees=j;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;    
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	
	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		return 0;
	}
			
}
