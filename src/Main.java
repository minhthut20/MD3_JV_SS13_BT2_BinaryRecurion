import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i]= (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int value = (int) (Math.random()*100);
        int index = binarySearch(array,0,99,value);
        if (index==-1){
            System.out.println("Không tìm thấy giá trị " + value);
        }else
        System.out.println("Số " + value +  " nằm ở vị trí số " + index);
    }
    public static int binarySearch(int[] array, int left, int right ,int value){
        while (left<=right){
            int middle = (left+right)/2;s
            if (array[middle]==value){
                return middle;
            } else if (value>array[middle]) {
                left = middle+1;
            }else {
                right = middle -1;
            }
        }
        return -1;
    }
}
