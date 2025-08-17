package MaximumDepthOfBinarytree;
import java.util.*;

public class Solution {
    public int maxDepth(TreeNode root) {
        if(root ==null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int depth =0;
        while(!q.isEmpty()){
            depth++;
            int levelsize = q.size();
            for(int i =0; i<levelsize; i++){
                TreeNode node = q.poll();
                if(node.left != null)
                    q.add(node.left);
                if(node.right !=null)
                    q.add(node.right);
            }
        }
        return depth;
    }
}
