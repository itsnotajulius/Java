import java.util.Scanner;

public class ReadNameAge {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year of Birth:");
        boolean hasNextIntegter = sc.hasNextInt();
        if(hasNextIntegter){
            int year = sc.nextInt();
            int age = year-2022;
            sc.nextLine();
            System.out.println("Enbter Name:");
            String name = sc.nextLine();

            if(age>=0 && age<=100){
                System.out.println("name "+name+" and age: "+age);
            }else{
                System.out.println(INVALID_VALUE_MESSAGE);
            }
        }else{
            System.out.println("Unable to parse year of birth");
        }
        
    }
}
