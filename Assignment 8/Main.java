/*
Remember that stacks/queues/linkedlists all work super similarly to arraylists, so i bet you $10 you could reference earlier HW if you get stuck....

1. Take the stack I created and find the maximum and minimum value
2. Find out how many elements were in the stack

3. Find the middle value of the linkedlist I created

4. Implement a real life example of any of the structures and do at least 3 operations to it
*/

import java.util.Stack;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stax = new Stack<>();
        
        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.push(386);

        int max = 0;    // Set initial max to 0
        int min = 9999; // Set initial min to a large value

        for (int i = 0; i < stax.size(); i++) { // For each element in the stack
            int num = stax.get(i);  // Get the element at current index
            if (num > max) {        // If current element is greater than max
                max = num;          // Current element becomes the new max
            }
            if (num < min) {        // If current element is less than min
                min = num;          // Current element becomes the new min
            }
        }

        System.out.println("Max value in stack: " + max);
        System.out.println("Min value in stack: " + min);
        System.out.println("Number of elements in stack: " + stax.size());

        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);

        int middleValue = linky.get(linky.size() / 2); // Get the middle value by getting the element at index size/2
        System.out.println("Middle value in linked list: " + middleValue);

        Stack<Integer> driveDistance = new Stack<>();

        driveDistance.push(220); // Measures distance of previous driver shots hit while golfing
        driveDistance.push(200);
        driveDistance.push(243);
        driveDistance.push(198);
        driveDistance.push(203);

        System.out.println("Most recent drive distance: " + driveDistance.peek());
        
        driveDistance.push(250);
        System.out.println("New drive distance added: " + driveDistance.peek());

        System.out.println("All drive distances: " + driveDistance);

    }
}