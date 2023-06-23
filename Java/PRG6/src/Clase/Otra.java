package Clase;

import java.text.DateFormat;
import java.util.Date;

public class Otra {
	public static void main(String[] args) {
		 Date h=new Date();
		 String hoystr=DateFormat.getDateTimeInstance().format(h);
		 System.out.println(" la hora de hoy es: " + hoystr);

		 String d=hoystr.substring(hoystr.length()-8,hoystr.length());
		 System.out.println(" la hora de hoy es: " + d);
		}
}
