package Q3;

public class Contract extends Employee {
    private int hrs;
	private int rate;
	
	public Contract()
	{
		
	}
	public Contract(int id, String name, String mobile, String email, String dept, String designation, String doj, int hrs, int rate)
	{
		super(id,name,mobile,email,dept,designation,doj);
		this.hrs=hrs;
		this.rate=rate;
	}
	
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String toString()
	{
		return super.toString()+" NO. OF HOURS:"+hrs+" RATE PER HOUR:"+rate;
	}
	
}
