class Anagram{
	public static void main(String[] args) {
		String str1 = "Yash";
		String str2 = "UISR";
			
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1,ch2);
		if(Arrays.equals(ch1,ch2)){
			System.out.println("anagram");
		}else{
			System.out.println("not anagram");
		}
	}
}