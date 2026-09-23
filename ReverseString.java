import java.util.*;
public class ReverseString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter a no: ");
		// int n = sc.nextInt();
		// int reverse = 0;
		// while(n > 0){
		// 	int digit = n % 10;
		// 	reverse =( reverse * 10) + digit;
		// 	 n = n / 10;
		// }
		// System.out.println("Reverse: "+ reverse);
		System.out.println("Enter a string want to reverse: ");
		String name = sc.nextLine();


		String reverse = "";


		for(int i = name.length() - 1; i >= 0; i--){
			reverse += name.charAt(i);
		}
		System.out.println(reverse);
	}
}

