// Wenting Li
// APCS1 pd08
// HW20 -- For the love of Strings
// 2017-10-20


public class Foresrever{
    // fenceF(int posts) takes non-negative integer posts, and returns a String representation of a fence with the specified number of posts. Uses a FOR loop

    public static String fenceF(int posts){
	String fences = "";
	for( int holder = 0; holder <= posts; holder += 1){
	    if (holder > 0){
		if (holder == 1){
		    fences += "|"; }
		else {
		    fences += "--|";}
	    }
	}
	return fences;
    }

    // reverseF(String s) a non-empty String s and returns s with its letters reversed. Uses a FOR loop
    public static String reverseF(String s){
	String rev = "";
	if (s.length() == 1) return s;

	for ( int holder = s.length(); holder > 0; holder -= 1){
	    rev += s.substring(holder - 1, holder);
	}
	return rev;
    }
    

    //reverseR(String s) a non-empty String s and returns s with its letters reversed. Employs recursion
    //WORK ON THIS ONE-------------------------------
    static String rev = "";
    public static String reverseR(String s){
	
	if (s.length() == 1){
	    rev = s + rev;
	}
	else {
	    rev = s.substring(0,1) + rev;
	    reverseR(s.substring(1));
	}
	return rev;
    }
    

    //main method
    public static void main(String[] args){
	System.out.println("testing fenceF");
	System.out.println(fenceF(0));
	System.out.println(fenceF(1));
	System.out.println(fenceF(5));

	System.out.println("---------------------------");
	System.out.println("testing reverseF");
	System.out.println(reverseF("a"));
	System.out.println(reverseF("army"));
	System.out.println(reverseF("I'm tired."));
	
	System.out.println("---------------------------");
	System.out.println("testing reverseR");
	System.out.println(reverseR("a"));
	System.out.println(reverseR("army"));
	System.out.println(reverseR("I'm tired."));
    

	//Testing length() and substring()
	//String x = "apple";
	//System.out.println();
	//System.out.println(x.length());
	//System.out.println(x.substring(3));
	//System.out.println(x.substring(1,5));
	//System.out.println(x.charAt(0));
	//System.out.println(x.charAt(x.length() - 1));
			   
    }
}// end of class Foresrever
