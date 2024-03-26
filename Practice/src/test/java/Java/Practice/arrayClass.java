package Java.Practice;

import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class arrayClass {
	
	
	@Test(enabled =false)
	public void mark()
	{
		String a[] = {"john","Lucworm","Mandi","Nattu","Debris"};
		
		String b ="";
		
		int count =1;
		
		for(int i=0;i<a.length;i++)
		{
			b=a[i];
			
			char d = b.charAt(0);
			
			System.out.println(" "+count+" character of "+count+" position is :  "+d);
			
			
			count++;
			
			
		}
		
		
		
	}
	
	@Test(enabled =false)
	public void listchat()
	{
		 String a ="Pavan";
	        String b = "Karunanidhi";
	        String w ="Daryapure";
	        
	        int c = w.lastIndexOf("ya");
	        
	       String d = w.substring(0,c+2);
	       String e = w.substring(c+2);
	       
	      String h = d.concat(" ").concat(a).concat(" ").concat(e);
	        
	}
	
	

}
