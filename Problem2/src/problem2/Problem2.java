/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem2;

import java.util.*;

/**
 *
 * @author himal
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    static String[] generate_binary_numbers(int n){
        String [] s = new String[n];
        Queue<String> que = new LinkedList<>();
        
        que.add("1");
        int index = 0;
        while(index<n/2){
            String temp = que.remove();
            s[index] = temp;
            que.add(temp+"0");
            que.add(temp+"1");
            index++;
        }
        while(index<n){
            s[index] = que.remove();
            index++;
        }
        return s;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String [] s = generate_binary_numbers(n);
        for(String temp : s){
            System.out.println(temp);
        }
    }
    
}
