package Business_layer;
import Data_Layer.data;
public class add {
	data ab=new data();
	public int addition(int x,int y)
	{
		int c=x+y;
		ab.dat(x, y, c,"addition");
		return c;
	}
	public int substraction(int x,int y)
	{
		int c=x-y;
		ab.dat(x, y, c,"substraction");
		return c;
	}
	public int multiplication(int x,int y)
	{
		int c=x*y;
		ab.dat(x, y, c,"multiplication");
		return c;
	}
	public int division(int x,int y)
	{
		int c=x/y;
		ab.dat(x, y, c,"division");
		return c;
	}
}
