package nice;
public class JStudent4 
{
	String name;
	char sex;
	int stuID;
	
	public JStudent4(){}
	
	public JStudent4(String stuName,char sex,int stuID)
	{
		name = stuName;
		this.sex = sex;
		this.stuID = stuID;
	}
	
	public void setname(String setName)
	{
		name = setName;
	}
	public void setsex(char sex)
	{
		this.sex = sex;
	}
	public void setstuID(int stuID)
	{
		this.stuID = stuID;
	}
	
	public static void main(String[] args)
	{
		JStudent4[] s = new JStudent4[30];
		for(int i=0;i<30;i++)
		{
			s[i] = new JStudent4();
		}
	}
}
