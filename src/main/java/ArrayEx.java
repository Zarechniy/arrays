public class ArrayEx {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int firtsTemp = array[0];
        array[0] = array[array.length -1];
        array[array.length - 1] = firtsTemp;
        
        System.out.println(array[0] + array[array.length / 2]);
    }
}
