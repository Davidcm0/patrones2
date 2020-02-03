package alarcos.patrones.singleton;
/**
 * Created by Alberto Gordillo Rivero
 */
import java.util.LinkedList;
import java.util.List;

public class SinSingleton {
	
	private int entero = 1;
	private double doble = 2.22;
	private char caracter = 'a';
	private String cadena ="con singleton";
	private Object obj = new Objeto();
	
	private List<Integer> lint = new LinkedList<>();
	private List<Double> ldouble = new LinkedList<>();
	private List<Character> lchar = new LinkedList<>();
	private List<String> lstring = new LinkedList<>();
	private List<Objeto> lobj = new LinkedList<>();
	
	public SinSingleton() {
		for(int i=0;i<25;i++) {
			lint.add(i);
			ldouble.add(i*1.1);
			lchar.add('a');
			lstring.add("cadena"+i);
			lobj.add(new Objeto());
		}
	}
	
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
	public List<Integer> getLint() {
		return lint;
	}
	public void setLint(List<Integer> lint) {
		this.lint = lint;
	}
	public List<Double> getLdouble() {
		return ldouble;
	}
	public void setLdouble(List<Double> ldouble) {
		this.ldouble = ldouble;
	}
	public List<Character> getLchar() {
		return lchar;
	}
	public void setLchar(List<Character> lchar) {
		this.lchar = lchar;
	}
	public List<String> getLstring() {
		return lstring;
	}
	public void setLstring(List<String> lstring) {
		this.lstring = lstring;
	}
	public List<Objeto> getLobj() {
		return lobj;
	}
	public void setLobj(List<Objeto> lobj) {
		this.lobj = lobj;
	}
	

}
