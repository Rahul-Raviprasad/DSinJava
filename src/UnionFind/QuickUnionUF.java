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
}
