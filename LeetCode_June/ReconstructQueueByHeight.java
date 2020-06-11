/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */

import java.util.*;
public class ReconstructQueueByHeight {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                System.out.println("a[0]"+a[0]);
                System.out.println("b[0]"+b[0]);
                if (a[0] != b[0]) {
                    System.out.println("a[0] - b[0]"+(b[0] - a[0]));
                    return b[0] - a[0];
                }
                else {
                    System.out.println("a[1] - b[1]"+(a[1] - b[1]));
                    return a[1] - b[1];
                }
            }
        });
        ArrayList<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            tmp.add(people[i][1], people[i]);
        }
        int[][] res = new int[people.length][2];
        for (int i = 0; i < tmp.size(); i++) {
            res[i][0] = tmp.get(i)[0];
            res[i][1] = tmp.get(i)[1];
        }
        return res;
    }
    
    public static void main(String[] args){
        ReconstructQueueByHeight rqh = new ReconstructQueueByHeight();
        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        
        int[][] ans = rqh.reconstructQueue(people);
        for(int i=0; i<ans.length;i++){
            for(int j=0;j<2;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
