public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
       String answer = "Invalid Value";
       if(kiloBytes>=0){
           int megabytes =kiloBytes/1024;
           int remainedKilos = kiloBytes%1024;
           answer=  kiloBytes+" KB = "+ megabytes+" MB and "+remainedKilos+" KB";
       }
       System.out.println(answer);
   }
}