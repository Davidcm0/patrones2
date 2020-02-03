package alarcos.patrones.proxy2;

public class Cliente {
	public static void main(String[] args) {
		Proxy sujeito = new Intermediario();
		sujeito.Acesso("www.google.com");
		sujeito.Acesso("www.google.com");
	}
}