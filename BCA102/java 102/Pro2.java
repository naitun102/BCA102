public class Pro2 {
	public static void main(String[] args){
	   int a=10,b=25,c=15;

int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
	System.out.println("Maximum of" + a + ", " + b + " and " + c + " is: " + max);
	}
}