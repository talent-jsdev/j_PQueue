import java.util.Comparator;

public class EntryComparator implements Comparator<Object> {

    
    public int compare(Object a, Object b){
        int akey = ((PQEntry)a).getKey();
        int bkey = ((PQEntry)b).getKey();
        return akey - bkey;
    }
}
