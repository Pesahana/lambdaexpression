package multipleparameters;

public class Lambdaexample3 {

	public static void main(String[] args) {   
	
		
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(23,26));  
          
        Addable ad3=(int a,int b)->(a+b);  
        System.out.println(ad3.add(05,12));
         
        Addable ad2=(int a,int b)->(a+b);  
        System.out.println(ad2.add(1999,1998));
        
       
    }  
	
}
