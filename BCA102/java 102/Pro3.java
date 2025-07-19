import java.util.Scanner;

public class Pro3{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
int n, num;
int max = Integer.MIN_VALUE;
int secondMax = Integer.MIN_VALUE;

	System.out.print("Enter how many numbers: ");
n = sc.nextInt();
	System.out.print("Enter" + n +" numbers:");
for(int i = 0; i< n; i++){
 num = sc.nextInt();

	if(num > max){
	secondMax = max;
	max = num;
	}else if(num > secondMax && num != max){
	secondMax = num;
	}
}
	System.out.print("Second Maximum is: " + secondMax);
	}
}