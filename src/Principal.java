import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		//Programa Principal
		 
		List<Carta> listado = new ArrayList<Carta>();
		listado.add(new Carta(3, "Oros"));
		listado.add(new Carta(7, "Copas"));
		listado.add(new Carta(1, "Bastos"));
		

		listado.add(new Carta(1, "Oros"));
		listado.add(new Carta(3, "Bastos"));
		listado.add(new Carta(4, "Bastos"));
		

		listado.add(new Carta(3, "Espadas"));
		listado.add(new Carta(7, "Copas"));

	}
}
