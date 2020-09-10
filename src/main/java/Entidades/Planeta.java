package Entidades;

import java.util.List;

import Interfaces.IPlaneta;

public class Planeta implements IPlaneta{

	private String nombre;
	private String tamaño;
	private String distanciaSol;
	private List<Luna> luna;
	
	public Planeta(String nombre, String tamaño, String distanciaSol, List<Luna> luna) {
		super();
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.distanciaSol = distanciaSol;
		this.luna = luna;
	}

	public Planeta() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getDistanciaSol() {
		return distanciaSol;
	}

	public void setDistanciaSol(String distanciaSol) {
		this.distanciaSol = distanciaSol;
	}

	public List<Luna> getLuna() {
		return luna;
	}

	public void setLuna(List<Luna> luna) {
		this.luna = luna;
	}

	@Override
	public String toString() {
		return "Planeta [nombre=" + nombre + ", tamaño=" + tamaño + ", distanciaSol=" + distanciaSol + ", luna=" + luna
				+ "]";
	}

	@Override
	public void planetas(Object object) {
		// TODO Auto-generated method stub
		Planeta mundo = (Planeta) object;
		if(mundo.getLuna().size() == 1) {
			System.out.println("Planeta: " + mundo.getNombre() + " está a " + mundo.getDistanciaSol() + "km del Sol, su tamaño es de " 
					+ mundo.getTamaño() + "km de diametro y tiene " +  mundo.getLuna().size() + " luna. ");
		} else if(mundo.getLuna().size()> 1) {
			System.out.println("Planeta: " + mundo.getNombre() + " está a " + mundo.getDistanciaSol() + "km del Sol, su tamaño es de " 
					+ mundo.getTamaño() + "km de diametro y tiene " +  mundo.getLuna().size() + " lunas. ");
		} else {
			System.out.println("Planeta: " + mundo.getNombre() + " está a " + mundo.getDistanciaSol() + "km del Sol, su tamaño es de " 
					+ mundo.getTamaño() + "km de diametro y no tiene lunas. ");
		}
		
		
	}

}
