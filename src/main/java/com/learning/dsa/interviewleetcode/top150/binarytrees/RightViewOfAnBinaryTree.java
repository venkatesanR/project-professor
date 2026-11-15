package com.learning.dsa.interviewleetcode.top150.binarytrees;

import java.util.*;

public class RightViewOfAnBinaryTree {
    public List<Integer> rightSideView(final TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (Objects.isNull(root)) {
            return res;
        }

        Queue<TreeNode> holder = new LinkedList<>();
        holder.offer(root);

        while (!holder.isEmpty()) {
            int size = holder.size();
            for (int i = 0; i < size; i++) {
                TreeNode temp = holder.poll();
                if (Objects.isNull(temp)) {
                    continue;
                }
                if (i == size - 1) res.add(temp.val);
                if (temp.left != null) holder.offer(temp.left);
                if (temp.right != null) holder.offer(temp.right);
            }
        }
        return res;
    }
}