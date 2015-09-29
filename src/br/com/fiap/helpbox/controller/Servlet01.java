package br.com.fiap.helpbox.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.helpbox.bo.UsuarioBO;

/**
 * Servlet implementation class Servlet01
 */
@WebServlet("/Servlet01")
public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	
	protected void inserirCadastro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	public Servlet01() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Get parâmetros
		try{
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		int cpf = Integer.parseInt(request.getParameter("cpf"));
		String rg = request.getParameter("rg");
		String dataNasc = request.getParameter("dataNasc");
		String endereco = request.getParameter("endereco");
		int cep = Integer.parseInt(request.getParameter("cep"));
		int telefone =  Integer.parseInt(request.getParameter("telefone"));
		String email = request.getParameter("email");
		String senha = request.getParameter("Senha");
		
		
		
		//Cadastro do usuário
		
		if(request.getParameter("cadastro").equals("cadastro")){
			UsuarioBO ub = new UsuarioBO();
			
				if(ub.novoUsuario(nome, sobrenome, cpf, rg, dataNasc, endereco, cep, telefone, email, senha)==true){
					request.setAttribute("msgPosit", "Cadastro realizado com sucesso");
					request.getRequestDispatcher("saidaCadastro.jsp").forward(request, response);
				}else{
					request.getRequestDispatcher("saidaCadastro.jsp").forward(request, response);
				}
				
		}else{
			request.getRequestDispatcher("SaidaNegativa.jsp").forward(request, response);
			
		}
		}catch (SQLException es) {
				
				es.printStackTrace();
			} catch (Exception e){
				e.printStackTrace();
			}
		request.getRequestDispatcher("SaidaNegativa.jsp");
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
