package alarcos.patrones.proxy2;

import java.util.*;

public class Intermediario implements Proxy {

	private List<String> paginas = new LinkedList<>();
	private Real sujeitoReal;

	@Override
	public void Acesso(String pagina) {
		if (!paginas.contains(pagina) && paginas.size()<10){
			sujeitoReal = new Real();
			sujeitoReal.Acesso(pagina);
			paginas.add(pagina);
		} else {
			//System.out.println("Pagina " + pagina + " accedido por Cache");
		}
	}
	
	
	
}
