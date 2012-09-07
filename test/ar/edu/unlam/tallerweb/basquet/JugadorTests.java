package ar.edu.unlam.tallerweb.basquet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JugadorTests {

	private Jugador elJugador;

	@Before
	public void setUp() {
		elJugador = new Jugador();
	}
	
	@Test
	public void testQueAlIniciarTieneCeroPuntos(){
		
		Assert.assertEquals(0, elJugador.informarTantos());
		
	}

	
	@Test
	public void testQueAlAnotarSimpleTieneUnPunto(){
		
		elJugador.anotarSimple();
		
		Assert.assertEquals(1, elJugador.informarTantos());
		
	}
	
}
