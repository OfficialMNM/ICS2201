public class Numbers {
    public static void main(String[] args) {

        int[] myArray = {20, 30, 40, 50, 60, 70};
        int newElement = 120;

        int[] newArray = new int[myArray.length + 1];

        // Copy elements from myArray to newArray
        for (int i = 0; i < myArray.length; i++) {
            newArray[i] = myArray[i];
        }

        // Add the extra element to the last position
        newArray[newArray.length - 1] = newElement;

        int sum = 0;

        for (int i = 0; i < newArray.length; i++) {
            sum += newArray[i];
        }

        System.out.println("Final Sum: " + sum);
    }
}
