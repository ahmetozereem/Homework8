package Question1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class QuestionOne {

	public static void main(String[] args) {
		
		// Soru 1) Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana yazdiran bir method yaziniz.{ {1,2,3}, {4,5,6} }
		
		
		  int [] [] arr1 = { {1,2,3}, {4,5,6} }; int Carpim =1;
		  
		  for (int i = 0; i < arr1.length; i++) {
		  
			  for (int j = 0; j < arr1 [0].length; j++) {
		  
				  Carpim = Carpim*arr1[i] [j]; 
			}
		  
		  } 
		  
		  System.out.println("Soru 1: "+Carpim);//720
		  System.out.println("");
		 	
		
		//Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini ekrana yazdiran bir program yaziniz.{ {1,2,3}, {4,5}, {6} }
		
		
		  int [] [] arr2 = { {1,2,3}, {4,5},{6} };
		  
		  int Carpim2 =1;
		  
		  for (int i = 0; i < arr2.length; i++) {
		  
			  Carpim2 = Carpim2*arr2[i] [arr2 [i].length-1];
		  
		  } 
		  
		  System.out.println("Soru 2: "+Carpim2);//90
		  System.out.println("");
		 		 	
	
		//?? Soru 3) Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip elemanlarin toplamini ekrana yazdiran bir program yaziniz. 
		//		  arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
		
		  int [] [] arr4 = { {1,2}, {3,4,5},{6} };
		  int [] [] arr5 = { {7,8,9}, {10,11},{12} };
		  
		  System.out.print("Soru 3: ");
		  
		  int [] toplam3= new int [5];
		  for (int i = 0; i < arr4.length; i++) {
			  
			  int toplam4=0;
			    for (int j = 0; j < arr4 [i].length; j++) {
				  
				  for (int i2 = 0; i2 < arr5.length; i2++) {
					  for (int k = 0; k < arr5 [i2].length; k++) {
					
						if (i==i2 && j==k) {
							toplam4 = arr4 [i] [j] + arr5 [i2] [k];
							System.out.print(toplam4+", ");
						}
					}
					
				}
				
			}
			
		}
		  
		  System.out.println("");
		
		
		
		
		//Soru4) Asagidaki multidimensional array’in ic array’lerindeki tum elemanlarin toplamini birer birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’I ekrana yazdiran bir 
		//program yaziniz.Ornek;{{1,2,3},{4,5},{6,7}}==>1+2+3=64+5=96+7=13==>output:{6,9,13}		
		
		
		  int [] [] arr3 = { {1,2,3}, {4,5},{6,7} };
		  
		  int[] toplam2 = new int [arr3.length];
		  
		  for (int i = 0; i < arr3.length; i++) { int rakamToplam=0; 
		  		for (int j = 0; j< arr3[i].length; j++) {
		  
		  			rakamToplam += arr3 [i] [j]; 
		  			toplam2 [i] = rakamToplam;
		  
		  } 
		 }
		  System.out.print("Soru 4: ");
		  System.out.println(Arrays.toString(toplam2));//{6,9,13}
		  System.out.println("");
		 	
		
		//Soru5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin.
		
		
		  Scanner scan = new Scanner (System.in);
		  System.out.println("Soru 5: "+"Bir Cümle Yazınız: ");
		  
		  String cumle = scan.nextLine();
		  
		  //System.out.println(cumle);
		  System.out.println("");
		  
		  String[] kelime = cumle.split(" ");
		  //System.out.println(Arrays.toString(str2));
		  
		  String letters = cumle.replaceAll("\\d","").replaceAll("\\s","").replaceAll("\\W", "");
		  
		  System.out.println("Cümledeki kelime sayısı: "+kelime.length);
		  System.out.println("Cümledeki harf sayısı  : "+letters.length());
		  
		  scan.close();
		
	}

}
