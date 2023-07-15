import java.util.ArrayList;
public class Classroom
{
    public static void main(String args[])
    {
        //className objectName = new className();
        ArrayList<Integer> list = new  ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        //add - O(1)
        list.add(4);
        list.add(1);
        list.add(7);
        list.add(0);
        System.out.println(list.size());
        System.out.println(list);
        for(int i=list.size()-1; i>=0; i--)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}