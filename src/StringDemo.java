public class StringDemo {

	public static void main(String[] args) {
		//methods of strings
	String s="Mphasis";
	System.out.println("Address of s "+s.hashCode());
	s=s+"India";
	System.out.println("Address of s "+s.hashCode());
	
	StringBuffer sb= new StringBuffer("Mphasis");
	System.out.println("Address..."+sb.hashCode());
	sb.append("India");
	System.out.println("Address..."+sb.hashCode());
	
	
	
	}
}
