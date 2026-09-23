class Palindrome{
	public static void main(String[] args) {
		// String name= "madamt";
		// String reverse = "";

		// for(int i = name.length() -1; i >=0; i--){
		// 	reverse = reverse + name.charAt(i);
		// }
		// if(name.equals(reverse)){
		// 	System.out.println("yes it is palindrome");
		// }else{
		// 	System.out.println("not palindrome");
		// }

		int n = 121;
		int reverse = 0;
		int og = n;

		while(n > 0){
			int digit = n % 10;
			reverse = (reverse *10) + digit;
			n = n /10;
		}
		if(reverse == og){
			System.out.println("Yess");
		}else{
			System.out.println("Not");	
		}
	}

}