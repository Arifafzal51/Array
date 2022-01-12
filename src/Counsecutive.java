// Write a program to remove consecutive duplicate elements in an array.

//        Input values
//
//        10 10 30 30 40 50 50 50 9 45
//
//        Output
//
//        10 30 40 50 9 45
//



import java.util.LinkedList;


public class Counsecutive {
    public static void main(String[] args) {
        int[] arr={10,10,30,30,40,50,50,50,30,9,45,434}; //{10,30,40,50,30,9,45,10}
        LinkedList <Integer> list1=new LinkedList<>();
        for(int i=0;i<arr.length-1;)
        {

            if(arr[i]==arr[i+1])
            {
                i++;
            }
            else
            {
                list1.add(arr[i]);
                i++;

            }

        }
        list1.add(arr[arr.length-1]);
        System.out.println(list1);
    }
}