package meta.linkedlists.util;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
    public void display(ListNode node){
       while(node!=null){
           System.out.print(node.val+"->");
           node = node.next;
       }
        System.out.println(null+"");
    }
}
