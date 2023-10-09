public class Numbers1 {
    public static void main(String[] args) {

        int[] myArray = {20, 30, 40, 50, 60, 70};
        int extraElement = 120;

        // Create a new array with one additional element
        int[] newArray = new int[myArray.length + 1];

        // Copy elements from myArray to newArray
        for (int i = 0; i < myArray.length; i++) {
            newArray[i] = myArray[i];
        }

        // Add the extra element to the last position
        newArray[newArray.length - 1] = extraElement;

        int sum = 0;

        // Calculate the sum of all elements in newArray
        for (int i = 0; i < newArray.length; i++) {
            sum += newArray[i];
        }

        System.out.println("Final Sum with Extra Element: " + sum);
    }
}
