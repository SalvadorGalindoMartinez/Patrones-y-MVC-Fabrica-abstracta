
public class FactoriaSombras extends FactoriaEfectos{
	Sombra getSombra(String figura){
		if(figura == null){
			return null;
		}        

		if(figura.equalsIgnoreCase("Circulo")){
			return new Circulo();
		}else if(figura.equalsIgnoreCase("Rectangulo")){
			return new Rectangulo();
		}else if(figura.equalsIgnoreCase("Estrella")){
			return new Estrella();
		}
		return null;
	}
	@Override
	Luz getLuz(String color) {
		return null;
	}
}
