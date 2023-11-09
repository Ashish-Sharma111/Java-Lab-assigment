package Q1;

public class Salaried extends Employee {
    private int sal;
    private static int bonus=5000;
    Salaried(){
        this(0);
    }

    Salaried(int sal){
        this.sal=sal;
    }

    public void setSal(int sal){
        this.sal=sal;
    }

    public int getSal(){
        return sal;
    }

    @Override
    public void calSal(){
        sal=sal+bonus;
    }

    @Override
    public String toString(){
        return super.toString() + ("Salaried Employee: [ Salary: "+sal+" ]") ;
    }

}
