package comparaOrdenacao;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

class ComparadorOrdenacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nTamanho do conjunto: ");
        int n = scanner.nextInt();

        while (n > 2) {
            long start;
            float tempoQuaseOrdenado, tempoDesordenado, tempoDecrescente;
            int[] aleatorio, decrescente = new int[n], copia = new int[n], quaseOrdenado = new int[n];

            aleatorio = randomizeArray(IntStream.rangeClosed(1, n).toArray());
            System.arraycopy(aleatorio, 0, copia, 0, copia.length);
            Arrays.sort(copia);
            System.arraycopy(copia, 0, quaseOrdenado, 0, quaseOrdenado.length);
            trocarAleatorio(quaseOrdenado, 4);
            reverseArray(copia);
            System.arraycopy(copia, 0, decrescente, 0, copia.length);

            System.out.printf("%-11s%9s%12s%12s%n", "Algoritmo", "QuaseOrdenado", "Desordenado", "Decrescente");

            // HEAPSORT
            start = System.currentTimeMillis();
            System.arraycopy(aleatorio, 0, copia, 0, copia.length);
            Ordenador.heapSort(copia);
            tempoDesordenado = (float) (System.currentTimeMillis() - start) / 1000;

            start = System.currentTimeMillis();
            System.arraycopy(decrescente, 0, copia, 0, copia.length);
            Ordenador.heapSort(copia);
            tempoDecrescente = (float) (System.currentTimeMillis() - start) / 1000;

            start = System.currentTimeMillis();
            System.arraycopy(quaseOrdenado, 0, copia, 0, copia.length);
            Ordenador.heapSort(copia);
            tempoQuaseOrdenado = (float) (System.currentTimeMillis() - start) / 1000;
            System.out.printf("%-14s%8.3f s%10.3f s%10.3f s%n", "Heapsort", tempoQuaseOrdenado, tempoDesordenado, tempoDecrescente);


            // QUICKSORT
            start = System.currentTimeMillis();
            System.arraycopy(aleatorio, 0, copia, 0, copia.length);
            Ordenador.quickSort(copia);
            tempoDesordenado = (float) (System.currentTimeMillis() - start) / 1000;

            start = System.currentTimeMillis();
            System.arraycopy(decrescente, 0, copia, 0, copia.length);
            Ordenador.quickSort(copia);
            tempoDecrescente = (float) (System.currentTimeMillis() - start) / 1000;

            start = System.currentTimeMillis();
            System.arraycopy(quaseOrdenado, 0, copia, 0, copia.length);
            Ordenador.quickSort(copia);
            tempoQuaseOrdenado = (float) (System.currentTimeMillis() - start) / 1000;
            System.out.printf("%-14s%8.3f s%10.3f s%10.3f s%n", "Quicksort", tempoQuaseOrdenado, tempoDesordenado, tempoDecrescente);


            // SHELLSORT
            start = System.currentTimeMillis();
            System.arraycopy(aleatorio, 0, copia, 0, copia.length);
            Ordenador.shellSort(copia);
            tempoDesordenado = (float) (System.currentTimeMillis() - start) / 1000;

            start = System.currentTimeMillis();
            System.arraycopy(decrescente, 0, copia, 0, copia.length);
            Ordenador.shellSort(copia);
            tempoDecrescente = (float) (System.currentTimeMillis() - start) / 1000;

            start = System.currentTimeMillis();
            System.arraycopy(quaseOrdenado, 0, copia, 0, copia.length);
            Ordenador.shellSort(copia);
            tempoQuaseOrdenado = (float) (System.currentTimeMillis() - start) / 1000;
            System.out.printf("%-14s%8.3f s%10.3f s%10.3f s%n", "Shellsort", tempoQuaseOrdenado, tempoDesordenado, tempoDecrescente);


            // MERGESORT
            start = System.currentTimeMillis();
            System.arraycopy(aleatorio, 0, copia, 0, copia.length);
            Ordenador.mergeSort(copia, copia.length);
            tempoDesordenado = (float) (System.currentTimeMillis() - start) / 1000;

            start = System.currentTimeMillis();
            System.arraycopy(decrescente, 0, copia, 0, copia.length);
            Ordenador.mergeSort(copia, copia.length);
            tempoDecrescente = (float) (System.currentTimeMillis() - start) / 1000;

            start = System.currentTimeMillis();
            System.arraycopy(quaseOrdenado, 0, copia, 0, copia.length);
            Ordenador.mergeSort(copia, copia.length);
            tempoQuaseOrdenado = (float) (System.currentTimeMillis() - start) / 1000;
            System.out.printf("%-14s%8.3f s%10.3f s%10.3f s%n", "Mergesort", tempoQuaseOrdenado, tempoDesordenado, tempoDecrescente);


            // RADIX SORT
            start = System.currentTimeMillis();
            System.arraycopy(aleatorio, 0, copia, 0, copia.length);
            Ordenador.radixSort(copia);
            tempoDesordenado = (float) (System.currentTimeMillis() - start) / 1000;

            start = System.currentTimeMillis();
            System.arraycopy(decrescente, 0, copia, 0, copia.length);
            Ordenador.radixSort(copia);
            tempoDecrescente = (float) (System.currentTimeMillis() - start) / 1000;

            start = System.currentTimeMillis();
            System.arraycopy(quaseOrdenado, 0, copia, 0, copia.length);
            Ordenador.radixSort(copia);
            tempoQuaseOrdenado = (float) (System.currentTimeMillis() - start) / 1000;
            System.out.printf("%-14s%8.3f s%10.3f s%10.3f s%n", "Radix Sort", tempoQuaseOrdenado, tempoDesordenado, tempoDecrescente);


            // INSERTION SORT
            start = System.currentTimeMillis();
            System.arraycopy(aleatorio, 0, copia, 0, copia.length);
            Ordenador.insertionSort(copia);
            tempoDesordenado = (float) (System.currentTimeMillis() - start) / 1000;

            start = System.currentTimeMillis();
            System.arraycopy(decrescente, 0, copia, 0, copia.length);
            Ordenador.insertionSort(copia);
            tempoDecrescente = (float) (System.currentTimeMillis() - start) / 1000;

            start = System.currentTimeMillis();
            System.arraycopy(quaseOrdenado, 0, copia, 0, copia.length);
            Ordenador.insertionSort(copia);
            tempoQuaseOrdenado = (float) (System.currentTimeMillis() - start) / 1000;
            System.out.printf("%-14s%8.3f s%10.3f s%10.3f s%n", "Insertion Sort", tempoQuaseOrdenado, tempoDesordenado, tempoDecrescente);

            System.out.print("\nTamanho do conjunto: ");
            n = scanner.nextInt();
        }

    }

    private static int[] randomizeArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomPosition = random.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }

        return array;
    }

    private static void reverseArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; ++i) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    private static void trocarAleatorio(int[] array, int trocas) {
        Random r = new Random();

        int s1, s2, aux;

        for (int i = 0; i < trocas; i++) {
            s1 = r.nextInt(array.length - 1);
            s2 = r.nextInt(array.length - 1);
            aux = array[s1];
            array[s1] = array[s2];
            array[s2] = aux;
        }
    }
}
