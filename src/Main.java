
public class Main {
		   public static void main(String[] args) {
		      //Pintamos las sombras
		      FactoriaEfectos factoriaSombra = Cliente.getFactoria("Sombra");
		      
		      //Circulo
		      Sombra circulo = factoriaSombra.getSombra("Circulo");
		      circulo.dibujar();
		      //Rectangulo
		      Sombra rectangulo = factoriaSombra.getSombra("Rectangulo");
		      rectangulo.dibujar();
		      //Estrella
		      Sombra estrella = factoriaSombra.getSombra("Estrella");
		      estrella.dibujar();

		      //Pintamos las luces
		      FactoriaEfectos colorFactory = Cliente.getFactoria("Luz");

		      //Luz roja
		      Luz luzRoja = colorFactory.getLuz("Roja");
		      luzRoja.iluminar();
		      //Luz verde
		      Luz luzVerde = colorFactory.getLuz("Verde");
		      luzVerde.iluminar();
		      //Luz azul
		      Luz luzAzul = colorFactory.getLuz("Azul");
		      luzAzul.iluminar();
		   }
}
