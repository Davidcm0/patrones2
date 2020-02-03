package alarcos.patrones.proxy2;

import java.util.LinkedList;
import java.util.List;

public class MyIntermediario {

	private List<String> paginas = new LinkedList<>();

	public void Acesso(String pagina) {
		if (!paginas.contains(pagina) && paginas.size()<10){
			//System.out.println("Pagina " + pagina + " accedido por direccion real");
			paginas.add(pagina);
		} else {
			//System.out.println("Pagina " + pagina + " accedido por Cache");
		}
	}
	
	
	
}