
public class Main {

	public static void main(String[] args) 
	{
		
		 Quadrado quadrado = new Quadrado();

	        quadrado.setLado(7);
	        System.out.println("A area do quadrado é: " + quadrado.calcarea());
	        System.out.println("O desenho do quadrado é: ");
	        quadrado.desenho();
	        
	        Retangulo retangulo = new Retangulo();
	        retangulo.setLados(4, 5);
	        System.out.println("Area do retangulo é: "+retangulo.calcarea());
	        System.out.println("O desenho do retangulo é: ");
	        retangulo.desenho();
	        
	        Circulo circulo = new Circulo();
	        circulo.setRaio(4);
	        System.out.println("Area do circulo é: "+circulo.calcarea());
	        //System.out.println("O desenho do circulo é: ");
	        //circulo.desenho();
	        
	        Triangulo triangulo = new Triangulo();
	        triangulo.setLados(5,6);
	        System.out.println("A area do triangulo é: " + triangulo.calcarea());
			System.out.println("O desenho do triangulo é: ");
			triangulo.desenho();
	}

}
