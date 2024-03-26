package javabasic;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.Test;

public class arrayclass {
	
	@Test(enabled=false)
	public void smallarg()
	{
		
		int a[] = {3,1,100,12,67,23,6,-1,2,89,555,56};
		
		int b=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				  b = a[i];
				  a[i] = a[j];
				  a[j] = b;
				  
					
				}
			}
			
		}
		
		for(int j=0;j<a.length;j++)
		{
			System.out.println("value is "+a[j]);
		}	
		
	}
	
	@Test(enabled =false)
	public void arraystring()
	{
		String a[] = {"yoyo","gogo","toto","lolo","dodo","momo"};
		
	
		List<String> b = new LinkedList<String>();
		
		for(int i=0;i<a.length;i++)
		{
			b.add(a[i]);
		}
		
		System.out.println(b);
		
		Collections.sort(b);
		
		System.out.println(b);
		
		Collections.reverse(b);
		
		System.out.println(b);
		
	
	}
	
	@Test(enabled =false)
	public void sorted()
	{
		int a[] = {3,5,7,1,6,2,8,1};
		
		Object b[] = {3,5,7,2,1,"pavan","sandeep"};

		List<Object> c = new LinkedList<Object>();
		
	      for(int i=0;i<b.length;i++)
	      {
	    	 c.add(b[i]); 
	    	  
	      }
	      
	      System.out.println(c);
		
	     Iterator it = c.iterator();
	      
	      while(it.hasNext())
	      {
	    	 Object op= it.next();
	    	  
	    	 if(op.toString().contains("pavan"))
	    	 {
	    		 c.remove(op);
	    	 }
	      }
		
		System.out.println(c);
		
		
	}

}
