
public class Circulo {
//Atributos
	
	private double raio;
	private double pi= 3.14;
	
	//metodos
	public void setRaio(double raio)
	
	{
	if(raio>0)
	{
		this.raio=raio;
	}
		
	}
	public double calcarea()
	{
		double area;
		area = pi*raio*raio;
		
		return area;
	}
}
