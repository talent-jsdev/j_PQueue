public class ArrayList implements List{
    
    private int size;
    private Object[]item ;

    
    public ArrayList(){
        this(6000);
    }

    
    public ArrayList(int capacity){
        size = 0;
        item = new Object[capacity];
    }

    
    public int size(){
        return size;
    }

   
    public Object get(int i) throws OutOfRangeException{
        if(i<size){
            return item [i];
        }else{
            throw new OutOfRangeException();
        }
    }

   
    public void set(int i, Object e) throws OutOfRangeException{
        if(i<size){
            item[i] = e;
        }else{
            throw new OutOfRangeException();
        }
    }

    
    public void add(int i, Object e) throws OutOfRangeException{
        if(i>size){
            throw new OutOfRangeException();
        }
        for(int j = size-1; j>= i; j--){
            item[j+i] = item[j];
        }
        item[i] = e;
        size++;
    }

   
    public Object remove(int i) throws OutOfRangeException{
        if(i >= size){
            throw new OutOfRangeException();
        }
        Object o = item[i];
        for(int j=i; j<size-1; j++){
            item[j] = item[j + 1];
        }
        size--;
        return o;
    }

    
    public boolean isEmpty(){
        return size == 0;
    }
}
