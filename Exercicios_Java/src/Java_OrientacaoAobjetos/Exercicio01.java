package Java_OrientacaoAobjetos;

public class Exercicio01 {

	public static void main(String[] args) {
		
		//Programa básico de objeto representando informaçẽs de um lâmpada 
		
		Lampada objeto = new Lampada();
		
		objeto.tipo = "Led";
		objeto.cor = "Transparente";
		objeto.marca = "Philips";
		objeto.valor = 10;
		
		System.out.println("O tipo da lâmpada é " + objeto.tipo);
		System.out.println("A cor da lâmpada é " + objeto.cor);
		System.out.println("A marca da lâmpada é " + objeto.marca);
		System.out.println("O valor da lâmpada é " + objeto.valor);
		
	}
	
	 static class Lampada {
			
			String tipo;
			String cor;
			String marca;
			byte valor;

	 }

}

