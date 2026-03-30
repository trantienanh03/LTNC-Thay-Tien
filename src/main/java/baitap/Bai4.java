package baitap;

public class Bai4 {

    public static int[] arrayPlus(int[] arr1, int[] arr2) {
        int[] longArr = (arr1.length >= arr2.length) ? arr1 : arr2;
        int[] shortArr = (arr1.length < arr2.length) ? arr1 : arr2;
        for (int i = 0; i < shortArr.length; i++) {
            longArr[i] += shortArr[i];
        }
        return longArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 7};
        int[] arr2 = {2, 7};
        int[] res = Bai4.arrayPlus(arr1, arr2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
