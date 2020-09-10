package Entidades;

import java.util.List;

import Interfaces.ILuna;

public class Luna implements ILuna {

	private String nombre;
	private String diametro;
	private String tiempoOrbita;
	
	public Luna(String nombre, String diametro, String tiempoOrbita) {
		super();
		this.nombre = nombre;
		this.diametro = diametro;
		this.tiempoOrbita = tiempoOrbita;
	}
	
	public Luna() {
		super();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDiametro() {
		return diametro;
	}

	public void setDiametro(String diametro) {
		this.diametro = diametro;
	}

	public String getTiempoOrbita() {
		return tiempoOrbita;
	}

	public void setTiempoOrbita(String tiempoOrbita) {
		this.tiempoOrbita = tiempoOrbita;
	}

	@Override
	public String toString() {
		return "Luna de nombre " + nombre + " que mide " + diametro + "km de diametro y el tiempo de orbita es de " 
				+ tiempoOrbita + " dias.";
	}

	@Override
	public void lunas(Object object) {
		// TODO Auto-generated method stub
		Planeta planeta = (Planeta) object;
		List<Luna> moon = planeta.getLuna();
		if(moon.size() != 0) {
			for(Luna lunita : moon) {
				System.out.println("Luna de nombre " + lunita.getNombre() + " que mide " + lunita.getDiametro() 
					+ "km de diametro y el tiempo de orbita es de " + lunita.getTiempoOrbita() + " dias.");
			}
		}
	}

}
