import java.util.ArrayList;

public class JavaPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String s = "sai ram Padala";
		       // s.split(" ");
		        
		        //String[] SplitArray = s.split("ram");
		       // for (int i =0; i < s.length(); i++) { to print string 
		        
		        
		        for (int i =s.length()-1; i >=0; i--) { //to print string in reverse order
		        
		        ArrayList<String> a = new ArrayList<String>();
		        a.add(s);//to add string to array list
		        a.add("kalki");
		        
		        //(a.contains("sairam Padala"));
		        
		        System.out.println(s.charAt(i));
		        
		        
		            //System.out.println(a.get(1)); //.get is get is used to get the string from array list
		            
		     }

	}}


