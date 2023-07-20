package java14;

public class Main {

	public static void main(String[] args) {
		Hero h=new Hero();
		h.name="川嶋";
		Hero h2=new Hero();
		h2.name="川嶋";
		
		System.out.println(h.equals(h2));
		
		Object o=new Hero();

	}

}
