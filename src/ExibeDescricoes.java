
public class ExibeDescricoes {
	
	public static void executaExibicaoNomes() {
		
		new Thread() {
			
			
	      public void run() {
	    	  
	    	  
	    	  for(int i = 0; i < 300; i++) {
	    		  
	    		  System.out.println("Teste"+i+"=====================================");
	    		  
	    	  }
	    	  
	      }
			
			
		}.start();
		
	}

}
