package alarcos.patrones.singleton;
/**
 * Created by Alberto Gordillo Rivero
 */
public class Objeto {
	private int entero = 1;
	private double doble = 2.22;
	private char caracter = 'a';
	private String cadena ="con singleton";
	private Object obj = new Object();
	
	public Objeto() {}
	
	public int getEntero() {
		return entero;
	}
	public void setEntero(int entero) {
		this.entero = entero;
	}
	public double getDoble() {
		return doble;
	}
	public void setDoble(double doble) {
		this.doble = doble;
	}
	public char getCaracter() {
		return caracter;
	}
	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}
	public String getCadena() {
		return cadena;
	}
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}

}
