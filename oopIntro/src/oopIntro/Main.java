package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1,"Lenovo V14",1500,"16 GB Ram",32 ); // referans oluþturma,  instance
		
		
		
		Product product2 = new Product(); // referans oluþturma,  instance
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setUnitPrice(7000);
		product2.setDetail( "16 GB Ram"); 
		product2.setDiscount(32);
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		
		
		
		Product[] products = {product1}; 
		for(Product product : products) {
			System.out.println(product.getName());
		}
		System.out.println(products.length);
		
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Telefon");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Elma");
		//productManager.addToCart(product1);
		System.out.println("Kategori: "+category1.getName());
		System.out.println("Kategori: "+category2.getName());
	}
	/*
	public static int topla(int... sayilar) {
		return sayilar.toString();
	}*/
		
}
