package Algorithm;

public class InsertingSort {

    public static void main(String[] args) {

        int a[] ={2,9,10,5,6,3,8,7,1};

        for (int k=1;k<9;k++){
            int temp = a[k];
            int j = k-1;
            while (j>=0 && temp<=a[j]){

                a[j+1] = a[j];
                j= j-1;
            }
            a[j+1] = temp;
        }

        for (int o=0;o<9;o++){
            System.out.println(a[o]);
        }
    }
}
