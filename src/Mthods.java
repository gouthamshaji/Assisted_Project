
public class Mthods {
		
		public static void about() {
			
			
			System.out.println("I am static");
			
		}

      public void job() {
    	 
    	  System.out.println("I am non static");
    	  
      }
      public static void main(String[] args) {
    	  Mthods.about();
    	  Mthods jbs = new Mthods();
    	  jbs.job();
   
	}
		
	

}


