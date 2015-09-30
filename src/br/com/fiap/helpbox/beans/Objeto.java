package br.com.fiap.helpbox.beans;

	/**
	 * Nesse pacote Beans, criamos uma classe chamada Objetos e colocamos
	 * os atributos que achamos necessário para o cadastro dos mesmos. 
	 * 
	 * A frente de cada atributo, colocamos os seus respectivos tipos primitivos.
	 * 
	 * Para criar uma classe é necessário criar um método construtor com o mesmo
	 * nome da classe. Cada vez que criamos um objeto/atributo ele deve ser 
	 * adicionado.
	 * 
	 * Abaixo de cada atributo feito, geramos os getter's and setter's. Eles
	 * servem para pegarmos as informações de variáveis da classe Objeto que são
	 * definidas como "private", porém esses métodos são definidos como "public".
	 * 
	 * As variáveis "privates" só são visíveis dentro da própria classe. 
	 *  
	 * @author Beatriz Bernardo Biserra - RM74656
	 * @author Hélder Alcântara - RM74504
	 * @author Thyago Pozzibon - RM
	 * @author Ulric Merguiço - RM
	 * @version 1.0
	 * @since 1.0
	 * 
	 */

public class Objeto {
	
	private int codigoObjeto;
	private String tipoObjeto;
	private String descricao;
	private String quantidade;
	private String peso;
	private String tamanho;
	
	
	
	public Objeto() {
		super();
	}


	public Objeto(String tipoObjeto, String descricao, String quantidade,
			String peso, String tamanho) {
		super();
		this.tipoObjeto = tipoObjeto;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.peso = peso;
		this.tamanho = tamanho;
	}







	public String getTamanho() {
		return tamanho;
	}



	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}



	public int getCodigoObjeto() {
		return codigoObjeto;
	}



	public void setCodigoObjeto(int codigoObjeto) {
		this.codigoObjeto = codigoObjeto;
	}



	public String getTipoObjeto() {
		return tipoObjeto;
	}



	public void setTipoObjeto(String tipoObjeto) {
		this.tipoObjeto = tipoObjeto;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public String getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}



	public String getPeso() {
		return peso;
	}



	public void setPeso(String peso) {
		this.peso = peso;
	}
	
	
}
	
