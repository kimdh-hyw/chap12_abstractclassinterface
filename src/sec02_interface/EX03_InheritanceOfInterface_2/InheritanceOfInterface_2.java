package sec02_interface.EX03_InheritanceOfInterface_2;

/*인터페이스 상속 자식클래스의 접근지정자*/

interface A {
	public abstract void abc(); 
}
interface B {
	void bcd(); //생략시 public abstract 
}
class C implements A {
	public void abc() {
		//...
	}
}
/* public -> default 불가능
class D implements B {	
	void bcd() {
		
	}	
}
*/
public class InheritanceOfInterface_2 {
	public static void main(String[] args) {
		
	}
}
