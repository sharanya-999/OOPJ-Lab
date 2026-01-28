class Student 
{
	int rollno;
	String name;
	String branch;
	int marks;
	void getdata(int rollno,String name,String branch,int marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.branch=branch;
		this.marks=marks;
	}
	void display()
	{
		System.out.println("rollno="+rollno);
		System.out.println("name="+name);
		System.out.println("branch="+branch);
		System.out.println("marks="+marks);
	}
	public static void main(String[] args)
	{
		Student s1= new Student();
		Student s2= new Student();
		s1.getdata(1,"A","CSE",100);
		s2.getdata(2,"B","CSE",100);
		s1.display();
		s2.display();
	}
}
