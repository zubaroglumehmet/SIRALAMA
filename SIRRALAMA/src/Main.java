import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
int a,b,c;
Scanner input = new Scanner(System.in);
System.out.println("Birinci Sayi");
a=input.nextInt();
System.out.println("Ikinci Sayi");
b=input.nextInt();
System.out.println("Ucuncu Sayi");
c=input.nextInt();

if ((b>a)&&(c>a))
    {
        if (c > b)
        {
System.out.println("a<b<c");
        }
        else
        {
            System.out.println("a>c<b");
        }
         if ((a>b)&&(c>b))
    {
        if (c>a)
        {
            System.out.println("b<a<c");

        }
        else
        {
            System.out.println("a>c>b");
        }
    } else if ((c<b)&&(c<a))
    {
    if (a<b)
    {
        System.out.println("c<a<b");
    } else
    {
     System.out.println("a>b>c");
    }
    }

    }

    }
}