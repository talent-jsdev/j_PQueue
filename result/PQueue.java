public interface PQueue {
    int size();
    PQEntry insert(Integer key, String str) throws OutOfRangeException;
    PQEntry min() throws OutOfRangeException;
    PQEntry removeMin() throws OutOfRangeException;
    boolean isEmpty();
}
