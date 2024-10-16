import java.util.*;

class Main 
{
    public static void Pattern1(int n)
    {
        System.out.print("Pattern 1\n");
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Pattern2(int n)
    {
        System.out.print("Pattern 2\n");
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Pattern3(int n)
    {
        System.out.print("Pattern 3\n");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i == 0 || i == n - 1 || j == 0 || j == n - 1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void Pattern4(int n)
    {
        System.out.print("Pattern 4\n");
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Pattern5(int n)
    {
        System.out.print("Pattern 5\n");
    
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void Pattern6(int n)
    {
        System.out.print("Pattern 6\n");
    
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i + 1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Pattern7(int n)
    {
        System.out.print("Pattern 7\n");
    
        for(int i = 1; i <= n; i++)
        {
            int count = 1;
            for(int j = 1; j <= n - i + 1; j++)
            {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }

    public static void Pattern8(int n)
    {
        System.out.print("Pattern 8\n");

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
            
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    
    public static void Pattern9(int n)
    {
        System.out.print("Pattern 9\n");

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
      
            for(int j = 1; j <= 2 * n - (2 * i - 1);j++)
            {
                System.out.print("*");
            }
 
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
        
            System.out.println();
        }
    }
    
    public static void Pattern10(int n)
    {
        System.out.print("Pattern 10\n");

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
      
        for(int j = 1; j <= 2 * n - (2 * i);j++){
            
            System.out.print(" ");
        }
 
        for (int j = 1; j <= i; j++)
        {
            System.out.print("*");
        }
        
        System.out.println();
        }
    }   
    public static void Pattern11(int n)
    {
        System.out.print("Pattern 11\n");

        for (int i = 1; i < n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
      
            for(int j = 1; j <= 2 * n - (2 * i);j++){
                
                System.out.print(" ");
            }
 
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
        
            System.out.println();
        }
        for (int i = n; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
      
            for(int j = 1; j <= 2 * n - (2 * i);j++){
                
                System.out.print(" ");
            }
 
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
        
            System.out.println();
        }
    }   
    
    public static void Pattern12(int n)
    {
        System.out.print("Pattern 12\n");

        for(int i = 1; i < n; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
            
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }
        for(int i = n; i >= 1; i--)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
            
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    
    public static void Pattern13(int n)
    {
        System.out.print("Pattern 13\n");
        
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            
            for(int j = 1; j <= n; j++)
            {
                System.out.print("*");
            }
            
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }
    public static void Pattern14(int n)
    {
        System.out.print("Pattern 14\n");
        
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            
            for(int j = 1; j <= 2 * i - 1; j++)
            {
                if(j == 1 || j == 2 * i - 1) System.out.print("*");
                else System.out.print(" ");
            }
            
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            
            for(int j = 1; j <= 2 * i - 1; j++)
            {
                if(j == 1 || j == 2 * i - 1) System.out.print("*");
                else System.out.print(" ");
            }
            
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
    }
    public static void Pattern15(int n)
    {
        System.out.print("Pattern 15\n");
        
        for(int i = n; i >= 1; i--)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
            
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }
        
        for(int i = 2; i <= n; i++)
        {
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
            
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            System.out.println();
        }
        
    }
    public static void Pattern16(int n)
    {
        System.out.print("Pattern 16\n");
        
         for(int i = 1; i <= 2 * n - 1; i++)
         {
        
          // stars would be equal to the row no. uptill first half
          int stars = i;
          
          // for the second half of the rotated triangle.
          if(i > n) stars = 2 * n - i;
          
          // for printing the stars in each row.
          for(int j = 1; j <= stars; j++)
          {
              System.out.print("*");
          }
          
          // As soon as the stars for each iteration are printed, we move to the
          // next row and give a line break otherwise all stars
          // would get printed in 1 line.
          System.out.println();
        }

        
    }
    
    public static void Pattern17(int n)
    {
        System.out.print("Pattern 17\n");
        
        for (int i = n; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
      
            for(int j = 1; j <= 2 * n - (2 * i);j++){
                
                System.out.print(" ");
            }
 
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        for (int i = 2; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
      
            for(int j = 1; j <= 2 * n - (2 * i);j++){
                
                System.out.print(" ");
            }
 
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
    public static void Pattern18(int n)
    {
        System.out.print("Pattern18\n");
        
        for(int i = 1; i <= n; i++)
        {
            int count = i;
            for(int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print(count);
                count++;
            }
            int cnt = i;
            for(int j = 1; j < i; j++)
            {
                System.out.print(cnt);
                cnt--;
            }
            
            System.out.println();
        }
    }
    public static int fact(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        int fact = 1;
        for(int i = 2; i <= n; i++)
        {
            fact = fact * i;
        }
        return fact;
    }
    public static void PascalTriangle(int n)
    {
        System.out.print("PascalTriangle Pattern19\n");
        
        for(int i = 0; i < n; i++)
        {
            int num = 1;
            for(int j = 0; j < n - i; j++)
            {
                System.out.print(" ");
            }
        
            for(int j = 0; j <= i; j++)
            {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
    
    public static void SpiralPattern(int m, int n)
    {
        int arr[][] = new int[m][n];
        int count = 1;
        
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                arr[i][j] = count;
                count++;
            }
        }
        
        System.out.print("SpiralPattern\n");
        int k = 0, l = 0;
        int I = 0;
        int totalElements = m * n;
        
        while(k < m && l < n)
        {
            
            
            for(int i = l; i < n && I < totalElements; i++)
            {
                System.out.print(arr[k][i] + " ");
                I++;
                
            }
            k++;
            
            for(int i = k; i < m  && I < totalElements; i++)
            {
                System.out.print(arr[i][n - 1] + " ");
                I++;
            }
            n--;
            
            for(int i = n - 1 ; i >= l  && I < totalElements; i--)
            {
                System.out.print(arr[m - 1][i] + " ");
                I++;
            }
            m--;
            
            for(int i = m - 1; i >= k  && I < totalElements; i--)
            {
                System.out.print(arr[i][l] +  " ");
                I++;
            }
            l++;
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Pattern1(5);
        Pattern2(5);
        Pattern3(5);
        Pattern4(5);
        Pattern5(5);
        Pattern6(5);
        Pattern7(5);
        Pattern8(5);
        Pattern9(5);
        Pattern10(5);
        Pattern11(5);
        Pattern12(5);
        Pattern13(5);
        Pattern14(5);
        Pattern15(5);
        Pattern16(5);
        Pattern17(5);
        Pattern18(5);
        PascalTriangle(5);
        SpiralPattern(5,5);
    }
}
/*
Output
Pattern 1
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
Pattern 2
* 
* * 
* * * 
* * * * 
* * * * * 
Pattern 3
*****
*   *
*   *
*   *
*****
Pattern 4
1
12
123
1234
12345
Pattern 5
1
22
333
4444
55555
Pattern 6
* * * * * 
* * * * 
* * * 
* * 
* 
Pattern 7
12345
1234
123
12
1
Pattern 8
    *    
   ***   
  *****  
 ******* 
*********
Pattern 9
*********
 ******* 
  *****  
   ***   
    *    
Pattern 10
*        *
**      **
***    ***
****  ****
**********
Pattern 11
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
Pattern 12
    *    
   ***   
  *****  
 ******* 
*********
 ******* 
  *****  
   ***   
    *    
Pattern 13
    *****    
   *****   
  *****  
 ***** 
*****
Pattern 14
    *    
   * *   
  *   *  
 *     * 
*       *
 *     * 
  *   *  
   * *   
    *    
Pattern 15
*********
 ******* 
  *****  
   ***   
    *    
   ***   
  *****  
 ******* 
*********
Pattern 16
*
**
***
****
*****
****
***
**
*
Pattern 17
**********
****  ****
***    ***
**      **
*        *
**      **
***    ***
****  ****
**********
Pattern18
    1
   232
  34532
 4567432
567895432
PascalTriangle Pattern19
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 
SpiralPattern
1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6 7 8 9 14 19 18 17 12 13
*/
