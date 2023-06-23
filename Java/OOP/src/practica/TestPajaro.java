package practica;

public class TestPajaro {
	public static void main(String[] args)
 	{
 	Pajaro p;
 	p = new Pajaro();
 	Pajaro p1= new Pajaro('a', (byte)1);
 	p.setEdad((byte)5);
 	p.getEdad();
 	p1.getEdad();
 	p.printColor();
 	p1.printColor();
 	}
}
	