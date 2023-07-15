import java.util.ArrayList;
public class Swap
{
    public static void swap(ArrayList<Integer> list,int idx1,int idx2)
    {
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String args[])
    {
        //className objectName = new className();
        ArrayList<Integer> list = new  ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();
        //add - O(1)
        list.add(4);
        list.add(1);
        list.add(7);
        list.add(0);

        //System.out.println(list.size());
        int idx1=1,idx2=3;
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.println(list);
        
    }
}