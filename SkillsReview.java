
/**
 * Review Specific Java Skills.
 *
 * @author elly 
 * @version 3/7/19
 */
public class SkillsReview
{
    public static void main (String [] args)
    {
        int [] nums1 = {17, 22, 43, -10, 41, -3}; 
        int [] nums2 = {3, 8, 19, 45, 73, 74}; 
        
        System.out.println(findMaxValue(nums1)); 
    }
    
    public static int findMaxValue(int [] arr)
    {
        int x = arr[0]; 
        for (int i = 0; i < arr.length; i ++)
        {
            if (x < arr[i])
            {
                x = arr[i]; 
            }
            
        }
        return x; 
    }
   
    
    
    public static boolean inOrder (int [] arr)
    {
        int a = 0; 
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] < arr[i+1] )
         
           {
               a++;
            }
            
            if (a == arr.length -1)
            {
                return true; 
            }
           
        }
         return false; 
       }
  
}
