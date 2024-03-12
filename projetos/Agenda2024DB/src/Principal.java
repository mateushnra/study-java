import java.util.ArrayList;

import modelo.Contato;
import modelo.Grupo;
import modelo.dao.ContatoDAO;
import modelo.dao.GrupoDAO;

public class Principal {
	public static void main(String[] args) {
		
		
		GrupoDAO grupoDAO = new GrupoDAO();
		ContatoDAO contatoDAO = new ContatoDAO();
		
		
		
		Grupo grupo = grupoDAO.pesquisarPorCodigo(2);
		
		Contato contato = new Contato();
		
		contato.setCodigo(1);
		contato.setNome("TesteAlterado");
		contato.setTelefone("99999-9999");
		contato.setGrupo(grupo);
		
		contatoDAO.atualizar(contato);
		
		
		
		//ArrayList<Grupo> grupos = grupoDAO.pesquisarTodos();
		
		
		
		/*if(grupos != null) {
			
			for(Grupo grupoTest: grupos){}
			grupos.forEach((grupo) -> {
				System.out.println(grupo.getNome());
				System.out.println(grupo.getDescricao());
			});
			
			

		}else {
			System.out.println("Não há retorno para o grupo pesquisado!");
		}*/
	}
}
