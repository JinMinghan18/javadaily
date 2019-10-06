package nice;
public class JTriangle 
{
	double length = 10.0;
	double height = 5.0;
	double area()
	{
		return length * height/2.0;
	}//计算面积
	
	
	public static void main(String[] args)
	{
		double s;
		s = (new JTriangle()).area();
		System.out.println("该三角形的面积为："+ s);
	}
}
