import modelo.Grupo;
import modelo.dao.GrupoDAO;

public class Principal {
	public static void main(String[] args) {
		
		Grupo grupo = new Grupo();
		grupo.setCodigo(4);
		grupo.setDescricao("Descrição do Grupo 4");
		grupo.setNome("Grupo 4");
		
		
		GrupoDAO grupoDAO = new GrupoDAO();
		grupoDAO.inserir2(grupo);
	}
}
