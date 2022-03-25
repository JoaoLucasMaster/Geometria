
public class Retangulo {
//atributos	
private double base;
private double haltura;

//metodos

 public void setLados(double base, double haltura) 
 {
	 if (base>0 && haltura >0) 
	 {
		 this.base = base;
		 this.haltura = haltura;
     }
 
}
 
public double calcarea() 
{
	double area;
	area = base*haltura;
	
	return area;
	
}

public void desenho()
{
	for (int i = 0; i < base; i++) 
	{
		System.out.print(". ");
		
		for (int j = 0; j < haltura; j++) 
		{
			if (i == 0 || i + 1 >= base) 
			{
				System.out.print(". ");
			} 
			else 
			{
				System.out.print("  ");
			}
		}
		System.out.println(".");
	}
}
}