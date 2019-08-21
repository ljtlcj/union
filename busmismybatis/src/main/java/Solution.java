import java.util.ArrayList;
public class Solution {

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {   	   	
    	ArrayList<Integer> list=new ArrayList<Integer>();
    	while(listNode.next!=null) {
    		list.add(listNode.val);	
    		listNode=listNode.next;
    	}	
        return list;
    }
    
    
    public static void main(String args[]) {
    	
    	ListNode head = new ListNode(1);
    	ListNode pre =head;
    	
    	ArrayList<Integer> list = null;
    	
    	for(int i=0;i<10;i++) {
        	ListNode node = new ListNode(i);
        	pre.next=node;
        	pre=node;
        	
    	}    	
    	list = printListFromTailToHead(head);
    	for(int i=0;i<list.size();i++)
    		System.out.print(list.get(i));
    }
}


