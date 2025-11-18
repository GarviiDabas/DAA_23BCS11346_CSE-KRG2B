package EST;

import java.util.ArrayList;
import java.util.Stack;

class Solution {
    static ArrayList<Integer> preGreaterEle(int[] arr) {
        ArrayList<Integer> pge = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                pge.add(-1);
            } else {
                pge.add(st.peek());
            }

            st.push(arr[i]);
        }
        return pge;
    }
}