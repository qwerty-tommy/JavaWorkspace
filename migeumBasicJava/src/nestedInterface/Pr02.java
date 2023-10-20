package nestedInterface;

public class Pr02 {
	class InstanaceInner02 {
	}

	static class StaticInner02 {
	}

	InstanaceInner02 iv = new InstanaceInner02();
	static StaticInner02 cv = new StaticInner02();

	static void staticMethod() {
		// InstanaceInner obj=new InstanaceInner();
		StaticInner02 obj2 = new StaticInner02();

		Pr02 outer = new Pr02();
		InstanaceInner02 obj1 = outer.new InstanaceInner02();
	}

	void instanceMethod() {
		InstanaceInner02 obj1 = new InstanaceInner02();
		StaticInner02 obj2 = new StaticInner02();
		//LocalInner lv = new LocalInner();
	}

	void myMethod() {
		class LocalInner {
		}
		LocalInner lv = new LocalInner();
	}
}
