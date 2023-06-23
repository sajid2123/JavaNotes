package WIKI;

import java.util.*;



public class arrL {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<Double> list2 = new ArrayList<>();
		ArrayList<Boolean> list3 = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		//anadir datos
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		//[1, 2, 3]
		
		//sacar datos de una posicion
		System.out.println(list.get(0));
		//1
		
		//añadir datos en medio
		list.add(1,33);
		System.out.println(list);
		//[1, 33, 2, 3]
		
		//set un dato en una posicion machacando con lo que estaba antes
		list.set(3, 5);
		System.out.println(list);
		//[1, 33, 2, 5]
		
		//borrar
		list.remove(3);
		System.out.println(list);
		//[1, 33, 2]
		
		//Tamaño 
		System.out.println(list.size());
		//3
		
		//ordenar
		Collections.sort(list);
		System.out.println(list);
		//[1, 2, 33]
		
		//get index of element
		System.out.println(list.indexOf(33));
		//2
		
		
		//para borrar todo 
		list.clear();
		System.out.println(list);
		//[]

	}

}
