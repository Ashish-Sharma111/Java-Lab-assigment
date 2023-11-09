package Q3;

public class Vendors extends Employee {
    private int noOfEmp;
	private int amt;
	
	public Vendors() {}
	public Vendors(int id, String name, String mobile, String email, String dept, String designation, String doj, int noOfEmp, int amt)
	{
		super(id,name,mobile,email,dept,designation,doj);
		this.noOfEmp=noOfEmp;
		this.amt=amt;
	}
	
	public int getNoOfEmp()
	{
		return noOfEmp;
	}
	public void setNoOfEmp(int noOfEmp)
	{
		this.noOfEmp=noOfEmp;
	}
	public int getAmt()
	{
		return amt;
	}
	public void setAmt(int amt)
	{
		this.amt=amt;
	}
	
	public String toString()
	{
		return super.toString()+" NUMBER OF EMPLOYEES:"+noOfEmp+" AMOUNT PAID:"+amt;
	}
}
