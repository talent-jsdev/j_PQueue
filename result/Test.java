
public class Test {

	public static void main(String[] args) throws OutOfRangeException {
		// TODO Auto-generated method stub
		ALPQueue alpQueue = new ALPQueue(5000);
		HeapPQueue heapQueue = new HeapPQueue(5000);
		
		int aList[] = new int[5000];
		for(int i = 0; i < 5000; i++) 
		{
			double value = Math.random() * 500;
			aList[i] = (int) value;
		}
		
		System.out.println("ALPQueue");
		double start = System.currentTimeMillis();
		for(int i = 0; i < 5000; i++) 
		{
			alpQueue.insert(aList[i], "CIS" + aList[i]);
		}
		double mid = System.currentTimeMillis();
		for(int i = 0; i < 5000; i++) {
				alpQueue.removeMin();
		}
		double last = System.currentTimeMillis();
		System.out.println("instert 5000 entries : " + (mid - start) + " ms");
		System.out.println("remove 5000 entries : " + (last - mid) + " ms");
		
		System.out.println("HeapPQueue");
		start = System.currentTimeMillis();
		for(int i = 0; i < 5000; i++) 
		{
			heapQueue.insert(aList[i], "CIS" + aList[i]);
		}
		mid = System.currentTimeMillis();
		for(int i = 0; i < 5000; i++) {
				heapQueue.removeMin();
		}
		last = System.currentTimeMillis();
		System.out.println("insert 5000 entries : " + (mid - start) + " ms");
		System.out.println("remove 5000 entries : " + (last - mid) + " ms");
		


	}

}
