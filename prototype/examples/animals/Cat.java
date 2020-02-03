package alarcos.patrones.prototype.examples.animals;

/**
 * Created by Alberto Gordillo
 */
public class Cat implements Animal {
	
	private int patas;
	private String color_pelo;
	private String color_ojos;
	private String raza;
	private String localidad;
	private String idPropietario;
	
	public Cat() {}
	
	
	
    public int getPatas() {
		return patas;
	}



	public void setPatas(int patas) {
		this.patas = patas;
	}



	public String getColor_pelo() {
		return color_pelo;
	}



	public void setColor_pelo(String color_pelo) {
		this.color_pelo = color_pelo;
	}



	public String getColor_ojos() {
		return color_ojos;
	}



	public void setColor_ojos(String color_ojos) {
		this.color_ojos = color_ojos;
	}



	public String getRaza() {
		return raza;
	}



	public void setRaza(String raza) {
		this.raza = raza;
	}



	public String getLocalidad() {
		return localidad;
	}



	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}



	public String getIdPropietario() {
		return idPropietario;
	}



	public void setIdPropietario(String idPropietario) {
		this.idPropietario = idPropietario;
	}



	@Override
    public Animal clone() {
        Cat aux = null;

        try {
            aux = (Cat) super.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return aux;
    }

    public String toString(){
        return "This is a Cat";
    }
}
