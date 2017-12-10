import java.util.ArrayList;
import java.util.List;


public class WorkerManagement {
	
	List <Worker> workers = new ArrayList();
	
	WorkerManagement()
	{
		RandGenerator rand = new RandGenerator();
		for (int i=0;i<10000;i++)
		{
			String fname = rand.getRandomName();
			String lname = rand.getRandomName();
			String id = rand.getRandomID();
			String phone = rand.getRandomPhone();
			String email = rand.getRandomEmail();
			String address = rand.getRandomName();
			int salary = rand.getRandomSalary();
			
			workers.add(new Worker(id,fname,lname,email,phone,address,salary));
		}
	}
	
	List <Worker> getWorkerList() 
	{ 
		return workers;
	}
	
}
