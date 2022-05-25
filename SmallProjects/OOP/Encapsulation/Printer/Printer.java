package src.printer;

public class Printer {
    private int toner;
    private int pagesPrinted;
    private boolean duplex;



    
    public Printer(int toner, boolean duplex) {
        if(toner>=0&&toner<=100){
            this.toner = toner;
        }else{
            this.toner = -1;
        }
        
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public void print(int pages){
        int pagesToPrint = 0;
        if(this.duplex){
            System.out.println("Print in Duplex");
            pagesToPrint = pages/2+(pages%2);
            this.pagesPrinted += pagesToPrint;
        }else{
            pagesToPrint = pages;
            this.pagesPrinted += pagesToPrint;
        }

        System.out.println("We printed "+pagesToPrint+" pages and Number of pages printed is "+getPagesPrinted());
    }

    public void fillToner(int toner){
        if(toner>0&&toner<=100){
            if(getToner()+toner>=100){
                this.toner += 100; 
            }else{
                this.toner += toner;
            }
        }
    }

    private int getToner(){
        return this.toner;
    }
    
    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
