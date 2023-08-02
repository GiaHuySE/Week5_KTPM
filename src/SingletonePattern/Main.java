package SingletonePattern;

public class Main {
	public static void main(String[] args) {
		Singletone x = Singletone.getInstance("Hello world");
		Singletone y = Singletone.getInstance1();
		y.setS("Hello");
		System.out.println((y.getS())); 
	}
}
