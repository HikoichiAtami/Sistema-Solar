package Planetas;

import java.util.ArrayList;
import java.util.List;

import Entidades.Luna;
import Entidades.Planeta;

public class Planetas {

public enum Planets{La_Tierra, Marte, Mercurio,Venus,Júpiter,Saturno,Urano,Neptuno};
	
	public static Planeta solarSystem(Planets planeta){
		Luna luna = new Luna();
		Luna lunita = new Luna();
		List<Luna> moon = new ArrayList<Luna>();
		Planeta mundo = new Planeta();
		switch (planeta) {
			case Mercurio:
				mundo.setNombre("Mercurio");
				mundo.setTamaño("4.880");
				mundo.setDistanciaSol("57.910.000");
				mundo.setLuna(moon);
				return mundo;
				
			case Venus:
				mundo.setNombre("Venus");
				mundo.setTamaño("12.104");
				mundo.setDistanciaSol("108.200.000");
				mundo.setLuna(moon);
				return mundo;
				
			case La_Tierra:
				luna.setNombre("Luna");
				luna.setDiametro("3476");
				luna.setTiempoOrbita("27.322");
				mundo.setNombre("La Tierra");
				mundo.setTamaño("12.756");
				mundo.setDistanciaSol("149.600.000");
				moon.add(luna);
				mundo.setLuna(moon);
				return mundo;
				
			case Marte:
				lunita.setNombre("Deimos");
				lunita.setDiametro("8");
				lunita.setTiempoOrbita("1.263");
				moon.add(lunita);
				luna.setNombre("Phobos");
				luna.setDiametro("28 X 20");
				luna.setTiempoOrbita("0.319");
				moon.add(luna);
				mundo.setNombre("Marte");
				mundo.setTamaño("6.794");
				mundo.setDistanciaSol("227.940.000");
				mundo.setLuna(moon);
				return mundo;
				
			case Júpiter:
				lunita.setNombre("Adrastea");
				lunita.setDiametro("26 X 16");
				lunita.setTiempoOrbita("0.298");
				moon.add(lunita);
				luna.setNombre("Callisto");
				luna.setDiametro("4800");
				luna.setTiempoOrbita("16.689");
				moon.add(luna);
				mundo.setNombre("Júpiter");
				mundo.setTamaño("142.984");
				mundo.setDistanciaSol("778.330.000");
				mundo.setLuna(moon);
				return mundo;
				
			case Saturno:
				lunita.setNombre("Aegir");
				lunita.setDiametro("6");
				lunita.setTiempoOrbita("1116,5");
				moon.add(lunita);
				luna.setNombre("Hyperion");
				luna.setDiametro("360 X 226");
				luna.setTiempoOrbita("21.277");
				moon.add(luna);
				mundo.setNombre("Saturno");
				mundo.setTamaño("108.728");
				mundo.setDistanciaSol("1.429.400.000");
				mundo.setLuna(moon);
				return mundo;
				
			case Urano:
				lunita.setNombre("Cordelia");
				lunita.setDiametro("26");
				lunita.setTiempoOrbita("0.335");
				moon.add(lunita);
				luna.setNombre("Puck");
				luna.setDiametro("154");
				luna.setTiempoOrbita("0.762");
				moon.add(luna);
				mundo.setNombre("Urano");
				mundo.setTamaño("51.118");
				mundo.setDistanciaSol("2.870.990.000");
				mundo.setLuna(moon);
				return mundo;
				
			case Neptuno:
				lunita.setNombre("Galatea");
				lunita.setDiametro("140");
				lunita.setTiempoOrbita("0.33");
				moon.add(lunita);
				luna.setNombre("Triton");
				luna.setDiametro("2.705");
				luna.setTiempoOrbita("5.877");
				moon.add(luna);
				mundo.setNombre("Neptuno");
				mundo.setTamaño("49.532");
				mundo.setDistanciaSol("4.504.300.000");
				mundo.setLuna(moon);
				return mundo;
		}
		
		
		return null;
}
}
