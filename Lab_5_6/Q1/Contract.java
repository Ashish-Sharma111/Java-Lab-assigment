package Q1;

public class Contract extends Employee {
    private int hrs;
    private int chrg;
    private int totchrg;

    Contract(){
        this(0,0);
    }

    Contract(int hrs, int chrg){
        this.hrs=hrs;
        this.chrg=chrg;
    }

    //Setters

    public void setHrs(int hrs){
        this.hrs=hrs;
    }

    public void setChrg(int chrg){
        this.chrg=chrg;
    }

    //Getters
    public int getHrs(){
        return hrs;
    }

    public int getChrg(){
        return chrg;
    }

    @Override
    public void calSal(){
        totchrg =  (hrs*chrg);
    }

    @Override
    public String toString(){
        return super.toString() + ("Contract Employee: [ Charges: "+chrg+" Hours: "+hrs+" Total Sal: "+totchrg+" ]") ;
    }

    
}
