package sec02_interface.EX04_CreateObjectOfInterface_1;

/*자식클래스의 직접 정의를 통한 인터페이스타입의 객체 생성 (방법#1)*/

interface A {
	int a = 3;
	void abc();
}
class B implements A {	
	public void abc() {
		System.out.println("방법#1. 자식클래스 생성자로 객체 생성");		
	}
}
public class CreateObjectOfInterface_1 {
	public static void main(String[] args) {
		//#1. 객체 생성
		A b1 = new B();
		A b2 = new B();
		
		//#2. 메서드 호출
		b1.abc();
		b2.abc();
	}
}
