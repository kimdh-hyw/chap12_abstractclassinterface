package sec02_interface.EX06_DefaultMethod_1;

/*인터페이스 구현 및 디폴트메서드의 오버라이딩*/

interface A { 
	void abc(); //2020년 생성
	default void bcd() {
		System.out.println("A 인터페이스의 bcd()");
	} //2030년 생성
}
class B implements A { //2020년 생성
	public void abc() { 
		System.out.println("B 클래스의 abc()");
	}
}
class C implements A {
	public void abc() {
		System.out.println("C 클래스의 abc()");
	}
	public void bcd() {
		System.out.println("C 클래스의 bcd()");
	}
}
public class DefaultMethod_1 {
	public static void main(String[] args) {
		//#1. 객체 생성
		A a1 = new B();
		A a2 = new C();		
		
		//#2. 메서드 호출
		a1.abc(); //B 클래스의 abc()
		a1.bcd(); //A 인터페이스의 bcd()
		
		a2.abc(); //C 클래스의 abc()
		a2.bcd(); //C 클래스의 bcd()
	}
}



























