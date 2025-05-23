package _21_Class.WaterBottle;

public class WaterBottle {
    private int currentWater;   // 현재 물의 양

    WaterBottle(int currentWater) {
        this.currentWater = currentWater;
    }

    public void fill(int water) {
        if(water > 0 && this.currentWater + water <= 1000) {
            this.currentWater += water;
            System.out.println(water + "의 양만큼 물병에 물을 채웠습니다. 현재 물의 양: " + currentWater);
        } else {
            System.out.println("0이하의 물을 채우거나 물병의 양을 초과할 수 없습니다. 현재 물의 양: " + this.currentWater);
        }
    }

    public void drink(int water) {
        if(water > 0 && this.currentWater >= water) {
            this.currentWater -= water;
            System.out.println("물을 마셨습니다. 남은 물의 양: " + this.currentWater);
        } else {
            System.out.println("0이하의 물을 마시거나 현재 물병 물의 양이 부족합니다. 현재 물의 양: " + this.currentWater);
        }
    }

    public int getCurrentWater() {
        return this.currentWater;
    }
}
