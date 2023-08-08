import java.util.Scanner;

class Cal{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number");
        float Num1 = in.nextFloat();
        System.out.println("Enter Second Number");
        float Num2 = in.nextFloat();
        int choice;
        do{
        System.out.println("\n1.Addition\n2.Substraction\n3.Multication\n4.Division\n");
        System.out.println("Enter your choice: ");
        choice = in.nextInt();
        
        switch (choice) {
            case 1:
                 float sum = Num1+Num2;
                 System.out.println("\n"+sum);
                break;
            case 2:
                 float sub = Num1-Num2;
                 System.out.println("\n"+sub);
                break;
            case 3:
                 float mul = Num1*Num2;
                 System.out.println("\n"+mul);
                 
                break;
            case 4:
                if (Num2==0){
                    System.out.println("Invalid Division");
                }
                 float div = Num1/Num2;
                 System.out.println("\n"+div);
                 break;
                  }
                }while(choice<5);
       
   
    }
}