import java.util.*;

public class Store {
	public static void main(String args[]) {
		System.out.println("Hello in my project");
		System.out.println("Which type of user you are? 1. Customer 2. Seller 3. Admin 4. Exit. ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		String typeofuser;
		
			if (choice == 1) {
				typeofuser = "Customer";
				Customer current = new Customer();
				System.out.println("What is your userId?");
				sc.nextInt();
				current.setUsedId(sc.nextLine());
				System.out.println("What is your password?");
				sc.nextInt();
				current.setPassword(sc.nextLine());
				if (current.verifyUser() == true) {
					System.out.println("User verified");
					while (true) {
					System.out.println("Do you want to- 1.View Products 2. View Cart 3. Contact Us");
					choice = sc.nextInt();
					
						if (choice == 1) {
							Catalogue catalogue = new Catalogue();
							Product[] allProducts = catalogue.getListofAllProducts();
							for (int i = 0; i < allProducts.length; i++) {
								System.out.println(allProducts[i].getProductId() + " " + allProducts[i].getProductName() + " "
										+ allProducts[i].getCost());
							}
							System.out.println("Do you want to add any product to cart? Y/N");
							sc.nextLine();
							String addToCart = sc.nextLine();
							if (addToCart.equals("Y")) {
								System.out.println("Input the product id of the product which you want to do ad to cart.");

								String productId = sc.nextLine();
								Product[] cartProducts = new Product[1];
								for (int i = 0; i < allProducts.length; i++) {
									if (allProducts[i].getProductId().equals(productId))
										cartProducts[0] = allProducts[i];

								}
								Cart cart = new Cart();
								cart.setCartId("1");
								cart.setListofProduct(cartProducts);
								System.out.println(cartProducts[0].getProductName());
								current.setCart(cart);
								System.out.println("The product is successfully added to the cart");

							}
						}
						else if(choice==2) {
							Product[] cartProducts = current.getCart().getListofProduct();
							System.out.println(current.getCart().getCartId());
							
							for (int i = 0; i < cartProducts.length; i++) {
								
								System.out.println(cartProducts[i].getProductId() + " " + cartProducts[i].getProductName() + " "
										+cartProducts[i].getCost());
							}
							System.out.println("Do you want to check out? Y/N");
							sc.nextInt();
							String checkout= sc.nextLine();
							if(checkout.equals("Y")) {
								if(current.getCart().checkOut()) {
									System.out.println("Your order is successfully placed.");
								}
							}
						}
						else if(choice == 3) {
							System.out.println("To contact us, Please mail on the store@ecommerece.com");
						}
							else if(choice==4) {
								break;
							}
							else {
								System.out.println("Invalid choice!");
							}
					}
				}
			}
			
			else if (choice == 2) 
			{
					typeofuser = "Seller";
					Seller current = new Seller();
					System.out.println("What is your userId?");
					sc.nextInt();
					current.setUsedId(sc.nextLine());
					System.out.println("What is your password?");
					sc.nextInt();
					current.setPassword(sc.nextLine());
					
					if (current.verifyUser() == true) {
						System.out.println("User verified Seller.");
					}
					System.out.println("Do you want 1.View Product 2. Add Product 3. Contact us 4. Exit");
					choice = sc.nextInt();
					
					if (choice == 1) {
						Seller seller = new Seller();
						Product[] allProducts = seller.getProductsListed();
						for (int i =0; i<allProducts.length; i++) {
							System.out.println(allProducts[i].getProductId()+" "+allProducts[i].getProductName()+" "+allProducts[i].getCost());
						}
							
						}
					else if(choice == 2) {
						System.out.println("Please provide specific detail of product.");
						Product product = new Product();
						sc.nextLine();
						String IdofProduct = sc.nextLine();
						String NameofProduct = sc.nextLine();
						String CostofProduct = sc.nextLine();
						product.setProductId(IdofProduct);
						product.setCost(CostofProduct);
						product.setProductName(NameofProduct);
						System.out.println("Your product is successfully added.");						
						
					}
					else if(choice == 3) {
						System.out.println("To contact us, Please mail on the sellers@ecommerece.com");
					}
					else if(choice == 4) {
						System.out.println("thanks");
					}
						
						else {
							System.out.println("Invalid choice!");
						}
						
				}
			else if (choice == 3) 
			{
					typeofuser = "Admintrator";
					System.out.println("I am Admintrator");
				}
			else if(choice == 4) {
				System.out.println("thanks for visiting.");
				
			}
			else {
					System.out.println("You are not a valid user.");
					
				}
		
		}

	}
	

