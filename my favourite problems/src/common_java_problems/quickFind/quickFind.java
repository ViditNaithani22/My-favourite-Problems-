package common_java_problems.quickFind;

import java.util.Scanner;

public class quickFind {
 int[] id;


 quickFind(int N){
     id = new int[N];
     for(int i = 0; i<N;i++){
         id[i] = i;
     }
 }


    public int getId(int i) {
        return id[i];
    }

    public boolean connected(int p, int q){
          return id[p] == id[q];
    }

    public void union(int p, int q){
     int pid = id[p];
     int qid = id[q];
        for(int i = 0; i< id.length;i++){
            if(id[i] == pid){
                id[i] = qid;
            }
        }
    }

    public static void main(String[] args) {
       quickFind qf = new quickFind(10);
        qf.union(4,3);
        qf.union(3,8);
        qf.union(9,4);

        System.out.println(qf.connected(9,8));
        System.out.println(qf.connected(5,0));
        System.out.println(qf.getId(4));
        System.out.println(qf.getId(8));
        System.out.println(qf.getId(3));
        System.out.println(qf.getId(9));



    }
}
