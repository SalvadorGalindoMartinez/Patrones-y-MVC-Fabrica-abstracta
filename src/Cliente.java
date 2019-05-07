
public class Cliente {

	public static FactoriaEfectos getFactoria(String tipo){

		if(tipo.equalsIgnoreCase("Sombra")){
			return new FactoriaSombras();

		}else if(tipo.equalsIgnoreCase("Luz")){
			return new FactoriaLuces();
		}

		return null;
	}

}
