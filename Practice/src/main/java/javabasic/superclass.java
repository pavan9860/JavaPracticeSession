package javabasic;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class superclass {
	
	
	@Test
	public void maptable()
	{
		
		HashMap<String,Integer> a = new HashMap<String,Integer>();
		
		a.put("Pavan",2);
		a.put("Naresh", 4);
		a.put("Raghav",5);
		a.put("Mumbai",8);
		a.put("Pune",12);
		
		boolean c =true;
		
		
		
	  for( Entry<String, Integer> d : a.entrySet())
	  {
		  System.out.println(d.getKey());
		  
		  System.out.println(d.getValue());
		  
		  
		  
	  }
		
		
		
		
	}

}
