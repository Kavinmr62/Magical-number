import java.util.*;
public class magical{    
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if (n % 9 == 1)
        System.out.printf("Magic Number");
    else
        System.out.printf("Not a Magic Number");
}
}
