package ar.edu.unlam.tallerweb.basquet;

import java.util.LinkedList;

public class Equipo {

	private LinkedList<Jugador> jugadores = 
			new LinkedList<Jugador>();
	
	public void agregarJugador(Jugador jugador) {
		this.jugadores.add(jugador);
	}
	
	public void pedirTiempo(){
		//...
	}

	public int obtenerPuntaje(){
		int puntosTotales = 0;
		for (Jugador jugador : this.jugadores) {
			puntosTotales  += jugador.informarTantos();
		}
		
		return puntosTotales;
	}
	
}
