package asStaticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price=5;
		product.name="Bitki Klipsi";
		
		manager.add(product);

	}

}
