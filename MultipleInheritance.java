class Student 
{
	int rollNumber;
	void getNumber(int n)
	{
			rollNumber=n;
	}
	void printNumber()
	{
		System.out.println("rollNumber:"+rollNumber);
	}
}
class test extends Student
{
	float part1,part2;
	void getMarks(float a,float b)
	{
		part1=a;
		part2=b;
	}
	void putMarks()
	{
		System.out.println("part1 marks:"+part1);
		System.out.println("part2 marks:"+part2);
	}
}
interface sports
{
	float sportwt=6.0F;
	void putwt();
}
class result extends test implements sports 
{
	float total;
	public void putwt()
	{
		System.out.println("sportsmarks:"+sportwt);
	}
	void display()
	{
		total=part1+part2+sportwt;
		System.out.println("total marks:"+total);
	}
}
class MultipleInheritance
{
	public static void main(String args[])
	{
		result a = new result();
		a.getNumber(10);
		a.printNumber();
		a.getMarks(25.0F,45.0F);
		a.putMarks();
		a.putwt();
		a.display();
	}
}	