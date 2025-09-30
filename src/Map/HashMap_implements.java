package Map;

public class HashMap_implements {
    public class Node{
        String key;
        Integer value;
        Node next;

    }
    private Node[] buk;
    public int size;
    public HashMap_implements(int n){
        buk=new Node[n];

    }
    public HashMap_implements(){
        this(4);

    }
    public int hashFun(String  key){
        int idx=key.hashCode()%buk.length;
        if(idx<0){
            idx+=buk.length;

        }return idx;

    }
    public void put(String key,Integer value){
        int bn=hashFun(key);
        Node temp=buk[bn];
        while(temp!=null){
            if (temp.key.equals(key)){
                temp.value=value;
                return;
            }
            temp=temp.next;

        }
        Node nn=new Node();
        nn.key=key;
        nn.value=value;
        nn.next=buk[bn];
        buk[bn]=nn;
      size++;
      double thf=2.0;
      double Lf=(1.0*size)/buk.length;
      if (Lf>thf){
          rehashing();
      }
    }
    private void rehashing(){
        Node[] newbuk=new Node[2*buk.length];
    Node[] a=buk;
    buk=newbuk;
    size=0;
    for (Node temp:a){
        while (temp!=null){
            put(temp.key, temp.value);
            temp=temp.next;
        }
    }
    }
    @Override
    public  String toString(){
        String s="{";
        for (Node temp:buk){
            while(temp!=null){
                s=s+temp.key+"="+temp.value+", ";

            }
        }
        return s+" }";
    }
    public Integer get(String key){
        int bn=hashFun(key);
    Node temp=buk[bn];
    while (temp!=null){
        if(temp.key.equals(key)){
            return temp.value;

        }
        temp=temp.next;

    }
    return  null;
    }
    public Boolean containsKey(String key){
        int bn=hashFun(key);
        Node temp=buk[bn];
        while (temp!=null){
            if(temp.key.equals(key)){
                return true;

            }
            temp=temp.next;

        }
        return false;
    }
    public Integer remove(String key){
        int bn=hashFun(key);
        Node curr=buk[bn];
        Node prev=null;
        while (curr!=null){
            if (curr.key.equals(key)){
                break;
            }
            prev=curr;
            curr=curr.next;
        }
        if (curr==null){
            return null;
        }if (prev==null){
            buk[bn]=curr.next;
            curr.next=null;

        }else {
            prev.next=curr.next;
            curr.next=null;
        }
        size--;
        return curr.value;
    }
}
