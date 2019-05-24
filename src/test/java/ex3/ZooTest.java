package ex3;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ZooTest {

	@Test
	public void testZoo() {
		Zoo newZoo = new Zoo("zooZoo");
		Assert.assertEquals(newZoo.getNom(),"zooZoo");
		Assert.assertNotNull(newZoo.getSavaneAfricaine());
		Assert.assertNotNull(newZoo.getAquarium());
		Assert.assertNotNull(newZoo.getFermeReptile());
		Assert.assertNotNull(newZoo.getZoneCarnivore());
	}

	@Test
	public void testAddAnimal() {
		Zoo newZoo = new Zoo("zooZoo");
		newZoo.addAnimal("Licorne", "MAMMIFERE", "HERBIVORE");
		Assert.assertEquals(newZoo.getSavaneAfricaine().compterAnimaux(),1);
		Assert.assertEquals(newZoo.getAquarium().compterAnimaux(),0);
		Assert.assertEquals(newZoo.getFermeReptile().compterAnimaux(),0);
		Assert.assertEquals(newZoo.getZoneCarnivore().compterAnimaux(),0);


	}

}
