package ar.edu.unlam.tallerweb.basquet;

public class Jugador {

	private Estadistica estadistica = new Estadistica();
	
	public void anotarSimple(){
		this.estadistica.computarTantos(1);
	}
	
	public void anotarDoble() {
		this.estadistica.computarTantos(2);
	}
	
	public void anotarTriple() {
		this.estadistica.computarTantos(3);
	}
	
	public void cometerFalta() {
		this.estadistica.computarFalta();
	}
	
	public void asistir() {
		this.estadistica.computarAsistencia();
	}
	
	public int informarTantos(){
		return this.estadistica.getTantos();
	}
	
}
