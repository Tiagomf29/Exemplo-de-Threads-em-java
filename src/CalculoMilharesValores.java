import java.util.ArrayList;
import java.util.Random;

public class CalculoMilharesValores {
	
	public static void executaCalculo() {
		
		new Thread() {

			public void run() {
				
				Random r = new Random();
				ArrayList<Integer> lista = new ArrayList<>();
				double b = 1;
				
				for(int i =0; i < 200; i++) {
					lista.add(r.nextInt(100000));
				}
				
				for(int a : lista) {
					
					b += a;
					System.out.println(b+"*****************************************************\n\n");
				}
				
				
				
			}
		   
		  }.start();
		
		
	}

}
