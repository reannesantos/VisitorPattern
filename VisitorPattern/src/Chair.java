public class Chair implements Furniture {
	public void accept(ShippingCostVisitor visitor) {
		visitor.visit(this);
	}

}
