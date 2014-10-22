package pattern.singlenton;

public class SingletonClass {
	private static SingletonClass instance;

	public SingletonClass() {
	}

	public static SingletonClass getInstance() {
		return instance;
	}

	public String getSomeString() {
		return "Some string ...";
	}
}
