package br.com.fiap.helpbox.bo;

import java.util.List;

import br.com.fiap.helpbox.beans.Objeto;
import br.com.fiap.helpbox.dao.ObjetoDAO;

	 /**
	  * Nesse pacote BO, criamos uma classe chamada 'ObjetoBO'. 
	  * 
	  * 
	  * 
	  * @author rm74656
	  *
	  */



public class ObjetoBO {

	
		// CRUD + List

	public ObjetoBO() {
			super();
			// TODO Auto-generated constructor stub
		}

	// CRUD (Create)
	public boolean novoObjeto(Objeto o) throws Exception{
// pessoa precisa estar cadastrada
		if(new ObjetoDAO().addObjeto(o)==true){
			return true;
		}else{
			return false;
		}
	}

	// CRUD (Read)
	//public Objeto consultarObjeto(String o) throws Exception{
	//	return new ObjetoDAO().pesquisarObjeto(o.toUpperCase());
//	}

	// CRUD (Update)
	//public int (String o) throws Exception{
		//return new ObjetoDAO().
	//}

	// CRUD (Delete)
	//public int excluirObjeto(String o) throws Exception{
		//return new ObjetoDAO().deletarObjeto(o);
//	}

	// List
//	public List<Objeto> listarObjetos() throws Exception{
	//	return new ObjetoDAO().listObjeto();
//	}

}
