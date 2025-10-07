
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.cert.CertPathValidatorException;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class DayOfYear{
    public static void main(String []args){
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("enter year:");
        int year=Integer.parseInt(br.readLine());

        System.out.println("enter day of year 1-365/366:");
        int DayOfYear=Integer.parseInt(br.readLine());

        LocalDate date =LocalDate.ofYearDay(year, DayOfYear);
        System.out.print("the date:"+date);
        }catch(IOException e){
            System.out.println("input error:" +e.getMessage());
        }


    }
}