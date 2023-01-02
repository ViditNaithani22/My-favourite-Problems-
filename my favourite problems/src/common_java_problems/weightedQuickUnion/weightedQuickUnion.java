package common_java_problems.weightedQuickUnion;

import common_java_problems.quickUnion.quickUnion;

public class weightedQuickUnion {
     int[] id;
    int[] sz;
    int count;


    public weightedQuickUnion(int n) {
        count = n;
        id = new int[n];
        sz = new int[n];
        for (int i = 0; i < n; i ++) {
            id[i] = i;
            sz[i] = i;
        }
    }

    public int count() {
        return count;
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
        if (i == j) return;

        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        }
        else {
            id[j] = i;
            sz[i] += sz[j];
        }
        count --;
    }


    public static void main(String[] args) {


        weightedQuickUnion qf = new weightedQuickUnion(10);
        qf.union(4,3);
        qf.union(3,8);
        qf.union(9,4);

        System.out.println(qf.connected(9,8));
        System.out.println(qf.connected(5,0));
        System.out.println(qf.getId(4));
        System.out.println(qf.getId(8));
        System.out.println(qf.getId(3));
        System.out.println(qf.getId(9));

        System.out.println("number of components: "+ qf.count);

    }

}
