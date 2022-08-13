import java.util.*;
  
class ImpMaps {
  
      public static void main(String args[])
    {
        Map<String, Integer> hm
            = new HashMap<String, Integer>();
  
  
        
        
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));
        
        
        System.out.println(hm.get("b"));
        System.out.println(hm.get("c"));

        
   
    }
}