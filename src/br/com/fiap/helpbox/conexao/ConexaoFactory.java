package br.com.fiap.helpbox.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

	/**
	 * Para abrir uma conex�o com um banco de dados, precisamos utilizar sempre
	 * um driver. A classe DriverManager � a respons�vel por se comunicar com todos
	 * os drivers. 
	 * 
	 * Essa String chamada de String de conex�o JDBC acessa o MySQL. 
	 * 
	 * Colocamos o Exception porque vimos algumas possibilidade e detectamos alguns 
	 * poss�veis erros. 
	 * 
	 *  
	 * 
	 * @author rm74656
	 *
	 */


public class ConexaoFactory {

	public Connection getConnection() throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 
	 return DriverManager.getConnection("jdbc:oracle:thin:/:@oracle.fiap.com.br:1521:ORCL", "OPS$RM73619", "030195");
	}
	
}
