package Q3;

public class SalariedEmp extends Employee{
    private int basicSal;

	public int getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(int basicSal) {
		this.basicSal = basicSal;
	}

	public SalariedEmp(int id, String name, String mobile, String email, String dept, String designation, String doj, int basicSal) 
	{
		super(id,name,mobile,email,dept,designation,doj);
		this.basicSal = basicSal;
	}

	public SalariedEmp() {
		super();
	}
	
	public String toString()
	{
		return super.toString()+" BASIC SALARY:"+basicSal;
	}
}
