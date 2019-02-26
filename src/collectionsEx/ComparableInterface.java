package collectionsEx;

public class ComparableInterface {

	public static void main(String[] args) {
		
		class Student1 implements Comparable<Student1>{
			
			int rollNo;
			String name;
			int age;
			Student1(int rollno,String name, int age){
				this.rollNo=rollno;
				this.name=name;
				this.age=age;
			}

			@Override
			public int compareTo(Student1 st) {
				// TODO Auto-generated method stub
				if(age==st.age)
					return 0;
				else if(age>st.age)
				return 1;
				else
					return -1;
			}
			
		}
	}

}
