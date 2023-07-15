import java.util.ArrayList;

import javax.lang.model.util.ElementScanner14;
class pairSum2
{
    public static boolean pairSum(ArrayList<Integer> list,int target)
    {
        int pivot = -1;
        //first find pivot
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i) > list.get(i+1))
            {
                pivot = i;
                break;
            }
        }
        int st = pivot+1; //starting index
        int end = pivot; //last index which is bigger then all
        while(st != end)
        {
            //case1
            if(list.get(st) + list.get(end) == target)
            {
                return true;
                //break;
            }
            //case2
            else if(list.get(st) + list.get(end) > target)
            {
                end = (list.size() + end -1) % list.size();
            }
            //case3
            else
            {
                st = (st + 1) % list.size();
            }
        }
        return false;
    }


    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 156;
        System.out.println(pairSum(list,target));

    }
}