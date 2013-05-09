import java.util.*;
/** The first Thinking in Java example program.
* Lists system information on current machine.
* @author Bruce Eckel
* @author http://www.BruceEckel.com
* @version 1.0
*/

public class test {
	public static void main(String[] args) {
		TestA a = new TestA();
		
		double[][][] b1 = a.create_array(2, 3, 4, 4.5, 85.2);
		
		a.print_array(b1);
		
		a.print_array(a.create_array(4, 3, 2, 42.65, 185.2));
	}

}

class TestA {
	
	
	public double[][][] create_array(int row, int col, int col2, double start, double end)
	{
		double[][][]  array_a = new double[row][][];
		
		for (int i=0;i<array_a.length;i++) 
		{
			array_a[i] = new double[col][];
			for (int j=0;j<array_a[i].length;j++)
			{
				array_a[i][j] = new double[col2];
				
				for (int k=0;k<array_a[i][j].length;k++)
				{
					array_a[i][j][k] = start + (i*col*col2+j*col2+k)*(end-start)/(row*col*col2);
				}
				
			}
		}
		
		return array_a;
	}
	
	public void print_array(double [][][] a1) {
		
		for (int i=0;i<a1.length;i++)
		{
			for (int j=0;j<a1[i].length;j++)
			{
				for (int k=0;k<a1[i][j].length;k++)
				{
					System.out.println("a1["+i+"]"+"["+j+"]"+"["+k+"]="+a1[i][j][k]);
				}
				
			}
		}
	}
}