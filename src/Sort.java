public class Sort {

    public static void main(String[] args) {

        int[] a = new int[]{3,8,43,6,0};
        bubbleSort(a);
    }

    /**
     * 打印结果
     * @param a 数组数据
     */
    private static void printResult(int[] a){
        for (int b: a){
            System.out.print(b + " ");
        }
        System.out.println( " ");
    }

    /**
     * 冒泡排序
     * @param a 排序数组
     */
    private static void bubbleSort(int[] a){
        printResult(a);
        for (int i = 0;i<a.length - 1;i++){
            for (int j = i;j<a.length ;j++){
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        printResult(a);
    }
}
