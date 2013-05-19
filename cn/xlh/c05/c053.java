package cn.xlh.c05;



public class c053 {
	public static void main(String[] args) {
		test a = new test();
		
		a.name = "dd";
		a.age = 12;
		
		
		System.out.println("name=" + a.name + "age=" + a.age + "tall=" + a.get_tall());
	}
}