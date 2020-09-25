package sec02_interface.EX01_InterfaceCharacteristics;

interface A {
	public static final int a = 3;
	public abstract void abc();
}

interface B {
	int b = 3; //생략시 자동으로 public static final
	void bcd();//생략시 자동으로 public abstract
}

public class InterfaceCharacteristics {
	public static void main(String[] args) {
		
		//#1. static 자동추가 체크
		System.out.println(A.a);
		System.out.println(B.b);
		
		//#2. final 자동추가 체크
//		A.a = 5;
//		B.b = 5;
	}
}
