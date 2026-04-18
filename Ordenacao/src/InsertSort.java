public class InsertSort {
    public static void sort(int[] array){
        int n = array.length;
        int i, j;

        for(i = 1; i < n; i++){
            j = i - 1;
            int temp = array[i];

            while(j >= 0 && temp < array[j]){
                //"Empurra" o de trás pra frente
                array[j + 1] = array[j] ;
                j = j - 1;
            }
            array[j + 1] = temp;
        }

    }
}
