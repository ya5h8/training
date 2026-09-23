import java.util.Scanner;
class PrimeNo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no you want to check if it is prime or not: ");
		int n = sc.nextInt();

		boolean isPrime = true;

		if(n <= 1){
				isPrime = false;

		}
		for(int i =2; i<n; i++){
			if(i % n == 0){
				isPrime = false;		
			}
		}
		if(isPrime){
			System.out.println("prime no ");
		}else{
			System.out.println("Not prime no");
		}
	}
}