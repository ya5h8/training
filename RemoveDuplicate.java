import java.util.*;
class RemoveDulicate{
	public static void main(String[] args) {
		int[] arr = {22,34,134,1334,635,22};
		HashSet<Integer> set = new HashSet<>();
	
		for(int e : arr){
			if(!set.contains(e)){
				set.add(e);
				System.out.println(e);
		}
	}
}
}
