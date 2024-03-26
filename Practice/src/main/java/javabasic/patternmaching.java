package javabasic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class patternmaching {
	
	@Test(enabled = false)
	public void test1()
	{
		int count =0 ;
		Pattern p = Pattern.compile("[^\\s]");
		Matcher m = p.matcher("abcabdab  rabr");
		
		while(m.find())
		{
			count++;
			System.out.println("String is"+m.group());
		}
		System.out.println("count is "+count);
	}
	
	@Test(enabled = false)
	public void test2()
	{
		String a = "efra rwe ded jine ewfc ytyu";
		
		int count = 0;
		Pattern p = Pattern.compile("\\s");
		
		Matcher m = p.matcher(a);
		
		while(m.find())
		{
			count++;
		}
		
		System.out.println("count is "+count);
	}
	
	@Test(enabled=false)
	public void test3()
	{
		String a = "efrDEa r234.weDEW d/eFGHd ji@nPAGS343e e%wfc ytyu8797DERF7";
		
		int count = 0;
		Pattern p = Pattern.compile("\\W");
		
		Matcher m = p.matcher(a);
		
		while(m.find())
		{
			count++;
			System.out.println("value is "+m.group());
		}
		
		System.out.println("count is "+count);
	}
	
	@Test(enabled=false)
	public void test4()
	{
		String a = "ef3rDEa r234.^$*#weDEW d/eFGHd ji@nPAGS343e e%(*&wfc ytyu8797DERF7";
		
		int count = 0;
		Pattern p = Pattern.compile("\\W");
		
		   String[] b =   p.split(a);
		
		   for(String g :b)
		   {
			 System.out.println("value is "+g);  
		   }
	
	}

	@Test(enabled=false)
	public void test5()
	{
		String a = "ef3rDEa r234.^$*#weDEW d/eFGHd ji@nPAGS343e e%(*&wfc ytyu8797DERF7";
		
		int count = 0;
		Pattern p = Pattern.compile("\\s");
		
		   String[] b =   p.split(a);
		
		   for(String g:b)
		   {
			   
			   //System.out.println("value is "+g);
			  Pattern d = Pattern.compile("\\d+");
			   Matcher m = d.matcher(g);
			   
			   while(m.find())
			   {
			   System.out.println("Value is "+m.group());
			   }
		   }		   
	}

	@Test(enabled=false)
	public void test6()
	{
		String a = "098574 12323 02322 32432 0342766";
		
		int count =0;
		
	     Pattern p = Pattern.compile("[3|1][1-3]{2}");
	     
	     Matcher m = p.matcher(a);
	     
	     while(m.find())
	     {
	    	 count++;
	    	 System.out.println("value is "+m.group());
	     }
	
	     System.out.println("count is "+count);
	}
	
	@Test(enabled=false)
	public void test7()
	{
		String a = "pavan.ingale@gmail.com dfer433@gmail.in";
		
		int count =0;
		
	     Pattern p = Pattern.compile("[a-zA-Z0-9]*[a-zA-Z0-9.]*@[a-z]*[.][a-z]+"); // [[com]&&[in]]
	     
	     Matcher m = p.matcher(a);
	     
	     
	     
	     while(m.find())
	     {
	    	 count++;
	    	 System.out.println("value is "+m.group());
	     }
	
	     System.out.println("count is "+count);
	}
	
	@Test(enabled=true)
	public void test8()
	{
		// (16 digit password , 10 character , 4 small letter ,6 capital letter , 2 symbol(except" "),4 numbers)
		
		Pattern p = Pattern.compile("(?=.*[A-Z]{2,3})+(?=.*[a-z]{2,2})+(?=.*[A-Z]{2,3})+(?=.*[a-z]{2,2})+(\\W&&^\\s)([0-9]{3,4})");
		
		String a = "ewrfds4333%^esdw";
		
		Matcher m = p.matcher(a);
		
		while(m.find())
		{
			System.out.println(m.group());
		}
		
		
		
	}
}
