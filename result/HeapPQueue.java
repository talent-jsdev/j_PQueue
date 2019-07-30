
public class HeapPQueue extends AbstractPQueue {
	private ArrayList list;
	
	
	public HeapPQueue(int n) {
		list = new ArrayList(n);
	}
	
	public HeapPQueue() {
		list = new ArrayList();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	

	@Override
	public PQEntry insert(Integer key, String str) throws OutOfRangeException {
		// TODO Auto-generated method stub
		PQEntry result = new PQEntry(key, str);
		list.add(list.size(), result);
		heapUp(list.size() - 1);
		return result;
	}
	
	private void heapUp(int index) throws OutOfRangeException {
	    int parent = (index - 1) / 2;
	    PQEntry bottom = (PQEntry)list.get(index);

	    while( index > 0 && ((PQEntry)list.get(parent)).getKey() > bottom.getKey() )
	    {
	    	list.set(index, list.get(parent) );
	        index = parent;
	        parent = (parent - 1) / 2;
	    }  
	    list.set(index,  bottom);
	}

	private void heapDown(int index) throws OutOfRangeException {
	    int largerChild;
	    PQEntry top = (PQEntry)list.get(index);
	    int currentSize = list.size();
	    while(index < currentSize / 2)      
	    {                               
	        int leftChild = 2 * index + 1;
	        int rightChild = leftChild + 1;

	        if(rightChild < currentSize && 
	        		((PQEntry)list.get(leftChild)).getKey() > ((PQEntry)list.get(rightChild)).getKey())
	            largerChild = rightChild;
	        else
	            largerChild = leftChild;

	        if( top.getKey() <= ((PQEntry)list.get(largerChild)).getKey() )
	            break;

	        list.set(index, (PQEntry)list.get(largerChild));
	        index = largerChild;            
	    }  
	    list.set(index, top);            
	}
	@Override
	public PQEntry min() throws OutOfRangeException {
		// TODO Auto-generated method stub
		if (list.isEmpty())
			return null;
		return (PQEntry)list.get(0);	
	}

	@Override
	public PQEntry removeMin() throws OutOfRangeException {
		// TODO Auto-generated method stub
		PQEntry root = (PQEntry)list.get(0);
		list.set(0, list.get(list.size() - 1));
		list.remove(list.size() - 1);
		if(list.size() > 0)
			heapDown(0);
		return root;
	}

}
