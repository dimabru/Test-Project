import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class SortTest {

	private WorkerManagement manage;
	
	@Before
	public void setUp() throws Exception {
		manage = new WorkerManagement();
	}

	@Test
	public void testMergeSort() {
		List <Worker> testWorkers = manage.mergeSort();
		
		assertTrue(testWorkers!=null);
		
		assertTrue(checkIfListsMatch(manage.getOriginalWorkerList(),testWorkers));
		
		assertTrue(checkIfSorted(testWorkers));
	}
	
	private boolean checkIfListsMatch(List<Worker> original, List<Worker> sorted)
	{
		for (int i=0; i<original.size(); i++)
		{
			if (sorted.contains(original.get(i)))
				continue;
			else return false;
		}
		return true;
	}
	
	private boolean checkIfSorted(List <Worker> sorted)
	{
		for (int i=0; i<sorted.size()-1; i++)
		{
			if (sorted.get(i).salary<=sorted.get(i+1).salary)
				continue;
			else return false;
		}
		return true;
	}

}
