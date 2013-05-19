package cn.xlh.c05;



public class c052 {
	public static void main(String[] args) {
		test a = new test();
		
		a.name = "dd";
		a.age = 12;
		
		
		System.out.println("name=" + a.name + "age=" + a.age + "tall=" + a.get_tall());
	}
}

class test {
	public String name;
	protected int   age;
	private   int   tall;
	
	public int get_tall() {
		return tall;
	}
	
}