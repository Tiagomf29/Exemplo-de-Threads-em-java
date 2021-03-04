
public class ExecutaThreads {

	public static void main(String[] args) {
				
		CalculaValores.executaCalculo();
		ExibeDescricoes.executaExibicaoNomes();
		
		for(int i = 0; i < 100; i ++) {
			System.out.println("Execução 1\n");
			
		}
		for(int i = 0; i < 100; i ++) {
			System.out.println("Execução 2\n");
			
		}		
		
		/* Os dois métodos estáticos estão utilizando thread e os dois FOR implementado nesta classe não utiliza thread.
		 * O resultado foi que os dois métodos estáticos executaram suas funções paralelamente a execução do primeiro e do segundo FOR desta classe.
		 * O Segundo FOR só iniciou sua execução após o término da execução do primeiro FOR e seguiu executando paralelamente às duas Threads.*/

	}

}
