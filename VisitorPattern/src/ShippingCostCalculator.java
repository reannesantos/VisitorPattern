public class ShippingCostCalculator implements ShippingCostVisitor {
    private double totalCost;

    public void visit(Chair chair) {
        totalCost += 10.0; // Flat rate for chairs
    }

    public void visit(Sofa sofa) {
        totalCost += 2.0 * sofa.getWidth() * sofa.getLength(); // Distance-based rate for sofas
    }

    public double getTotalCost() {
        return totalCost;
    }
}