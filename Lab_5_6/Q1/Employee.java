package Q1;

import java.sql.Date;

public class Employee{
    private int id;
    private String name;
    private String phno;
    private String dept;
    private String desg;
    private Date doj;

    Employee()
    {
        
    }
    Employee(int id, String name, String phno, String dept,String desg, Date doj)
    {
        this.name=name;
        this.id=id;
        this.phno=phno;
        this.dept=dept;
        this.desg=desg;
        this.doj=doj;
    }

    //Setters
    public void setName(String name){
        this.name=name;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setPhno(String phno){
        this.phno=phno;
    }

    public void setDept(String dept){
        this.dept=dept;
    }

    public void setDesg(String desg){
        this.desg=desg;
    }

    public void setDoj(Date doj){
        this.doj=doj;
    }

    //Getters
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public String getPhno(){
        return phno;
    } 

    public String getDept(){
        return dept;
    }

    public String getDesg(){
        return desg;
    }

    public Date getDoj(){
        return doj;
    }

    //Calculate Salary
    public void calSal(){
        
    }

    // ToString
    @Override
    public String toString(){
        return ("Employee: [Name: "+name+" id: "+id+" phno: "+phno+" dept: "+dept+" desg: "+desg+" DOJ: "+doj);
    }

}