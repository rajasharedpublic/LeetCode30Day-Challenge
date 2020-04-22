import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;

public class stonewwight {

    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int stone : stones)
            maxHeap.add(-stone);

        while (maxHeap.size() > 1) {

            int stoneOne = -maxHeap.remove();
            int stoneTwo = -maxHeap.remove();

            if (stoneOne != stoneTwo) {
                maxHeap.add(-(stoneOne - stoneTwo));

            }

        }
        return maxHeap.isEmpty() ? 0 : -maxHeap.remove();
    }

    /*public static int lastStoneWeightcheck(int[] stones) {

        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        // Using the add() method
        numbers.add(4);
        numbers.add(2);
        System.out.println("PriorityQueue: " + numbers);

        // Using the offer() method
        numbers.offer(1);
        System.out.println("Updated PriorityQueue: " + numbers);

        int number = numbers.peek();
        System.out.println("Accessed Element: " + number);

        return 0;
    }*/

    public static void main(String args[]){

        int ar[]= {2,7,4,8,1};
        lastStoneWeight(ar);

    }
}
