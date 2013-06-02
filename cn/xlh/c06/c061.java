package cn.xlh.c06;

class A {
	A(int i){
		System.out.println("Constract A"+i);
	}
}

class B {
	B(int i){
		System.out.println("Constract B"+i);
	}
}

class C extends A {
	B b1 = new B(10);
	
	C () {
		super(7);
	}
	public static void main(String[] args) {
		C c1 = new C();
		System.out.println("Main C");
	}
}

class c063 {
	private A a1;
	
	private void test() {
		System.out.println("start test");
		if (a1 == null) {
			a1 = new A(3);
		}
		System.out.println("end test");
	}
	
	public static void main(String[] args) {
		c063 eg = new c063();
		
		eg.test();
	}
}

public class c061 {

	
	public static void main(String[] args) {
		
	}
}

class Cleanser {

	private String s = new String("Cleanser");
	public void append(String a) { s += a; }
	public void dilute() { append(" dilute()"); }
	public void apply() { append(" apply()"); }
	public void scrub() { 
		append(" scrub()");
		System.out.println(" scrub()");
		}
	public String toString() { return s; }
	
	public static void test(Cleanser c) {
		c.scrub();
	}
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute(); x.apply(); x.scrub();
		System.out.println(x);
	}
}

class Detergent extends Cleanser {
	// Change a method:
	public void scrub() {
		append(" Detergent.scrub()");
		System.out.println(" Detergent.scrub()");
		super.scrub(); // Call base-class version
	}
	// Add methods to the interface:
	public void foam() { append(" foam()"); }
	// Test the new class:
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class:");
	
	}
 }
 
 class C064 extends Detergent {
		public void scrub() {
			append(" C064.scrub()");
			System.out.println(" C064.scrub()");
			super.scrub(); // Call base-class version
		}
		
		void sterilize() {
			 System.out.println("sterilize");
		 }
		
		public static void main(String[] args) {
			C064 x = new C064();
		
			
			
			Cleanser.test(x);
		}
 }

