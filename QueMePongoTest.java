import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueMePongoTest {

	@Before
	public void init() {
		Prenda zapato = new Prenda(TipoDePrenda.ZAPATO, Material.CUERO, new Color(0,0,0), null);
	}
	
	@Test
	public void crearZapato() {		
		Prenda zapato = new Prenda(TipoDePrenda.ZAPATO, Material.CUERO, new Color(0,0,0), null);
		Assert.assertEquals(0,zapato.colorPrimario.getRojo());		
		Assert.assertTrue(zapato.colorPrimario.getRojo() == 0);
	}

}

