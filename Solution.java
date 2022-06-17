
    
    class Node
    {
        
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
    };



public class Solution {
    public static int binaryToInteger(int n, Node head) {
        // Write your code here.
        Stack<Integer> st=new Stack<Integer>();
        StringBuilder s=new StringBuilder();
        Node head;
        while(head!=-1){
            st.push(head.data);
            head=head.next;
        }
        while(!st.isEmpty())
        {
            s.append(st.pop());
        }        
        sb.reverse();
        int binary=Integer.parseInt(s);
       int ans=btod(binary);
            
            
        }
     public static int btod( int n){
            int decimal = 0;  
    int n = 0;  
    while(true){  
      if(binary == 0){  
        break;  
      } else {  
          int temp = binary%10;  
          decimal += temp*Math.pow(2, n);  
          binary = binary/10;  
          n++;  
       }  
    }  
    return decimal;  
}  
    }
