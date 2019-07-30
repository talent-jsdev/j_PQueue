
public class ALPQueue extends AbstractPQueue {
	ArrayList aList;
	
	public ALPQueue(int n) {
		aList = new ArrayList(n);
	}
	
	public ALPQueue() {
		aList = new ArrayList();
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return aList.size();
	}

	@Override
	public PQEntry insert(Integer key, String str) throws OutOfRangeException {
		// TODO Auto-generated method stub
		PQEntry entry = new PQEntry(key, str);
		aList.add(aList.size(), entry);
		return entry;
	}

	@Override
	public PQEntry min() throws OutOfRangeException {
		// TODO Auto-generated method stub
	    PQEntry priority = (PQEntry)aList.get(0);
	    for (int i = 0; i < aList.size(); i++) {
	        if (compare((PQEntry)aList.get(i), priority) < 0) {
	            priority = (PQEntry)aList.get(i);
	        }
	    }
	    return priority;
	}

	@Override
	public PQEntry removeMin() throws OutOfRangeException {
		// TODO Auto-generated method stub
	    if (aList.isEmpty()) {
	        return null;
	    }
	    PQEntry entry = min();
	    int index = 0;
	    for(int i = 0; i < aList.size(); i++) {
	    	if((((PQEntry)aList.get(i)).getKey().equals(entry.getKey())) &&
	    			(((PQEntry)aList.get(i)).getValue().equals(entry.getValue())))
	    			index = i;
	    }
	    	
	    aList.remove(index);
	    return entry;
	}

}
