package Planetarium;

import Entidades.Luna;
import Entidades.Planeta;
import Planetas.Planetas;
import Planetas.Planetas.Planets;

public class Planetarium {

	Planeta planeta = new Planeta();
	Luna luna = new Luna();
	
	public void laTierra() {
		planeta.planetas(Planetas.solarSystem(Planets.La_Tierra));
		luna.lunas(Planetas.solarSystem(Planets.La_Tierra));
	}
	
	public void Marte() {
		planeta.planetas(Planetas.solarSystem(Planets.Marte));
		luna.lunas(Planetas.solarSystem(Planets.Marte));
	}
	
	public void Mercurio() {
		planeta.planetas(Planetas.solarSystem(Planets.Mercurio));
		luna.lunas(Planetas.solarSystem(Planets.Mercurio));
	}
	
	public void Jupiter() {
		planeta.planetas(Planetas.solarSystem(Planets.Júpiter));
		luna.lunas(Planetas.solarSystem(Planets.Júpiter));
	}
	
	public void Urano(){
		planeta.planetas(Planetas.solarSystem(Planets.Urano));
		luna.lunas(Planetas.solarSystem(Planets.Urano));
	}
	
	public void Venus() {
		planeta.planetas(Planetas.solarSystem(Planets.Venus));
		luna.lunas(Planetas.solarSystem(Planets.Venus));
	}
	
	public void Saturno() {
		planeta.planetas(Planetas.solarSystem(Planets.Saturno));
		luna.lunas(Planetas.solarSystem(Planets.Saturno));
	}
	
	public void Neptuno() {
		planeta.planetas(Planetas.solarSystem(Planets.Neptuno));
		luna.lunas(Planetas.solarSystem(Planets.Neptuno));
	}
}
