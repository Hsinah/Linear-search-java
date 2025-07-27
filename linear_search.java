import java.util.*;
class search
{
    public int ln_search_num(int [] num,int tar)
    {
        int len = num.length;
        for(int i=0;i<len;i++)
        {
            if (num[i]==tar)
            {
                return i;
            }
        }
        return -1;
    }
    public int ln_search_string(String text,char target)
    {
        int len =text.length();
        for(int i=0;i<len;i++)
        {
            if(text.charAt(i)==target)
            {
                return i;
            }
        }
        return -1;
    }
    
    public int ln_search_minimum(int num[])
    {
        int len = num.length;
        int temp = num[0];
        for(int i=0;i<len;i++)
        {
            if(num[i]<temp)
            {
                temp =num[i];
            }
        }
        return temp;
    }
    
    public boolean ln_search_twodim_array(int arr[][],int target)
    {
        int len =arr.length;
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
public class linear_search
{
   public static void main()
   {
       search s = new search();
       Scanner sc =new Scanner(System.in);
       
       /*
       // Linear Search using numbers
       int num[] = new int[5];
       System.out.println("Enter the Search Elements");
       for(int i=0;i<5;i++)
       {
           num[i]=sc.nextInt();
       }
       int tar = sc.nextInt();
       System.out.println("Enter the Target Elements");       
       System.out.println("Element found at"+s.ln_search_num(num,tar));*/
       
       /*
       
       //  Linear Search Using String
       System.out.println("Enter the Search Elements");
       String text = sc.next();
       System.out.println("Enter the Target Elements");
       char target = sc.next().charAt(0);
       System.out.println("Element Found at"+s.ln_search_string(text,target));
       
       */
       
       /*
      
        // Linear search for minimum Number
       System.out.println("Enter the array elements");
       int num[] = new int[5];
       for(int i=0;i<5;i++)
       {
           num[i]=sc.nextInt();    
       }
       System.out.println("Element Found at"+s.ln_search_minimum(num));
       
       */
      
       /*      
       // Linear Search for multidimensional array
       
       int arr [][] ={{1,2,4,5},{15,7,18,24},{19,8,24,15}};
       int target =19;
       System.out.println("Element Found at"+s.ln_search_twodim_array(arr,target));
       
       */
      
   }
}