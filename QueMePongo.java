import java.util.List;

public class QueMePongo {
	public static void main(String[] args) {		
		System.out.println("Hola Mundo");
		Prenda zapatos = new Zapatos("Cuero","Negro",null);
		Prenda pantalon = new Pantalon("Jean","Azul",null);
		Prenda camisaMangasCortas = new CamisaMangasCortas("Algodon","Rojo","Blnco");
		
	}
}

abstract class Prenda {
	String tipo;
	String categoria;
	String material;
	String colorPrimario;
	String colorSecundario;
	
	Prenda(String material,String colorPrimario, String colorSecundario) {
		this.tipo = tipo;
		this.material = material;
		this.colorPrimario = colorPrimario;
		this.colorSecundario = colorSecundario;		
	}
}

class Zapatos extends Prenda {
	String tipo = "Zapatos";
	String categoria = "Calzado";
	
	Zapatos(String material,String colorPrimario, String colorSecundario) {
		super(material, colorPrimario, colorSecundario);
	}
}

class CamisaMangasCortas extends Prenda {
	String tipo = "CamisaMangasCortas";
	String categoria = "Parte Superior";
	
	CamisaMangasCortas(String material,String colorPrimario, String colorSecundario) {
		super(material, colorPrimario, colorSecundario);		
	}
}

class Pantalon extends Prenda {
	String tipo = "Pantalon";
	String categoria = "Parte Inferior";
	
	Pantalon(String material,String colorPrimario, String colorSecundario) {
		super(material, colorPrimario, colorSecundario);
	}
}

class Anteojos extends Prenda {
	String tipo = "Anteojos";
	String categoria = "Parte Inferior";
	
	Anteojos(String material,String colorPrimario, String colorSecundario) {
		super(material, colorPrimario, colorSecundario);
	}
}

class Atuendo {
	List<Prenda> prendas;
	
	Atuendo(List<Prenda> prendas) {
		this.prendas = prendas;
	}
	List<Prenda> getPrendas() {
		return prendas;
	}
}
