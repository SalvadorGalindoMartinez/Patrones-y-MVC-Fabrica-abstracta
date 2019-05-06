
public class FactoriaLuces extends FactoriaEfectos{

	@Override
	public Sombra getSombra(String figura){
		return null;
	}
	@Override
	Luz getLuz(String color) {

		if(color == null){
			return null;
		}        
		if(color.equalsIgnoreCase("Roja")){
			return new Rojo();   
		}else if(color.equalsIgnoreCase("Verde")){
			return new Verde();        
		}else if(color.equalsIgnoreCase("Azul")){
			return new Azul();
		}    
		return null;
	}
}
