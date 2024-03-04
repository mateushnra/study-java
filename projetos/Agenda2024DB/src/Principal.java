import modelo.Grupo;
import modelo.dao.GrupoDAO;

public class Principal {
	public static void main(String[] args) {
		
		
		GrupoDAO grupoDAO = new GrupoDAO();
		Grupo grupo = grupoDAO.pesquisarPorCodigo(2);
		if(grupo != null) {
			System.out.println(grupo.getNome());
			System.out.println(grupo.getDescricao());
		}else {
			System.out.println("Não há retorno para o grupo pesquisado!");
		}
	}
}
