public class ArrayFun {
    public static void main(String[] args) {
        int[] myarray;
        myarray = new int[5];

        myarray[0] = 10;
        myarray[1] = 22;
        myarray[2] = 5;
        myarray[3] = 17;
        myarray[4] = 28;

//        for (int i = 0; i<myarray.length; i++){
//            System.out.println(myarray[i]);
//        }// end for


        for (int num : myarray){        //enhanced for loop
            System.out.println(num);
        }

    }//end main
}
