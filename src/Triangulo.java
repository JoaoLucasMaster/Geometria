
public class Triangulo {
//atributos
	private double base;
	private double haltura;
	
//metodos
	
	public void setLados(double base, double haltura)
	{
		if(base>0 && haltura>0)
		{
			this.base=base;
			this.haltura=haltura;
			
		}

	}
	
	public double calcarea()
	{
		double area;
		area= (base*haltura)/2;
		
		return area;
	}
		
	public void desenho()
	{
		for(int i=0;i<base+1;i++)
		{
			for(int j=0;j<i;j++) 
			{
				System.out.print(". ");
			    
			}
		System.out.println("");	
		}
	}
}

