import java.util.ArrayList;
class MostWaterCont
{
    //TWO POINTER APPROACH
    public static int MostWater(ArrayList<Integer> height)
    {
        int res = 0;
        int i=0;
        int j=height.size()-1;
        int currArea = 0;
        while(i<j)
        {
            int ht = Math.min(height.get(i),height.get(j));
            int width = j-1;
            currArea = ht*width;
            res = Math.max(currArea,res);
            if(height.get(i) < height.get(j))
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return res;
    }
    //  BRUTE FORCE APPROACH


    // public static int MostWater(ArrayList<Integer> height)
    // {
    //     int maxWater = 0;
    //     //Brute Force
    //     for(int i=0; i<height.size(); i++)
    //     {
    //         for(int j=i+1; j<height.size(); j++)
    //         {
    //             int ht = Math.min(height.get(i),height.get(j));
    //             int width = j-i;
    //             int currWater = ht * width;
    //             maxWater = Math.max(currWater,maxWater);
    //         }
    //     }
    //     return maxWater;

    // }


    public static void main(String args[])
    {
        // height = [1,8,6,2,5,4,8,3,7];
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(MostWater(height));
    }
}