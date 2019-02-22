package exception;

public class MultiCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=17;
int arr[]= {2,4,3,5};
System.out.println("start");

try {
	System.out.println(arr[7]);
	System.out.println(a/0);
	
	
} catch (ArithmeticException e) {
          System.out.println(e);

	} catch (NullPointerException e) {
	
		System.out.println(e);
	}catch(Exception e) {
		System.out.println("mother exception");

}
System.out.println("end");
}
}