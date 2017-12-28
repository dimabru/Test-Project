import java.util.ArrayList;
import java.util.List;


public class WorkerManagement {
	
	private List <Worker> workers = new ArrayList();
	
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
	
	public List<Worker> getOriginalWorkerList()
	{
		return workers;
	}
	
	/*public List<Worker> bubbleSort()
	{
		long start=System.currentTimeMillis();
		List <Worker> sorted = new ArrayList();
		for (int i=0; i<workers.size(); i++)
		{
			sorted.add(workers.get(i));
		}
		for (int i=0; i<sorted.size()-1; i++)
		{
			for (int j=0; j<sorted.size()-i-1; j++)
			{
				if (sorted.get(j).salary>sorted.get(j+1).salary)
				{
					Worker temp = new Worker(sorted.get(j));
					sorted.set(j, sorted.get(j+1));
					sorted.set(j+1, temp);
				}
			}
		}
		System.out.println("Bubble Sort total time elapsed: " + (System.currentTimeMillis()-start) + " ms");
		return sorted;
	}*/
	
	void merge(List<Worker> sorted, int l, int m, int r)
	{
		List<Worker> L = new ArrayList(),R = new ArrayList();
		int n1 = m-l+1;
		int n2 = r-m;
		
		for (int i=0; i<n1; i++)
			L.add(sorted.get(l+i));
		for (int i=0; i<n2; i++)
			R.add(sorted.get(m+1+i));
		
		int i=0,j=0;
		int k=l;
		while(i<n1 && j<n2)
		{
			if(L.get(i).salary <= R.get(j).salary)
			{
				sorted.set(k, L.get(i));
				i++;
			}
			else
			{
				sorted.set(k, R.get(j));
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			sorted.set(k, L.get(i));
			i++;
			k++;
		}
		while (j<n2)
		{
			sorted.set(k, R.get(j));
			j++;
			k++;
		}
	}
	
	void sort(List<Worker> sorted, int l, int r)
	{
		if (l<r)
		{
			int m = (l+r)/2;
			sort(sorted, l, m);
			sort(sorted, m+1, r);
			
			merge(sorted, l, m, r);
		}
	}
	
	public List<Worker> mergeSort()
	{
		long start=System.currentTimeMillis();
		List <Worker> sorted = new ArrayList();
		for (int i=0; i<workers.size(); i++)
		{
			sorted.add(workers.get(i));
		}
		sort(sorted, 0, sorted.size()-1);
		System.out.println("Merge Sort total time elapsed: " + (System.currentTimeMillis()-start) + " ms");
		return sorted;
	}
	
	List <Worker> getWorkerList() 
	{ 
		return workers;
	}
	
	public String toString()
	{
		String str="";
		for (int i=0;i<workers.size();i++)
		{
			str=str + "\n" + workers.get(i);
		}
		return str;
	}
	
	public String getOnlySalaries()
	{
		String str="";
		for (int i=0; i<workers.size(); i++)
			str = str+workers.get(i).salary;
		return str;
	}
}
















