
public static void main(String[] args){
    //criando lista:
    int[] lista = {9, 2, 2, 1, 5, 7, 1};

    //Ordenando:
    SelectSort.sort(lista);

    //Mostrar lista:
    for ( int n : lista)
        System.out.print(n + " ");
}
