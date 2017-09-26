package assignment3;

	
			public class ClassVariables
		{
			static int myInteger = 10;        //Static Variable
			
			static String myString = "STATIC";     //Static Variable
		
		
		
				public static void main(String[] args) 
		
		{
				
				ClassVariables obj1 = new ClassVariables();
				
				ClassVariables obj2 = new ClassVariables();
				
				//accessing class variables through obj1
				
				System.out.println(obj1.myInteger);      //Output : 10
				
				System.out.println(obj1.myString);      //Output : STATIC
				
				//accessing class variables through obj2
				
				System.out.println(obj2.myInteger);      //Output : 10
				
				System.out.println(obj2.myString);      //Output : STATIC
				
				//Making changes to class variables through obj2
				
				obj2.myInteger = 20;
				
				obj2.myString = "STATIC_STATIC";
				
				//accessing class variables through obj1
				
				System.out.println(obj1.myInteger);      //Output : 20
						
				System.out.println(obj1.myString);      //Output : STATIC_STATIC
						
				//accessing class variables through obj2
						
				System.out.println(obj2.myInteger);      //Output : 20
						
				System.out.println(obj2.myString);      //Output : STATIC_STATIC
			}	
		}
			
			
			
			