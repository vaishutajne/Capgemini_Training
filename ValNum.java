import java.util.*;
class invalidnum extends Exception{
    public invalidnum(){
        System.out.println("number should be positive");
    }
}

public class ValNum{
    public static void main(String [] args) throws invalidnum{
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        try{
            if(num<0){
                throw new invalidnum();
            }
            else{
                System.out.print("valid Number");
            }
        }
        catch(invalidnum e){}
    }
}