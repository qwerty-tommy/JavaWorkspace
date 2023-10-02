package nested;

public class Ex02_CheckAccess {
	class InstanceInner{}
	static class StaticInner{}
	
	InstanceInner iv= new InstanceInner();
	static StaticInner cv=new StaticInner();
	
	static void staticMethod() {
		//InstanceInner obj1=new InstanceInner();
		StaticInner obj2=new StaticInner();
		
		Ex02_CheckAccess outer=new Ex02_CheckAccess();
		InstanceInner obj1=outer.new InstanceInner();
	}
	
	void instanceMethod() {
		InstanceInner obj1=new InstanceInner();
		StaticInner obj2=new StaticInner();
		//LocalInner lv=new LocalInner();
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv=new LocalInner();
		}
}
