public class TestBST {

    public static void main(String[] args) {

      BinSearchTree<String> myTree = new BinSearchTree<String>();
        myTree.insertRecursive("Juliet");
        myTree.insertRecursive("Eve");
        myTree.insertRecursive("Romeo");
        myTree.insertRecursive("Juliet");

        /*myTree.insertIterative("Juliet");
        myTree.insertIterative("Eve");
        myTree.insertIterative("Romeo");
        myTree.insertIterative("Juliet");*/

        /*Print out the binary search tree items*/
        myTree.printSub();

        if(!myTree.contains("Carrie"))
        {
            System.out.println("\nError! This element is not present");
        }

        if(myTree.contains("Eve"))
        {
            System.out.println("\nElement is Present");
        }

    }


}
