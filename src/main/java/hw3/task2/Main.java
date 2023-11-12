package hw3.task2;

/**
 * 2. Напишите обобщенный метод compareArrays(),
 * который принимает два массива и возвращает true, если они одинаковые,
 * и false в противном случае.
 * Массивы могут быть любого типа данных,
 * но должны иметь одинаковую длину и содержать элементы одного типа.
 */
public class Main {
    public static void main(String[] args) {
        String[] list1 = {"Hello", "world"};
        String[] list = {"Hello", "world"};
        System.out.println(compareArrays(list1, list));

        Double[] array1 = {1.1, 2.2, 3.3, 4.4};
        Double[] array2 = {1.10, 2.20, 3.30, 4.40};
        System.out.println(compareArrays(array1, array2));

        System.out.println(compareArrays(list1, array1));
    }

    public static <T> boolean compareArrays(T[] arr1, T[] arr2){
        if(arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if( !arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
}
