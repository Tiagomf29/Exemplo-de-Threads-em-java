
public class ExibeMilharesDescricoes {
	
	public static void executaMilharesNomes() {
		
		new Thread() {
			
			
	      public void run() {
	    	  
	    	  
	    	  for(int i = 0; i < 300; i++) {
	    		  
	    		  System.out.println("Teste"+i+"=====================================");
	    		  
	    	  }
	    	  
	      }
			
			
		}.start();
		
	}

}
