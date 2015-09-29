package teste;

import br.com.fiap.helpbox.conexao.ConexaoFactory;

public class Teste {

	public static void main(String[] args) throws Exception {
		ConexaoFactory cf;
		new ConexaoFactory().getConnection();
		
		
		System.out.println("Abriu coneção");
	}
}
