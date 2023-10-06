class Solution
{
     ArrayList<Integer> ans = new ArrayList<>();
   
    void leftBoundary(Node root)
    {
        if(root == null || (root.left == null && root.right == null))
            return;
        ans.add(root.data);
        if(root.left  != null)
            leftBoundary(root.left);
        else
            leftBoundary(root.right);
            
    }
    void rightBoundary(Node root)
    {
        if(root == null || (root.left == null && root.right == null))
            return;
        
        if(root.right  != null)
            rightBoundary(root.right);
        else
            rightBoundary(root.left);
        ans.add(root.data);
    }
    void leafBoundary(Node root)
    {
        if(root == null)
            return;
        if(root.left == null && root.right == null)
            ans.add(root.data);
           
            leafBoundary(root.left);
             leafBoundary(root.right);
    }
	ArrayList <Integer> boundary(Node node)
	{
	    Node root = node;
	    if(root == null)
	        return ans;
	   ans.add(root.data);
	   leftBoundary(root.left);
	   leafBoundary(root.left);
	   leafBoundary(root.right);
	   rightBoundary(root.right);
	   
	   return ans;
	}
}
