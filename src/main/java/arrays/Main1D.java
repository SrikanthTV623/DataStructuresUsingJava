package arrays;

public class Main1D {
    public static void main(String[] args) {

        //calling the constructor
        SingleDimensionArray sda = new SingleDimensionArray(7);

        sda.insert(0,0);
        sda.insert(1,1);
        sda.insert(2,2);
        sda.insert(3,3);
        sda.insert(12,130);
        sda.insert(3,4);
        sda.insert(4,3);
        sda.insert(5,3);


        var firstElement = sda.arr[0];
        System.out.println(firstElement);

        //this print error arrayoutofboundexecption
        //var tenthElement = sda.arr[10];
        //System.out.println(tenthElement);

        System.out.println("Array Traversal");
        sda.traverseArray();
        System.out.println();

        System.out.println("Searching for Element in an Array");
        sda.searchInArray(2);

        System.out.println("Deleting an Array Element");
        sda.deleteValue(5);
    }
}