
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        
        int c = A.length();
        int d = B.length();
        System.out.println(c+d);
        
        if(c>d && c==4){
            System.out.println("Yes");
        }
        else if(c<d){
            System.out.println("No");
        }
        else{
            System.out.println("No");
        }
          
        String s1 = A.substring(0,1).toUpperCase(); 
        String s2 = A.substring(1);
        String res = s1+s2; 
        
        
        String x1 = B.substring(0, 1).toUpperCase(); 
        String x2 = B.substring(1);
        String rex = x1+x2; 

        System.out.println(res+" "+rex);
    }
}



