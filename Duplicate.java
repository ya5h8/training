import java.util.*;
class Duplicate{
	public static void main(String[] args) {
		int arr[] = { 12,34,5,56,768,78,12,345,67,78};
		HashSet<Integer> set = new HashSet<>();
		for(int e : arr){
			if(set.contains(e)){
				System.out.println("Duplicate : "+e);

			}else{
				set.add(e);
			}
		}
	}
}
