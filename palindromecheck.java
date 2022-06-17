import java.util.*;
 
class palindromecheck {
    public static void main(String args[])
    {
        nodepc1 one = new nodepc1(1);
        nodepc1 two = new nodepc1(2);
        nodepc1 three = new nodepc1(3);
        nodepc1 four = new nodepc1(4);
        nodepc1 five = new nodepc1(3);
        nodepc1 six = new nodepc1(2);
        nodepc1 seven = new nodepc1(1);
        one.ptr = two;
        two.ptr = three;
        three.ptr = four;
        four.ptr = five;
        five.ptr = six;
        six.ptr = seven;
        boolean condition = isPalindrome(one);
        System.out.println("isPalidrome :" + condition);
    }
    static boolean isPalindrome(nodepc1 head)
    {
 
        nodepc1 slow = head;
        boolean ispalin = true;
        Stack<Integer> stack = new Stack<Integer>();
 
        while (slow != null) {
            stack.push(slow.data);
            slow = slow.ptr;
        }
 
        while (head != null) {
 
            int i = stack.pop();
            if (head.data == i) {
                ispalin = true;
            }
            else {
                ispalin = false;
                break;
            }
            head = head.ptr;
        }
        return ispalin;
    }
}