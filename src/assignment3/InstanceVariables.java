package assignment3;

public class InstanceVariables {

		
			int myInteger = 10;        //Instance Variable
			
			String myString = "NON-STATIC";     //Instance Variable
		

		 	
			public static void main(String[] args) 
			{	
				InstanceVariables obj1 = new InstanceVariables();
				
				InstanceVariables obj2 = new InstanceVariables();
				
				//obj1 instance variables
				
				System.out.println(obj1.myInteger);       //Output : 10
				
				System.out.println(obj1.myString);       //Output : NON-STATIC
				
				//obj2 instance variables
				
				System.out.println(obj2.myInteger);       //Output : 10
				
				System.out.println(obj2.myString);       //Output : NON-STATIC
				
				//changing obj1 instance variables
				
				obj1.myInteger = 20;
				
				obj1.myString = "INSTANCE VARIABLE";
				
				//obj1 instance variables
				
				System.out.println(obj1.myInteger);       //Output : 20
						
				System.out.println(obj1.myString);       //Output : INSTANCE VARIABLE
						
				//obj2 instance variables
						
				System.out.println(obj2.myInteger);       //Output : 10
						
				System.out.println(obj2.myString);       //Output : NON-STATIC
			}	
		}
			
			