package Question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionTwo {

	public static void main(String[] args) {
		
	// 1) Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.
		
	
	  List <String> arrList1= new ArrayList <String> ();
	  
	  arrList1.add("A"); arrList1.add("C"); arrList1.add("E"); arrList1.add("F");
	  
	  System.out.println("1.Soru: "+arrList1);
	 
		
		
	// 2) indexsiz add() methodunu kullanarak, B’yi ekleyiniz. index’li add() methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.
	//    ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B.
	  
	  arrList1.add("B");
	  arrList1.add(1, "L"); 
	  System.out.println("");
	  System.out.println("2.Soru: "+arrList1);
	  
	  
	  //3) set() methodu kullanarak, E’yi D yapiniz.ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.
	  
	  arrList1.set(3, "D");
	  System.out.println("");
	  System.out.println("3.Soru: "+arrList1);
	  
	  //4) remove() methodu kullanarak, F’yi siliniz. ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
	  
	  arrList1.remove("F");
	  System.out.println("");
	  System.out.println("4.Soru: "+arrList1);
	  
	  //5)sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.
	  
	  Collections.sort(arrList1);
	  System.out.println("");
	  System.out.println("5.Soru: "+arrList1);
	  
	  //6) contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var olmadigini dogrulayiniz.
	  
	  System.out.println("");
	  System.out.println("6.Soru: "+"L arrList1'de Var: "+arrList1.contains("L") );
	  System.out.println("");
	  System.out.println("6.Soru: "+"M arrList1'de Var: "+arrList1.contains("M") );
	  
	  
	  // 7) size() methodu kullanarak, list’in kag eleman oldugunu ekrana yazdiriniz.
	  
	  System.out.println("");
	  System.out.println("7.Soru: "+"Bu dizinin eleman sayısı: "+arrList1.size());
	  
	  //8)clear() methodu kullanarak, list’deki tum elemanlari siliniz.
	  
	  arrList1.clear();
	  System.out.println("");
	  System.out.println("8.Soru: "+arrList1);
	  
	  //9) isEmpty() methodu kullanarak, list’deki tum elemanlarin silindigini dogrulayiniz.
	  
	  System.out.println("");
	  System.out.println("9.Soru: "+"Bu dizinin tüm elemanları silindi: "+arrList1.isEmpty());
	  
	}

}
