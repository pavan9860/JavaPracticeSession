package Java.Practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;


import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class stringclass {
	
	
	static String a = "pavan";
	String s = "Ingale";
	
	@Test(enabled = false)
	public void interchangestring()
	{
		
		String a = "pavan";
		String b = "123";
		
		a = a+b;
		
	System.out.println(a);
	
	  a= b.concat(a.substring(0,a.length()-b.length()));
	  
	  System.out.println(a);
		
		
		
		
	}
	@Test(enabled =false)
	public void concate()
	{
		int b=0;
		String a = "I am the boss and I am the toss";
		
	     Pattern  p = Pattern.compile("^\\s");
	     
	     Matcher m = p.matcher(a);
	     
	          String d[] =  a.split("\\s");
	          
	          for(String g : d)
	          {
	        	  System.out.println(g);
	          }
	   
	          
	          
		
	}
	
	@Test(enabled =false)
	public void retrive()
	{
		String g = "tbvgv23432hv423vgh vghv4h243543bbvh&&^&n3b423*(*9";
		
		   // String j[] = g.split("[0-9]");
		    
		    Pattern p = Pattern.compile("[0-9]");
		    
		    Matcher m = p.matcher(g);
		    
		    int a =0;
		    
		    while(m.find())
		    {
		       a =a+  Integer.parseInt(m.group().toString());  
		    }
		    System.out.println(a);
		  
	}
	
 @Test(enabled=false)
 public void reverse()
 {
	 String a = "pavan ingale patil";
	 
	 String b="";
	 
	      for(int i=a.length()-1;i>=0;i--)
	      {
	    	 b= b+ a.charAt(i);
	      }
	      
	      System.out.println(b);
 }
	 
@Test(enabled=false)
public void reverseword()
{
	String a = "pavan ingale    patil";
	
	     String[] b =  a.split("\\s");
	     
	     String c="";
	     
	     
	     for(int i=b.length-1;i>=0;i--)
	     {
	    	 c = c+" "+b[i];
	     }
	     
	     System.out.println(c);
	     	     
	
}


@Test(enabled=false)
public void substring()
{
	String a = "you are a engineer of the year";
	
	       String b = "pavan";
	       
	     
	    // String c= a.substring(10,19).concat(b);
	       
	       
	       //System.out.println(c);
	       
	      a.indexOf("engineer");
	      
	     String v = a.substring(a.indexOf("engineer")).concat(b);
	     System.out.println(v);
	     	
}

@Test(enabled=false)
public void compare()
{
	String s= "abcd1$?@23=+4efg";
	
	Pattern p = Pattern.compile("[0-9]");
	
	Matcher m = p.matcher(s);
	
	String a="";
	while(m.find())
	{
		a = a+m.group();
	}
	System.out.println(a);

}

@Test(enabled=false)
public void otherway()
{
	//String s= "abcd1$?@23=+4efg";
	
	String s ="wedsf 32423 ^%&";
	
	String d[] = s.split("\\s");
	
	   String g =  d[1];
	   
	   int y = 0;
	   
	   for(int j=0;j<g.length();j++)
	   {
		  char r = g.charAt(j);
		  
		int p = Integer.parseInt(String.valueOf(r));
		
		
		y = y+p;
		  
		  
	   }
	
	   System.out.println("Total is : "+y);
}


@Test(enabled =false)
public void totalsum()
{
	String s ="wds87sadsjaj98as9202";
    
    Pattern p = Pattern.compile("[0-9]");
    
    Matcher m = p.matcher(s);
    
    int j =0;
    
    while(m.find())
    {
       j= j+ Integer.parseInt(m.group());
    }
    
    System.out.println("total is :"+j);
}

@Test(enabled =false)
public void gobuz()
{
	String s ="wds87sadsjaj98as9202";
	
	String t="";
	
	int w =0;
	
	for(int i=0;i<s.length();i++)
	{ 
		String d = String.valueOf(s.charAt(i));
		
		if(d.matches("[0-9]"))
		{
			t =d;
			
			w =w+Integer.valueOf(t);
			
		}
		
	}
	
	System.out.println("Total value is :"+w);
	
	
}

@Test(enabled =false)
public void jobaz()
{
	String s ="8987hgygbjhh7687hhjjjb878";
    
    String a[] = s.split("[a-z]+");
    
    String g ="";
    int d =0;
    for(String b: a)
    {
        g=b;
        d=d+Integer.valueOf(g);
    }
    
    System.out.println(d);	
	
	
	
	
}



@Test(enabled =false)
public void aseding()
{
	String s = "999999 76876 3232 245479 22";
    
    String a[] = s.split("\\s");
    
    List<Integer> order = new LinkedList<Integer>();
    
   int n =  a.length;
    
   int q=0;
    
    
    for(int i=0;i<a.length;i++)
    {
    	System.out.println(a[i]);
    	String b = a[i];
    	
    	 for(int j=0;j<b.length();j++)
         {
             char c = b.charAt(j);
             
            q = q+ Integer.parseInt(String.valueOf(c));
                  
         }
    	 System.out.println(q);
    	 
    	 order.add(q);
    	 q=0;
    }
    
    Collections.sort(order);
    
     System.out.println(order);
    
   /* for(int i=0;i<a.length;i++)
    {
        String b = a[i];
        
        for(int j=0;j<b.length();j++)
        {
            char c = b.charAt(j);
            
            q =q+ Integer.parseInt(String.valueOf(c));
            
        }
        
        order.add(q);
        
    }*/
    
    //System.out.println(order);
     
   //  Collections.sort(order);
     
    // System.out.println(order);
}

@Test(enabled =false)
public void check()
{
	
	 int s[] = {3,2,1,4,6,7,8};
	    
     int g;
    
    int h=0;
    
   List<Integer> sum = new LinkedList<Integer>();
    
    for(int i=0;i<s.length;i++)
    {
       g= s[i]*s[i];
       
       System.out.println(g);
       
       sum.add(g);
    }
    
    for(int r :sum)
    {
       h =h+r; 
    }
    
    System.out.println(h);
	
}

@Test(enabled =false)
public void stringchar()
{
	String s ="jjeeejjeeejjerdddjeejjjjesssj";
    
    String g = s.replaceAll("j","K");
    
    System.out.println(g);
    
    String h ="";
    
    for(int i=0;i<g.length();i++)
    {
       String q =  String.valueOf(s.charAt(i));
       
       for(int j=i+1;j<s.length();j++)
       
      {
          String t =  String.valueOf(s.charAt(j));
          
          if(!q.matches(t))
          {
             for(int k=0;k<h.length();k++)
             {
            	 if(!h.matches(t)&& !h.matches(q) )
            	 {
            		 h = h+t;
            	 }
            	 
             }
          }
      }     
        
    }
    
   System.out.println(h); 
    
}

@Test(enabled =false)
public void taken()
{
	String s ="sccutasjdcutasndsjcutamdsamcutwqwecut";
	
	Pattern p = Pattern.compile("cut");
	
	Matcher m = p.matcher(s);
	
	int count = 0;
	
	while(m.find())
	{
		count++;
	}
	
	System.out.println(count);
}

@Test(enabled =false)
public static void buffelo()
{
String s = "233 545 675 878 239 555 121 337";
    
    String c[] = s.split("\\s");
    
    int count=0;
    
   for(int i=0;i<c.length;i++)
   {
       int a = Integer.parseInt(c[i]);
       
       StringBuffer b = new StringBuffer(String.valueOf(a));
       
       String d = b.reverse().toString();
       
     int g =  Integer.parseInt(d);
     
       
     
     if(a==g)
       {
           System.out.println("value of a is "+a+"value of g is "+g);
           count++;
       }        
       
       
   }
    
    System.out.println("count is : "+count);   
  
    
    
    
   }

@Test
public void ascord()
{
	 String s = "233 545 675 878 239 555 121 337";
	    
	    String c[] = s.split("\\s");
	    
	    int count=0;
	    
	    int a;
	    int g;
	   for(int i=0;i<c.length;i++)
	   {
		   String temp ="";
	      a = Integer.parseInt(String.valueOf(c[i]));
	     
	    String b = String.valueOf(c[i]);
	     
	     for(int j=0;j<b.length();j++)
	     {
	    	 
	         char ch =  b.charAt(j);
	         
	          temp = ch+temp;
	         
	          
	         
	     }
	     g = Integer.parseInt(String.valueOf(temp));
	     if(a==g)
	   {
	       count++;
	   }
	   
	   }
	   
	 System.out.println(count);  
}



}

	


	


