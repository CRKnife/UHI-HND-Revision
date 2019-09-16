public class IntegerSorter {

    public static void BubbleSort(int[] Array){

        int a;
        boolean continuesort;

        do {
            continuesort = false;
            for (int i = 0; i < Array.length - 1; i++) {

                if (Array[i] > Array[i + 1]) {
                    a = Array[i];
                    Array[i] = Array[i + 1];
                    Array[i + 1] = a;
                    continuesort = true;
                }
            }
        }while(continuesort == true);
        outputArray(Array);

    }

    public static void outputArray(int[] arrayParamiter){

        System.out.println("New");
        for (int value : arrayParamiter) {
            System.out.println(value);
        }

    }

    public static int[] start(){

        int[] integerArray1 = new int[10];

        for(int i = 0; i<integerArray1.length; i++){
            integerArray1[i] = (int)(Math.random()*10) + 1;
        }

        outputArray(integerArray1);

        return integerArray1;
    }

    public static void main(String[] args){
        BubbleSort(start());
    }
}
