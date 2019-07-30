public abstract class AbstractPQueue implements PQueue {
    private EntryComparator comp;

    protected AbstractPQueue() {

        this(new EntryComparator());

    }

    protected AbstractPQueue(EntryComparator c) {comp = c;}

    protected int compare (PQEntry a, PQEntry b) {

        return comp.compare(a,b);
    }
    public boolean isEmpty(){return size() == 0;}

}