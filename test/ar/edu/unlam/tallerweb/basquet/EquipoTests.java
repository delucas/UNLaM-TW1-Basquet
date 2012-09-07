package ar.edu.unlam.tallerweb.basquet;

import org.junit.Assert;
import org.junit.Test;

public class EquipoTests {

	@Test
	public void testComputoDePuntosEsCorrectoParaUnJugador(){
		Equipo elEquipo = new Equipo();
		
		Jugador jordan = new Jugador();
		Jugador ginobili = new Jugador();
		Jugador rodman = new Jugador();
		Jugador bryant = new Jugador();
		
		elEquipo.agregarJugador(jordan);
		elEquipo.agregarJugador(ginobili);
		elEquipo.agregarJugador(rodman);
		elEquipo.agregarJugador(bryant);
		
		jordan.anotarDoble();
		jordan.anotarDoble();
		jordan.anotarDoble();
		
		ginobili.anotarTriple();
		ginobili.anotarTriple();
		ginobili.anotarTriple();
		
		bryant.anotarDoble();
		bryant.anotarSimple();
		
		Assert.assertEquals(18, elEquipo.obtenerPuntaje());
		
	}
	
}
