import java.util.ArrayList;

class Question5 {

	public static void main(String[] args) {
		TreeNode no2 = new TreeNode(2);
		TreeNode no4 = new TreeNode(4);
		TreeNode no7 = new TreeNode(7);
		TreeNode no6 = new TreeNode(6, null, no7);
		TreeNode no3 = new TreeNode(3, no2, no4);
		TreeNode no5 = new TreeNode(5, no3, no6);
		
		System.out.println(no5.kthSmallest(no5,2));
	}
}

class TreeNode {
	int val;
	TreeNode esq;
	TreeNode dir;

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode esq, TreeNode dir) {
		this.val = val;
		this.esq = esq;
		this.dir = dir;
	}

	public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arr) {
		if (root == null)
			return arr;
		inorder(root.esq, arr);
		arr.add(root.val);
		inorder(root.dir, arr);
		return arr;
	}

	public int kthSmallest(TreeNode root, int k) {
		ArrayList<Integer> nums = inorder(root, new ArrayList<Integer>());
		return nums.get(k - 1);
	}
}
