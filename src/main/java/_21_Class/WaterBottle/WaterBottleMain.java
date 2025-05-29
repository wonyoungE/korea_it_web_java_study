package _21_Class.WaterBottle;

public class WaterBottleMain {
    public static void main(String[] args) {
        WaterBottle waterBottle = new WaterBottle(500);

        waterBottle.fill(400);
        waterBottle.drink(300);
        waterBottle.fill(700);
        waterBottle.drink(1500);
        System.out.println("현재 물의 양: " + waterBottle.getCurrentWater());
    }
}
