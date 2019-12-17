
public class Carta {


	int IdCarta;
	String Nombre;
	
	public int getIdCarta() {
		return IdCarta;
	}
	public void setIdCarta(int idCarta) {
		IdCarta = idCarta;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public Carta(int idCarta, String nombre) {
		super();
		IdCarta = idCarta;
		Nombre = nombre;
	}
}
