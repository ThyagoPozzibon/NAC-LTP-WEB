package br.com.fiap.helpbox.beans;


	/**
	 * Nossa classe chamada Usu�rio � um beans com os atributos que um usu�rio
	 * devem ter, precisam para a realiza��o de nosso Cadastro. 
	 * 
	 * A frente de cada atributo, colocamos os seus respectivos tipos primitivos.
	 * 
	 * Para criar uma classe � necess�rio criar um m�todo construtor com o mesmo
	 * nome da classe. Cada vez que criamos um objeto ele deve ser adicionado 
	 * 
	 * Abaixo de cada atributo feito, geramos os getter's and setter's. Eles
	 * servem para pegarmos as informa��es de vari�veis da classe Usu�rio que s�o
	 * definidas como "private", por�m esses m�todos s�o definidos como "public".
	 * 
	 * As vari�veis "privates" s� s�o vis�veis dentro da pr�pria classe. 
	 *  
	 * @author Beatriz Bernardo Biserra - RM74656
	 * @author H�lder Alc�ntara - RM74504
	 * @author Thyago Pozzibon - RM
	 * @author Ulric Mergui�o - RM
	 * @version 1.0
	 * @since 1.0
	 * 
	 */


public class Usuario {

	private int codigoUsuario;
	private String nome;
	private String sobrenome;
	private String rg;
	private int cpf;
	private String dtNascimento;
	private String endereco;
	private int cep;
	private int telefone;
	private String email;
	private String senha;
	
	
	
	public Usuario() {
		super();
	}

	public Usuario(int codigoUsuario, String nome, String sobrenome, String rg,
			int cpf, String dtNascimento, String endereco, int cep,
			int telefone, String email, String senha) {
		super();
		this.codigoUsuario = codigoUsuario;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
		this.endereco = endereco;
		this.cep = cep;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
	}
	public Usuario(String nome, String sobrenome, String rg,
			int cpf, String dtNascimento, String endereco, int cep,
			int telefone, String email, String senha) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
		this.endereco = endereco;
		this.cep = cep;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
	}

	
	public int getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
