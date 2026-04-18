public class SelectSort {
    public static void sort(int[] array){
        int n = array.length;
        int i, j, indMenor, temp;

        for(i = 0; i < n - 1; i++){
            indMenor = i;
            for(j = i + 1; j < n; j++){
                if(array[j] < array[indMenor]) {
                    indMenor = j;
                }
            }
            //troca:
            temp = array[indMenor];
            array[indMenor] = array[i];
            array[i] = temp;
        }
    }
}
