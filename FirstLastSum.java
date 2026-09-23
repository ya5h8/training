class FirstLastSum{
	public static void main(String[] args) {
		int n = 123456789;
		int last = n % 10;
		int first = n / 100000000;
		int sum = first + last ;

		System.out.println(sum);
	}
}