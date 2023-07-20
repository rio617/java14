package java14;

public class Hero {
	String name;

	@Override
	public String toString() {
		return "Hero [name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Hero) {
			return this.name.equals(((Hero) obj).name);
		}
		return false;
	}

}
