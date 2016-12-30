package UnionFind;

public class QuickFindUF {
	private int[] id;
	
	public QuickFindUF(int N) {
		id = new int[N];
		
		//initializing by setting the id of each object to itself
		//(the integer array with it's own index value)
		//N array accesses
		for(int i = 0; i < N; i++) {
			id[i] = i;
		}
	}
	
	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}
	
	// creates a union between 2 nodes
	// this is done by changing all the entries with id[p] to id[q]
	// At most 2N+2 array accesses
	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		
		for(int i = 0; i < id.length; i++) {
			if(id[i] == pid) {
				id[i] = qid;
			}
		}
	}

}
