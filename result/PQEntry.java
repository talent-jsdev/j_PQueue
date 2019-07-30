public class PQEntry {
    private Integer key;
    private String value;

   
    public PQEntry(Integer k, String v){
        key = k;
        value = v;
    }

    
    public Integer getKey(){
        return key;
    }

    
    public String getValue(){
        return value;
    }

    
    public void setKey(Integer k){
        key = k;
    }

    
    public void setValue(String str){
        value = str;
    }
}
