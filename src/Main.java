import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product water = new Product("Bonaqua", 1.56);
        System.out.println(water);

        VendingMachine mash1 = new VendingMachine();
        System.out.println(mash1);

        List<Product> tovary = new ArrayList<>();
        tovary.add(water);
        tovary.add(new Product("vine", 15.8));
        tovary.add(new Product("chocolate", 4.8));
        tovary.add(new Product("keks", 3.8));
        tovary.add(new Soda("coca-cola", 2.89, "grapes"));

        VendingMachine mash2 = new VendingMachine(tovary);
        System.out.println(mash2);
//        System.out.println(mach2.findByName("coca-cola"));
//        System.out.println(mach2.findByPrice(12));
//        System.out.println(mach2.findByPriceRange(9,13));

        List<Product>candies= new ArrayList<>();
        candies.add(new Candy("Nesquik", 4.8, "chocolate", "milk"));
        candies.add(new Candy("Bounty", 5.1, "chocolate", "coconut"));
        candies.add(new Candy("Twix", 4.9, "chocolate", "caramel"));
        candies.add(new Fruits("Apple", 2.8, "small", "sweet and sour"));
        candies.add(new Fruits("Watermelon", 6.0, "big", "sweet"));
        candies.add(new Fruits("Pear", 5.1, "small", "sugar"));

        VendingMachine mach3Turbo = new VendingMachine(candies);
        System.out.println(mach3Turbo);
    }

}