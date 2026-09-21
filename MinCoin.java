
public class MinCoin{
	public int minimumCoin(int[] coin, int amount){
		if(amount == 0) return 0;
		if(amount < 0) return -1;
		int mcoin = Integer.MAX_VALUE; 
		for(int c : coin){
			int result = minimumCoin(coin, amount - c);

			if(result >= 0){
				mcoin = Math.min(mcoin, 1 + result);
			}
		}
		return mcoin;
	}
	public static void main(String[] args) {
		int[] coin = {1,3,4};
		int amount = 6;


		MinCoin mc = new MinCoin();
		int ans = mc.minimumCoin(coin, amount);
		System.out.println(ans);
	
	}
}