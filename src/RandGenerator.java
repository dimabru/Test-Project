import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class RandGenerator {
	
	static List charList = new ArrayList();
	
	final int minWordSize=3;
	final int maxWordSize=10;
	final int numSize=9;
	
	RandGenerator()
	{
		for (char i='a';i<='z'; i++) charList.add(i);
		for (char i='A';i<='Z'; i++) charList.add(i);
	}
	
	String getRandomName()
	{
		Random rand = new Random();
		String str="";
		 
		int size = rand.nextInt(maxWordSize) + minWordSize;
		
		for (int i=0;i<size;i++){
			str = str + charList.get(rand.nextInt(51));
		}
		
		return str;
	}
	
	String getRandomEmail()
	{
		String str= getRandomName() + '@' + getRandomName() + ".com";
		return str;
	}
	
	String getRandomID()
	{
		Random rand = new Random();
		String str="";
		for (int i=0; i<numSize; i++) str = str + rand.nextInt(9);
		
		return str;
	}
	
	String getRandomPhone()
	{
		String str = "0";
		str = str + getRandomID();
		str = str.substring(0,1) + "5" + str.substring(2);
		return str;
	}
	
	int getRandomSalary()
	{
		Random rand = new Random();
		return rand.nextInt(15000)+3000;
	}
}






















