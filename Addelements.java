public class Addelements {
    public static void main(String[] args){
        int[][] myArray = new int[3][4];

        for(int i = 0; i<myArray.length;i++) {
            for (int j=0; j<myArray.length;j++) {
                int value = (i*5)+j;
                myArray[i][j] = value;
            }
        }

    System.out.println("Contents for the multidimensional array are:");
        for(int i = 0; i<myArray.length;i++) {
            for (int j=0; j<myArray.length;j++) {
                System.out.print(myArray[i][j] + "\t");

}
    System.out.println();
}
}
}

