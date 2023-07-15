//Find if any pair in a sorted ArrayList has a TARGET sum
import java.util.ArrayList;
class PairSum
{
    //BRUTE FORCE
    // public static void findPair(ArrayList<Integer> list,int target)
    // {
    //     for(int i=0; i<list.size(); i++)
    //     {
    //         for(int j=0; j<list.size(); j++)
    //         {
    //             if(list.get(i)+list.get(j) == target)
    //             {
    //                 System.out.println("The element is:" + list.get(i)+ "," +list.get(j));
    //                 return;
    //             }
    //         }
    //     }
    //2 POINTER APPROACH
    public static void findPair(ArrayList<Integer> list,int target)
    {
        int start = 0;
        int end = list.size()-1;
        while(start!=end)
        {
            //CASE 1
            if(list.get(start) + list.get(end) == target)
            {
                System.out.println("Element is:"+ list.get(start)+ "," + list.get(end));
                return;
            }
            //CASE 2
            else if(list.get(start) + list.get(end) < target)
            {
                start++;
            }
            //CASE 3
            else
            {
                end--;
            }
        }
        System.out.println("Target is not found");
    }

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        int target = 5;
        findPair(list,target);
    }
}