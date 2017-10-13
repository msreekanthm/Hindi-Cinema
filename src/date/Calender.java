package date;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender 
{
	public static void main(String[ ] args)
	{
	String date="25/Aug/2018";
	String[ ] temp=date.split("/");
	String dt,month,year;
	dt=temp[0];
	month=temp[1];
	year=temp[2];
	String calyear,calmonth,caldate;
    WebDriver driver=new FirefoxDriver();
	driver.get("http://cleartrip.com");
	driver.findElement(By.id("DepartDate")).click();
	calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
	while (!calyear.equals(calyear))
	{
		driver.findElement(By.className("nextMonth")).click();
		calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
	}
	calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
	while (!calmonth.equals(calmonth))
	{
		driver.findElement(By.className("nextMonth")).click();
		calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
	}
	WebElement table;
	table=driver.findElement(By.className("calendar"));
	List<WebElement> rows,cols;
	rows=table.findElements(By.tagName("tr"));
	boolean flag=false;
	for (int i = 1; i < rows.size(); i++)
	{
		cols=rows.get(i).findElements(By.tagName("td"));
		for (int j = 0; j < cols.size(); j++) 
		{
			caldate=cols.get(j).getText();
			if (caldate.equals(caldate))
			{
				cols.get(j).getText();
				flag=true;
				break;
			}
		}
		if (flag)
		{
			break;
		}
			
		}
				
			}
			
		}
		