
public class Worker {
	
	String id,fname,lname,email,phone,address;
	int salary;
	
	Worker(String id,String fname,String lname,String email,String phone,String address,int salary)
	{
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.salary = salary;
	}
	
	Worker(Worker worker)
	{
		id=worker.id;
		fname=worker.fname;
		lname=worker.lname;
		email=worker.email;
		phone=worker.phone;
		address=worker.address;
		salary=worker.salary;
	}
	
	public String toString()
	{
		String str=""+salary+"\n";
		return str;
	}
}
