class Sample{
static void name(){
		System.out.println("Yash");
	}
}
class Main extends Sample{
	@Override
	static void name(){
		System.out.println("Gawande");
	}
}
class AbstractExample{

	public static void main(String[] args) {
		Main m = new Main();
		m.name();
		Main.name();
		Sample.name();
	
		
	}
}