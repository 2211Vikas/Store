
public class Customer extends User {
	Cart cart;

		public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Boolean verifyUser() {
		return true;
	}
	

}
