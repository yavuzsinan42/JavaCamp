package intro;

draft duck modify lumber coffee short fuel possible essay orchard clerk mosquito model divide detect farm mom earth just shallow price burger pill staff


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dont repeat Yourself
		String internetSubeButonu ="Ýnternet Þubesi";
		System.out.println(internetSubeButonu);
		double dolarDun = 8.55;
		double dolarBugun = 8.9;
		int vade= 36;
		boolean dolarDurumu = false;
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar Düþtü");
		}
		else if(dolarBugun==dolarDun) {
			System.out.println("Dolar Eþit");
		}
		else
		{
			System.out.println("Dolar Yükseldi");
		}
		
		String kredi1= "Ýhtiyac Kredisi";
		String kredi2= "Mutlu Emekli Kredisi";
		String kredi3= "Konut Kredisi";
		String kredi4= "Dugun Kredisi";
		String kredi5= "Meb Kredisi";
		
		String[] krediler = 
				{	    "Ýhtiyac Kredisi",
						"Mutlu Emekli Kredisi",
						"Konut Kredisi",
						"Dugun Kredisi",
						"Meb Kredisi",
						"KGB Kredisi"
				};
		//foreach
		for(String kredi : krediler){
			System.out.println(kredi);
		}
		
		int sayi1= 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0]= 100;
		System.out.println(sayilar1[0]);
		String kelime1 = "Yavuz";
		String kelime2 = "Sinan";
		kelime1=kelime2;
		kelime2="Yeni";
		System.out.println(kelime1);
	}

}
