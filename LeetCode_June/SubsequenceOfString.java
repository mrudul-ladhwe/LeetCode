/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */
public class SubsequenceOfString {
    public boolean isSubsequence(String s, String t) {
        char[] q = new char[s.length()];
        
        for(int i = 0, j =0;i<s.length() && j< t.length();){
            if(s.charAt(i) == t.charAt(j)){
                System.out.println("s i >>"+s.charAt(i));
                System.out.println("t i >>"+t.charAt(j));
                q[i] = t.charAt(j);
                if(i == s.length()  || j == t.length()){
                    break;
                }
                else{
                    i++;
                    j++;
                }
            }
            else{
                j++;
            }
        }
        
        String r = new String(q);
        
        System.out.println("s>>"+s);
        System.out.println("r>>"+r);
        
        if(s.equals(r)){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public static void main(String[] args){
        SubsequenceOfString sos = new SubsequenceOfString();
        String s = "abc";
        String t= "ahbgdc";
        
        boolean ans = sos.isSubsequence(s, t);
        System.out.println("ans>>"+ans);
    }
    
}
