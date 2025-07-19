public class pro1{
public static void main(String[] args){

	int n = 10;
	int count = 0;
	int num = 2;

	System.out.println("First" + n + "prime number are:");
		while (count<n){
		if(isPrime(num)){
	System.out.print(num + "");
	count++;
		}
	num++;
	}
}

public static boolean isPrime(int num){
	if(num<2)
	return false;
		for(int i=2;i<=num/2;i++){
		if(num%i==0)
		return false;
		}
	return true;
	}
}