package SingletonePattern;

public class Singletone {
	private static Singletone instance = null;
	private String s;
	public Singletone(String s) {
		super();
		this.setS(s);
	}
	
	public static Singletone getInstance(String s) {
		if(instance ==null ) {
			instance = new Singletone(s);
		}
		return instance;
	}
	
	public static Singletone getInstance1() {
		if(instance ==null ) {
			instance = new Singletone();
		}
		return instance;
	}

	public Singletone() {
		super();
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
}
