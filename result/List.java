public interface List {
    public int size();
    public boolean isEmpty();
    public Object get(int i) throws OutOfRangeException;
    public void set(int i, Object e) throws OutOfRangeException;
    public void add(int i, Object e) throws OutOfRangeException;
    public Object remove(int i) throws OutOfRangeException;
}
