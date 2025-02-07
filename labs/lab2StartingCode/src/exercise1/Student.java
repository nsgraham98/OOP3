package exercise1;

import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student>
{
	private String name;
	private int age;
	
	public Student( String name, int age )
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	} 
	
	public int getAge()
	{
		return age;
	}
	
	@Override
	public int compare(Student s1, Student s2)
	{
		return s1.getName().compareTo( s2.getName() );
	}
	
	@Override
	public int compareTo(Student that)
	{
		if( this.age > that.age )
		{
			return 1;
		}
		else if( this.age < that.age )
		{
			return -1;
		}
		else
		{
			return this.compare(this, that);
		}
	}
}
