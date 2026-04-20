public class ShellSort {
    public static void sort(int[] array){
        int n = array.length;
        int i, j, gap, temp;

        //Define o gap inicial:
        gap = 1;
        while(gap < n){
            gap = (3 * gap) + 1;
        }

        while (gap > 0) {
            gap = (gap - 1)/3;  //Atualiza o gap

            for (i = gap; i < n; i++){
                temp = array[i];
                j = i;
                //Faz comparações na sublista do gap:
                while (array[j - gap] > temp){
                    array[j] = array[j - gap];
                    j = j - gap;
                    if (j < gap){
                        break;
                    }
                }
                array[j] = temp;
            }
        }

    }
}
