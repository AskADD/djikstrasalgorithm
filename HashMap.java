public class HashMap {
    private class Node {
        String key;
        Integer val;
        Node next;

        public Node(String k, Integer v, Node n) {
            key = k;
            val = v;
            next = n;
        }
    }

    private Node[] table;
    private int numKeys;

    public HashMap() {
        table = new Node[2];
        numKeys = 0;
    }

    private int hashCode(String key) {
        return key.hashCode();
    }
//hash code is a method you can do on a  key, it is created by Java
    public void put(String key, Integer val){
        if(table.length <= numKeys/2){
            rehash(table.length*2);
        }

        for(Node ptr = table[index],ptr!=null,ptr=ptr.next){
            if(ptr.key.equals(key)){
                ptr.al = val;
                return;
            }
        }
        int index = hashCode(key)%table.length;
        table[index] = new Node(key, val, table[index]);
        numKeys++;
        if(numKeys*2 >= table.length){
            rehash(table.length*2);
        }
    }
    public void print() {
        for (int i = 0; i < table.length; i++) {
            System.out.printf("[%d]", i);
            for (Node ptr = table[i]; ptr != null; ptr = ptr.next) {
                System.out.printf("->(%s, %d)", ptr.key, ptr.val);
            }
            System.out.println();
        }
    }
}