import java.util.*;

public class Date
{
	
	private int month;
	private int day;
	private int year;

	public Date (int month,int day,int year)
	{
	this.month = month;
	this.day = day;
	this.year =year;
	}

	public void setMonth (int month)
	{
	if(month >=1 && month<= 12)
	{
	this.month = month;
	}
	else
	{
	System.out.println("Invalid Month");
	}
}
	public int getMonth() {
	return month;
	}

	public void setDay(int day)
	{
	if(day >=1 && day <=31){
	this.day = day;
	}
     else
     {
     System.out.println(" Invalid Date");
     }
	}
	public int getDay()
	{
	return day;
	}

	public void setYear(int year)
	{
	if (year >=1900 && year<=2100)
	{
	this.year =year;
	}
    }
	public int getYear()
	{
	return year;
	}
	public void displayDate ()
	{
	System.out.printf("%d /%d /%d", getMonth(), getDay(), getYear());
	}
	

}