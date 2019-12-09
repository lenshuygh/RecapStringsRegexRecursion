package recursion;

public class TreeTraversal {
    public static void main(String[] args) {
        BinaryNode<String> binaryNodeOne = new BinaryNode<>("one");
        BinaryNode<String> binaryNodeTwo = new BinaryNode<>("two");
        BinaryNode<String> binaryNodeThree = new BinaryNode<>("three");
        BinaryNode<String> binaryNodeFour = new BinaryNode<>("four");
        BinaryNode<String> binaryNodeFive = new BinaryNode<>("five");

        binaryNodeOne.setLeft(binaryNodeTwo);
        binaryNodeOne.setRight(binaryNodeThree);
        binaryNodeTwo.setLeft(binaryNodeFour);
        binaryNodeTwo.setRight(binaryNodeFive);

        // InOrder 4 2 5 1 3

        // PreOrder 1 2 4 5 3

        // PostOrder 4 5 2 3 1
        System.out.println("InOrder");
        inOrderTraversal(binaryNodeOne);
        System.out.println("InOrder 2");
        inOrderTraversal2(binaryNodeOne);


        System.out.println();
        System.out.println("PreOrder");
        preOrderTraversal(binaryNodeOne);
        System.out.println("PreOrder 2");
        preOrderTraversal2(binaryNodeOne);

        System.out.println();
        System.out.println("PostOrder");
        postOrderTraversal(binaryNodeOne);
        System.out.println("PostOrder 2");
        postOrderTraversal2(binaryNodeOne);
    }

    private static BinaryNode inOrderTraversal(BinaryNode bNode) {
        if (null == bNode.getLeft() && null == bNode.getRight()) {
            System.out.println(bNode.getData());
            return bNode;
        } else {
            if (null != bNode.getLeft()) {
                inOrderTraversal(bNode.getLeft());
            }
            if (null != bNode.getRight()) {
                System.out.println(bNode.getData());
                inOrderTraversal(bNode.getRight());
            }
        }
        return bNode;
    }

    private static void inOrderTraversal2(BinaryNode binaryNode) {
        if (null != binaryNode.getLeft()) {
            inOrderTraversal2(binaryNode.getLeft());
        } else {
            System.out.println(binaryNode.getData());
        }
        if (null != binaryNode.getRight()) {
            System.out.println(binaryNode.getData());
            inOrderTraversal2(binaryNode.getRight());
        }
    }

    private static BinaryNode preOrderTraversal(BinaryNode bNode) {
        System.out.println(bNode.getData());
        if (null != bNode.getLeft()) {
            preOrderTraversal(bNode.getLeft());
        }
        if (null != bNode.getRight()) {
            preOrderTraversal(bNode.getRight());
        }
        return bNode;
    }

    private static void preOrderTraversal2(BinaryNode binaryNode){
        System.out.println(binaryNode.getData());
        if(null != binaryNode.getLeft()){
            preOrderTraversal2(binaryNode.getLeft());
        }
        if(null != binaryNode.getRight()){
            preOrderTraversal2(binaryNode.getRight());
        }
    }

    private static BinaryNode postOrderTraversal(BinaryNode bNode) {
        if (null == bNode.getLeft() && null == bNode.getRight()) {
            System.out.println(bNode.getData());
            return bNode;
        } else {
            if (null != bNode.getLeft()) {
                postOrderTraversal(bNode.getLeft());
            }
            if (null != bNode.getRight()) {
                postOrderTraversal(bNode.getRight());
            }
        }
        System.out.println(bNode.getData());
        return bNode;
    }

    private static void postOrderTraversal2(BinaryNode bNode) {
        if(null == bNode.getLeft() && null == bNode.getRight()){
            System.out.println(bNode.getData());
        }else {
            if (null != bNode.getLeft()) {
                postOrderTraversal2(bNode.getLeft());
            }
            if (null != bNode.getRight()) {
                postOrderTraversal2(bNode.getRight());
            }
            System.out.println(bNode.getData());
        }
    }
}