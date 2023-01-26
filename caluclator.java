import java.util.Scanner;

class code3
{
    public static void main(String[] args)
    {
        int value;
        System.out.println("enter the what you like operater * + - /");
        Scanner ope=new Scanner(System.in);
        char opr=ope.next().charAt(0);
        System.out.println("enter the first number");
        int num1=ope.nextInt();
        System.out.println("etner the second number");
        int num2=ope.nextInt();

        switch(opr)
        {
            case  '+':
            value=num1+num2;
           
            System.out.println("the sum of two numbers :-"+value);
            break;
            case '*':
            value=num1*num2;
            System.out.println("the multiple of two nubmers :-"+value);
            break;
            case '-':
            value=num1-num2;
            System.out.println("THE SUBTRACT OF TWO NUMBERS :-"+value);
            break;
            case '/':
            value=num1/num2;
            System.out.println("divide of two nubmers :-"+value);
            break;
            default:
            System.out.println("your input is wrong please select among this \n + - * /");

                
        }
    }
}