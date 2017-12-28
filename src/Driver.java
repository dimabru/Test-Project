import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

/*
 * Test HW3
 * Be'er Sheva Campus
 * Dmitry Brusilovsky 313026221
 * Yarden Cherry 208899344
 */

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Inserting Random Workers");
		WorkerManagement manage = new WorkerManagement();
		//manage.bubbleSort();
		List <Worker> sorted=manage.mergeSort();
		PrintWriter writer;
		try {
			System.out.println("Inserting Lists of workers into files");
			writer = new PrintWriter("OriginalWorkerList.txt", "UTF-8");
			writer.println(manage.getOriginalWorkerList());
			writer.close();
			writer = new PrintWriter("SortedWorkerList.txt", "UTF-8");
			writer.println(sorted);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}

}
 