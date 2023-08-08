import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.time.*;
class Salary{

    public void salaryCal(){
         Scanner in = new Scanner(System.in);
            System.out.println("Enter the basic earning of an employee");
            float b_pay = in.nextInt();
            if(b_pay>4500 && b_pay<6500){
               float DA,TA,HRA,PF,gross_sal;
               DA = (b_pay*2)/100;
               System.out.println("DA is "+DA);
               TA = (b_pay*1)/100;
               System.out.println("TA is "+TA);
               HRA = (b_pay*3)/100;
               System.out.println("HRA is "+HRA);
               PF = (float) ((b_pay*0.5)/100);
               gross_sal = (DA+TA+HRA)-PF;
               float salary = b_pay + gross_sal;
               System.out.println("Total Salary is "+salary);
               if(salary>10000){
                System.out.println("Eligible for Tax deduction of Rs.1000");
               }
                else{
                   System.out.println("Not eligible for Tax deduction due to salary less than 10000"); 
                }
            }
            else{
                System.out.println("Invalid Value of Basic Payment");
            }
    }
}
public class Emp_Salary {
   public static Date StringToDate(String dob) throws ParseException{
      //Instantiating the SimpleDateFormat class
      SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
      //Parsing the given String to Date object
      Date date = formatter.parse(dob);
      System.out.println("Date object value: "+date);
      return date;
   }
   public static void main(String args[]) throws ParseException {
      //Reading name and date of birth from the user
      Scanner sc = new Scanner(System.in);
      Salary S = new Salary();
      System.out.println("Enter your date of birth (dd-MM-yyyy): ");
      String dob = sc.next();
      //Converting String to Date
      SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
      Date date = formatter.parse(dob);
      //Converting obtained Date object to LocalDate object
      Instant instant = date.toInstant();
      ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
      LocalDate givenDate = zone.toLocalDate();
      //Calculating the difference between given date to current date.
      Period period = Period.between(givenDate, LocalDate.now());
      Calendar cal = Calendar.getInstance();
      Calendar cT = (Calendar) cal.clone();
      

      if(period.getYears()<18){
            System.out.println("Employee Age should greater than 18"); 
        }  
        else{

            System.out.println("Age is");
            System.out.println(period.getYears()+" years "+period.getMonths()+" Months and "+period.getDays()+" days");
	        S.salaryCal();
            
            int retirein =  55-period.getYears();
            System.out.println("Employee Retire on: ");
            
            cT.add(Calendar.YEAR, retirein);
            cT.add(Calendar.MONTH,period.getMonths());
            cT.add(Calendar.DATE, period.getDays());
            System.out.println(cT.getTime());
            
        }

        
    }
}