package algorythmchallenge;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> res = new Stack();
        for (int a : asteroids) {
            if (a > 0) {
                res.push(a);//never collide with any in the stack
            } else {
                //check collision with all Positive asteroids that have higher asb value from the right
                while (!res.empty() && res.peek() > 0 && res.peek() < Math.abs(a)) {
                    res.pop();//destroy all a* < a
                }
                //Add a if (A has max abs or empty stack or last element is neg)
                if (res.empty() || res.peek() < 0) {
                    res.push(a);
                } else if (res.peek() == Math.abs(a)) {
                    res.pop();
                }
            }
        }
        return res.stream().mapToInt(i -> i).toArray();//convert stack to int[]
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, -6, 8, 2, -2, 99, -1};
        AsteroidCollision collision = new AsteroidCollision();
        int[] res = collision.asteroidCollision(nums);
        System.out.println("==========================================");
        Arrays.stream(res).forEach(r->System.out.println(r));
    }
}
