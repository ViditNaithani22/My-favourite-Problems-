package common_java_problems.quickUnion;

import common_java_problems.quickFind.quickFind;

public class quickUnion {

    int id[];

    quickUnion(int n){
        id = new int[n];
        for (int i = 0; i<n;i++){
            id[i] = i;
        }
    }

    public int getId(int i) {
        return id[i];
    }

    int root(int i){
        while (i != id[i]){
            i = id[i];
        }
        return i;
    }

    boolean connected(int p, int q){
         return root(p) == root(q);

    }

    void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
    public static void main(String[] args) {


        quickUnion qf = new quickUnion(10);
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
