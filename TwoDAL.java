import java.util.ArrayList;

class TwoDAL
{
    // public static void main(String args[])
    // {
    //     //creating object of 2D ArrayList
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();
        // ArrayList<Integer> list3 = new ArrayList<>();
    //     list.add(3);
    //     list.add(4);
    //     list2.add(5);
    //     list2.add(6);
    //     mainList.add(list);
    //     mainList.add(list2);
    //     System.out.println(mainList);
    //     for(int i=0; i<mainList.size(); i++)
    //     {
    //         ArrayList<Integer> currList = mainList.get(i); // Store list at index
    //         for(int j=0; j<currList.size(); j++)
    //         {
    //             System.out.print(currList.get(j)+" ");// print list of element
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i=1; i<=5; i++)
        {
            list.add(i);
            list2.add(i+5);
            list3.add(i+10);
        }
        mainList.add(list);
        mainList.add(list2);
        mainList.add(list3);
        //list.remove(2);
        System.out.println(mainList);
        for(int x=0; x<mainList.size(); x++)
        {
            ArrayList<Integer> currList = mainList.get(x);
            for(int j=0; j<currList.size(); j++)
            {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}