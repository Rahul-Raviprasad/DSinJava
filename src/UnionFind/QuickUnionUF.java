package UnionFind;

public class QuickUnionUF {
	private int[] id;

	// constructor to create UF with id as its own index
	public QuickUnionUF(int N) {
		id = new int[N];
		for(int i = 0; i < N; i++) {
			id[i] = i;
		}
	}
	
	private int root(int i) {
		while(i != id[i]) {
			i = id[i];
		}
		return i;
	}
	
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
	
	//change the root of p to point to the root of q
	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		id[i] = j;
	} 
}
