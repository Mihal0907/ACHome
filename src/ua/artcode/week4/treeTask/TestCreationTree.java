package ua.artcode.week4.treeTask;

import java.util.Arrays;

public class TestCreationTree {

    public static void main(String[] args) {

        TreeNode employee1 = new TreeNode(1000);
        TreeNode employee2 = new TreeNode(1500);
        TreeNode employee3 = new TreeNode(1600);
        TreeNode employee4 = new TreeNode(1300);
        TreeNode employee5 = new TreeNode(1800);

        TreeNode manager1 = new TreeNode(3000, Arrays.asList(employee1, employee2));
        TreeNode manager2 = new TreeNode(3000, Arrays.asList(employee3, employee4, employee5));
        TreeNode manager3 = new TreeNode(3000, Arrays.asList(new TreeNode(2000)));

        TreeNode director = new TreeNode(5000, Arrays.asList(manager1, manager2, manager3));

        TreeNodeUtils.count(director);

        int amount = TreeNodeUtils.count(director);
        System.out.println(amount);
    }
}
