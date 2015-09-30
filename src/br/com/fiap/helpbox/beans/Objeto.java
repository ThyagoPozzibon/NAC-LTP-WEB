package br.com.fiap.helpbox.beans;

	/**
	 * Nesse pacote Beans, criamos uma classe chamada Objetos e colocamos
	 * os atributos que achamos necess�rio para o cadastro dos mesmos. 
	 * 
	 * A frente de cada atributo, colocamos os seus respectivos tipos primitivos.
	 * 
	 * Para criar uma classe � necess�rio criar um m�todo construtor com o mesmo
	 * nome da classe. Cada vez que criamos um objeto/atributo ele deve ser 
	 * adicionado.
	 * 
	 * Abaixo de cada atributo feito, geramos os getter's and setter's. Eles
	 * servem para pegarmos as informa��es de vari�veis da classe Objeto que s�o
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

public class Objeto {
	
	private int codigoObjeto;
	private String nome;
	private String descricao;
	private int quantidade;
	private String estado;
	private String cor;
	private String genero;	       
	
	
	
	public Objeto() {
		super();
	}
	
	public Objeto(int codigoObjeto, String nome, String descricao,
			int quantidade, String estado, String cor, String genero) {
		super();
		this.codigoObjeto = codigoObjeto;
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.estado = estado;
		this.cor = cor;
		this.genero = genero;
	}


	public int getCodigoObjeto() {
		return codigoObjeto;
	}
	public void setCodigoObjeto(int codigoObjeto) {
		this.codigoObjeto = codigoObjeto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
