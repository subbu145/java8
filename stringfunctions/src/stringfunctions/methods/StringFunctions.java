package stringfunctions.methods;

public class StringFunctions {
 public void reverseString() {
	 String s=new String("i am the rockstar");
	
	 /*
		 * for (int i = s.length()-1; i>=0; i--) { char ch=s.charAt(i);
		 * System.out.print(ch);
		 * 
		 * }
		 */
	 
 }
	 public static String reverseString2(String str1){  
		    StringBuilder sb=new StringBuilder(str1);  
		    sb.reverse();  
		    StringBuffer sbb=new StringBuffer(str1);
		    sbb.reverse();
		    return sbb.toString();  
		}  
	 //palindrome checking
	 public static boolean isPalindrome(String str){  
		    StringBuilder sb=new StringBuilder(str);  
		    sb.reverse();  
		    String rev=sb.toString();  
		    if(str.equals(rev)){  
		        return true;  
		    }else{  
		        return false;  
		    }  
		}  
	 //Java Program to capitalize each word in String
 public static String capitalize(String str) {
	 String str2[]=str.split(" ");
	 String cap="";
	 for (int i = 0; i < str2.length; i++) {
		 String first=str2[i].substring(0,1).toUpperCase();
		 String last=str2[i].substring(1).toLowerCase();
		  cap=first.concat(last);
		System.out.print(cap+" ");
	}
	 
	return cap;
	 
 }
 
//Java Program to capitalize each word in String
 public static String capitalizeWord(String str){  
	    String words[]=str.split("\\s");  
	    String capitalizeWord="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
	    }  
	    return capitalizeWord.trim();  
	}  
	//tOGGLE each word in string
 
 public static String toggleWord(String str){  
	    String words[]=str.split("\\s");  
	    String capitalizeWord="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  
	    }  
	    return capitalizeWord.trim();  
	}  
// reverse String word into tOGGLE
  public static String reverseToggle(String str) {
	String  str2[]=str.split(" ");
	String t="";
	for (String s : str2) {
		//System.out.print(str3.toString()+" ");
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String f  =sb.substring(0,1).toLowerCase();
		  String l=sb.substring(1).toUpperCase();
	t+=f+l+" ";	  
	//System.out.println(t);
	}
	return t;
  }
//reverse String word into tOGGLE 2nd way
  public static String reverseToggle2(String str) {
		String  str2[]=str.split(" ");
		String t1="";
		for (int i=0;i<str2.length;i++) {
			StringBuffer sb=new StringBuffer(str2[i]);
			sb.reverse();
			String f  =sb.substring(0,1).toLowerCase();
			  String l=sb.substring(1).toUpperCase();
		t1+=f+l+" ";	  
		}
		return t1;
	  }
  //JOIN METHOD
  public static void joinMethod(){  
	  String joinString1=String.join("=","welcome","to","javatpoint");  
	 // joinString1=joinString1.join("//", "i","am","subbu");
		/*
		 * StringBuffer st=new StringBuffer("i am "); st.append("subbu"); String s=new
		 * String("i am "); s=s.concat("subbu"); System.out.println(st);
		 * System.out.println(s);
		 */
	 System.out.println(joinString1);  
	  }
  public static void Valueof(){  
	  String value="subbu";  
	  String s1=String.valueOf(value);  
	  System.out.println(s1+10);//concatenating string with 10  
	  }
  public static void startwith(){  
	  String s1="java string split method by javatpoint";  
	  System.out.println(s1.startsWith("java "));  
	  System.out.println(s1.startsWith("java string"));  
	  }
  
}	

