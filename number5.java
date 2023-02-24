import java.io.*;
class number5
{
    public static void main(String[] args) 
    {
        int i,s,b=0,k,a=5;
        for(i=3;i>=1;i--)
        {
            for(s=1;s<=b;s++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=a;k++)
            {
                System.out.print(i);
            }
            System.out.println("");
            a=a-2;
            b++;
        }        
    }
}
