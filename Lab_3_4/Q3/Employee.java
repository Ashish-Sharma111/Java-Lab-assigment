package Q3;


public class Employee extends Person{
    private String dept;
	private String designation;
	private String doj;
	
	public Employee()
	{
		
	}
	public Employee(int id, String name, String mobile, String email, String dept, String designation, String doj)
	{ 
		super(id,name,mobile,email);
		this.dept=dept;
		this.designation=designation;
		this.doj=doj;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+" DEPARTMENT:"+dept+", DESIGNATION:"+designation+", DATE OF JOINING:"+doj;
	}
}
