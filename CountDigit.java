public class CountDigit{
	public static void main(String[] args) {
		int num = 34545460;
		int count = 0;
		if(num == 0){
			count = 1;
		}
		while(num != 0){
			int digit = num % 10;
			count++;
			num = num / 10;
		}
		System.out.println(count);
	}
}
