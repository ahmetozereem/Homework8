package Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionThree {

	public static void main(String[] args) {
		
	
	// Soru 1: Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop 
	//         kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		
		List <Integer> arr1= new ArrayList <> ();
		
		arr1.add(2);
		arr1.add(3);
		arr1.add(2);
		
		int carpim =1;
		for (Integer integer : arr1) {
		carpim=carpim*integer;	
		}
		
		System.out.println("1.Soru: "+"arr1'deki tüm sayiların çarpımı: "+carpim);
		System.out.println("");
		
		//Soru 2:Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For-each loop 
		//       kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		
		int toplam = 0;
		
		for (Integer integer : arr1) {
			toplam=(int) (toplam + Math.pow(integer, 2));
		}
		
		System.out.println("2.Soru: "+"arr1'deki tüm sayiların karelerinin toplamı: "+toplam);
		System.out.println("");
		
		// Soru 3: iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		//         Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz.
		
		List <String> arrList1= new ArrayList <String> ();
		  
		arrList1.add("A"); arrList1.add("B"); arrList1.add("C"); arrList1.add("J");
		  
		System.out.println("3.Soru: "+"1.Dizi: "+arrList1);
		 
		List <String> arrList2= new ArrayList <String> ();
		  
		arrList2.add("E"); arrList2.add("A"); arrList2.add("F"); arrList2.add("G");
			  
		System.out.println("\t"+"2.Dizi: "+arrList2);
		System.out.println("");
		
		List <String> ortak= new ArrayList <String> ();
		
		for (String string1 : arrList1) {
			for (String string2 : arrList2) {
				if (string1==string2) {
				
				ortak.add(string1);
				
				}
				
			}
			
		}
			 
		if (ortak.isEmpty()) {
			
		System.out.println("3.Soru: "+"Ortak eleman yok");
		System.out.println("");
		
		}
		
		else {
		
		System.out.println("3.Soru: "+"Ortak elemanlar: "+ortak);
		System.out.println("");
		}
		
		//Soru 4: Bir String olusturunuz, bu String’deki character’leri for-each loop kullanarak yazdiriniz. ipucu: split()
		
		String str1 = "Yeni Yil 2023";
		str1 = str1.replaceAll("\\s", "");
					   
	    String[] str2 = str1.split("");
	    System.out.print("4.Soru: "+"Karakterler: ");
	    	    
	    for (String str : str2) {
	      System.out.print(str+", ");
	    }
		
		
	}

	
	
	

}
