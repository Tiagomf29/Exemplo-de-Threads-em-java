
public class ExecutaThreads {

	public static void main(String[] args) {
				
		CalculaValores.executaCalculo();
		ExibeDescricoes.executaExibicaoNomes();
		
		for(int i = 0; i < 100; i ++) {
			System.out.println("Execu��o 1\n");
			
		}
		for(int i = 0; i < 100; i ++) {
			System.out.println("Execu��o 2\n");
			
		}		
		
		/* Os dois m�todos est�ticos est�o utilizando thread e os dois FOR implementado nesta classe n�o utiliza thread.
		 * O resultado foi que os dois m�todos est�ticos executaram suas fun��es paralelamente a execu��o do primeiro e do segundo FOR desta classe.
		 * O Segundo FOR s� iniciou sua execu��o ap�s o t�rmino da execu��o do primeiro FOR e seguiu executando paralelamente �s duas Threads.*/

	}

}
