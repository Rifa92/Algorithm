package Algorithm;

public class BubbleSort {

    public static void main(String[] args) {

        int a []={2,5,3,8,6,4,6,9};
        for (int i=0;i<8;++i){
            for (int j=0;j<8;++j){
                if (a[i]< a[j]){

                    int temp = a[i];
                    a[i] = a[j];
                    a [j]= temp;
                }
            }
        }
        System.out.println("Prining sorted list......");
        for (int i =0;i<8;i++){
            System.out.println(a[i]);
        }
    }
}
