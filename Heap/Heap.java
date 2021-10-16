package Heap;

import java.util.ArrayList;

public class Heap {

    public static void sort(ArrayList<Integer> arr, int size){

        build_max_heap(arr, size);

        //Heap Sort
        heap_sort(arr, size);
    }

    public static void heapify(ArrayList<Integer> arr, int n, int i){
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < n && arr.get(left) > arr.get(largest)){
            largest = left;
        }
        if(right < n && arr.get(right) > arr.get(largest)){
            largest = right;
        }
        if(largest != i){
            int temp = arr.get(largest);
            arr.set(largest, arr.get(i));
            arr.set(i, temp);

            heapify(arr, n, largest);
        }
    }

    public static void build_max_heap(ArrayList<Integer> arr, int size){
        for(int i = size / 2 - 1; i >= 0; i--) {
            heapify(arr, size, i);
        }
    }

    public static void heap_sort(ArrayList<Integer> arr, int size){
        for(int i = size - 1; i >=0; i-- ){
            int temp = arr.get(0);
            arr.set(0, arr.get(i));
            arr.set(i, temp);

            heapify(arr, i, 0);
        }
    }

    public static void insert(ArrayList<Integer> arr, int newNum){
        int size = arr.size();
        if(size == 0){
            arr.add(newNum);
        }else{
            arr.add(newNum);
            build_max_heap(arr, size);
           
        }
    }

    public static void deleteNode(ArrayList<Integer> arr, int newNum){
        int size = arr.size();
        int i;
        for(i = 0; i < size; i++){
            if(newNum == arr.get(i)){
                break;
            }
        }
        int temp = arr.get(i);
        arr.set(i, arr.get(size-1));
        arr.set(size-1, temp);

        arr.remove(size-1);

        build_max_heap(arr, size);
    }

    public static void printArray(ArrayList<Integer> array, int size){
        for(Integer i: array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int size = array.size();

        insert(array, 3);
        insert(array, 4);
        insert(array, 9);
        insert(array, 5);
        insert(array, 2);   
        
        printArray(array, size);

        //deleteNode(array, 4);
        sort(array,size);
        printArray(array, size);
    }
}
