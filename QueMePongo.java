import java.util.List;

public class QueMePongo {
	public static void main(String[] args) {		
		System.out.println("Hola Mundo");
		Prenda zapato = new Prenda(TipoDePrenda.ZAPATO, Material.CUERO, new Color(0,0,0), null);
		Prenda camisa = new Prenda(TipoDePrenda.CAMISA, Material.ALGODON, new Color(18,43,204), new Color(17,175,207));
		Prenda pantalon = new Prenda(TipoDePrenda.PANTALON, Material.JEAN, new Color(53,63,11), null);
		System.out.println("Prendas validas creadas");
		System.out.println(zapato.colorPrimario.getRojo());
		//Prenda pantalonSinMaterial = new Prenda(TipoDePrenda.PANTALON, null, new Color(53,63,11), null);
		
	}
}

class Prenda {
	TipoDePrenda tipoDePrenda;
	Material material;
	Color colorPrimario;
	Color colorSecundario;
	

	Prenda(TipoDePrenda tipoDePrenda, Material material,Color colorPrimario, Color colorSecundario) {
		if(tipoDePrenda == null) {throw new PrendaInvalidaException("Falta el tipo de prenda");}
		if(material == null) {throw new PrendaInvalidaException("Falta el material");}
		if(colorPrimario == null) {throw new PrendaInvalidaException("Falta el color");}
		this.tipoDePrenda = tipoDePrenda;
		this.material = material;
		this.colorPrimario = colorPrimario;
		this.colorSecundario = colorSecundario;		
	}
	
	TipoDePrenda getTipoDePrenda() {
		return tipoDePrenda;
	}
}

class Color {
	int rojo, verde, azul;
	
	Color(int rojo, int verde, int azul) {
		this.rojo = rojo;
		this.verde = verde;
		this.azul = azul;
	}
	int getRojo() {
		return this.rojo;
	}
}

class PrendaInvalidaException extends RuntimeException {
	
	PrendaInvalidaException(String causa) {
		super("La Prenda es invalida porque: " + causa);
	}
}