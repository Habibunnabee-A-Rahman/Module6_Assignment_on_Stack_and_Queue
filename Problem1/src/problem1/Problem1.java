/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem1;

import java.util.*;

/**
 *
 * @author himal
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    static void is_balanced(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        Map<Character,Character> brackets = new HashMap<>();
        brackets.put(')','(');
        brackets.put('}','{');
        brackets.put(']','[');

        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(!brackets.containsKey(c)){
                st.push(c);
            }else if(!st.empty()){
                if(st.pop()!=brackets.get(c)){
                    System.out.println("False kotha vai");
                    return;
                }
            }else{
                System.out.println("False kotha vai");
                return;
            }
        }
        if(st.empty()){
            System.out.println("Sohomot vai");
            return ;
        }
        System.out.println("False kotha vai");
        
          
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String expression = scan.next();
        is_balanced(expression);
    }
    
}
