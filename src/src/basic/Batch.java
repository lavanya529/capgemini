package basic;

public class Batch {

	public static void main(String[] args) {
		Student s1= new Student();
		s1.setName("rahul");
		s1.setRoll(223);
		s1.setFees(50000);
		s1.setCollege("vjit");
		
		Student s2= new Student();
		s2.setName("rahul");
		s2.setRoll(223);
		s2.setFees(50000);
		s2.setCollege("vjit");
		
		Student s3= new Student();
		s3.setName("rahul");
		s3.setRoll(223);
		s3.setFees(50000);
		s3.setCollege("cbit");
		
		
		
		//System.out.println(s1.getName());
		//System.out.println(s1.getRoll());
		//System.out.println(s1.getFees());
		System.out.println(s1.getCollege());
		System.out.println(s2.getCollege());
		System.out.println(s3.getCollege());
	}

}
