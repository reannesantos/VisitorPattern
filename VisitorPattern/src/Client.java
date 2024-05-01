public class Client {
    public static void main(String[] args) {
        List<Furniture> furnitureList = new ArrayList<>();
        furnitureList.add(new Chair());
        furnitureList.add(new Sofa());

        ShippingCostCalculator calculator = new ShippingCostCalculator();
        for (Furniture furniture : furnitureList) {
            furniture.accept(calculator);
        }

        System.out.println("Total shipping cost: " + calculator.getTotalCost());
    }
}