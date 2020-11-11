package sec02_interface.EX02_InheritanceOfInterface_1;

/*인터페이스와 클래스의 상속 키워드 */

interface A {}
interface B {}

//#1. 단일인터페이스 상속
class C implements A {	
}
//#2. 다중인터페이스 상속
class D implements A, B {
}
//#3. 클래스와 인터페이스를 한번에 상속 (extends와 implements의 순서는 변경 불가)
class E extends C implements A,B {
	
}
public class InheritanceOfInterface_1 {
	public static void main(String[] args) {
		
	}
}
