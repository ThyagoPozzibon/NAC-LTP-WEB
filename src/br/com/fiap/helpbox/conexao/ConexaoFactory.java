package br.com.fiap.helpbox.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoFactory {

	public Connection getConnection() throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 
	 return DriverManager.getConnection("jdbc:oracle:thin:/:@oracle.fiap.com.br:1521:ORCL", "OPS$RM73619", "030195");
	}
	
}
