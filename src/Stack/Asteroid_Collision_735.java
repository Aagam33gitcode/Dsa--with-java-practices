package Stack;

import java.util.Stack;

public class Asteroid_Collision_735 {
    public static void main(String[] args) {
        asteroid(new int[]{12,11, 3, 4,1,-10 ,2, -11, 1, 2, 3, 2,-2});

    }
    public static void asteroid(int[] arr){
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < arr.length ; i++) {
            if (st.empty()||arr[i]>0){
                st.push(arr[i]);
            }else{
                while (!st.isEmpty()){
                    int top=st.peek();
                    if (top<0){
                        st.push(arr[i]);break;
                    }
                    int modVal=Math.abs(arr[i]);
                    if (modVal==top){
                        st.pop();break;
                    }else if (modVal<top){
                        break;

                    }else{
                        st.pop();
                    }
                 if (st.isEmpty()){
                     st.push(arr[i]);
                     break;
                 }
                }

            }
        }
        System.out.println(st);

    }
}
