package com.alevel.java.nix.module1;

public class MaxDepth {
    public static void main(String[] args) {
        BinaryTree<Integer> b = new BinaryTree<Integer>();
        b.add(5);
        b.add(3);
        b.add(2);


        System.out.println("\n");
        System.out.println("Глубина:");
        b.show();
    }

    public static class BinaryTree<T extends Number> {
        private Node root;

        class Node {
            Node left;
            Node right;
            T value;

            Node(T value) {
                this.value = value;
            }
        }

        private void insert(T value, Node node) {
            if (root == null) {
                root = new Node(value);
                System.out.println("Корень" + root.value);
                return;
            }
            if (node.value.doubleValue() > value.doubleValue()) {
                if (node.left == null) {
                    node.left = new Node(value);
                    System.out.println("Корень " + node.value + " left " + value);

                } else insert(value, node.left);
            } else {
                if (node.right == null) {
                    node.right = new Node(value);
                    System.out.println("Корень " + node.value + " right " + value);

                } else insert(value, node.right);
            }

        }

        public void add(T value) {
            insert(value, root);
        }

        private void show_private(Node node) {
            if (node == null) return;
            String left = (node.left == null ? "нету" : node.left.value + "");
            String right = (node.right == null ? "нету" : node.right.value + "");
            System.out.println("Корень" + node.value + " ,левый : " + left + ", правый : " + right);
            show_private(node.left);
            show_private(node.right);
        }

        public void show() {
            System.out.println(depth(root, 0));
        }

        private int depth(Node root, int depth) {
            int leftDepth = root.left == null ? depth : depth(root.left, depth + 1);
            int rightDepth = root.right == null ? depth : depth(root.right, depth + 1);
            return Math.max(leftDepth, rightDepth);
        }
    }
}
