
public static void main(String[] args){
    //criando lista:
    int[] lista = {9, 2, 2, 1, 5, 7, 1, 8, 9 , 12, 13, 9, 0};

    //Ordenando:
    //SelectSort.sort(lista);
    //InsertSort.sort(lista);
    ShellSort.sort(lista);

    //Mostrar lista:
    for ( int n : lista)
        System.out.print(n + " ");
}
