import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StringA {

	public static void main(String[] args) {

           //******************
		
		char [] A = { 'B','i','s','l','e','r','i' };
		System.out.println(A);
		
		//          1. Concat
		// char [] B = { 'B','i','s','l','e','r','i' };    !! not work
		String B = new String ("Bisleri");
		String C ="Water";
		
		System.out.println(B.concat(C));
		
		       //     2.for REPLACE  AND Replace All   AND Replace First
			String s1=new String("Ravi Shankar Prasad"); 
			String s2=s1.replaceAll("a","@");
			System.out.println(s2); 
			System.out.println(s1.replace("Ravi", "Vijay"));
			System.out.println(s1.replaceFirst("R", "K"));
			
			     //  3.for SPLIT
			
			String[] s3 =s1.split(" ");
			for(String w:s3){  
				System.out.println(w);	}
				
				 //  4.for Length
				
			String D = new String ("Bisleri");	
			System.out.println(D +" " + D.length());
				
				// index of and char of 
			
			String E = new String ("BisLeri");
			System.out.println(E +" " + E.indexOf('L') +  "  "  +E.charAt(5));
			
			// Comapare To
			
		String F =new String ("Guru 1");
				String G =new String ("Guru 2");
				
				System.out.println(F.compareTo(G));
 
			// Contains()
				
				String H =new String ("a hollow cylindrical charing body");
				             System.out.println("Check ing; " + H.contains("ing")+" " + "check hollow cylindrical :" +
				                               H.contains("hollow cylindrical")+ " " +" check body fit :"+H.contains("body fit "));
				
			// Ends With ()
				             
				     String I =new String ("the sky is pink");
				        System.out.println("Check k: " + I.endsWith("k")+" " + "check ink :" +
			                                  I.endsWith("ink")+ " " +"check charge :"+I.endsWith("charge ") + 
			                                  "check pink :"+I.endsWith("pink"));
				
			//Upper case and Lower Case 
				        
				        String J= "soft Bedsheet ";
				        System.out.println(J.toUpperCase());
				        
				        String K= "SoFt BeDSHEEt ";
				        System.out.println(J.toLowerCase());                   
				                       
                  //Trim ()
				        
				        String L = new String ("      Most Welcome      ");
				        System.out.println(L +L.length()); //without trim
				                     String M =L.trim();
				        		System.out.println(M);
				        		System.out.println(M.length()); //after Trim
				        //value of
				                boolean N = true;    
				                boolean O = false;    
				                String P = String.valueOf(N);    
				                String Q= String.valueOf(O);  
				                System.out.println(P+Q); 
				             
				   // Convert String to Integer
				          // 1.      
				          String R ="500";
				          String S = "100";
				          
				          int T = Integer.parseInt(R);
				          System.out.println("Actual String:"+ R);
				          System.out.println("Converted to Int:" + T);
				                   System.out.println( T/100);
				               
				        //2. 
				                   int	U = Integer.valueOf(R);    
					                int V= Integer.valueOf(S);   
	
	                             System.out.println(U/V);       

	                  // FILE HAndling
	                             
	                             try {
	                                 File myObj = new File("filename.txt");
	                                 FileWriter myWriter = new FileWriter("filename.txt");
	                                 myWriter.write("Files in Java might be tricky, but it is fun enough!");
	                                 myWriter.close();
	                                 if (myObj.createNewFile()) {
	                                   System.out.println("File created: " + myObj.getName());
	                                 } else {
	                                   System.out.println("File already exists.");
	                                 }
	                               } catch (IOException e) {
	                                 System.out.println("An error occurred.");
	                                 e.printStackTrace();
	                               }
	                             
	}
}
