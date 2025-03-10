public class BubbleSort {
    private long[] a;
    private int elem;

    public BubbleSort(int max) {
        this.a = new long[max];
        this.elem = 0 ;
    }
    public void add(int numb){
        a[elem]=numb;
        elem++;
    }
    public void swap(int first, int second){
        long temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
    public void sort(){
        for (int out = elem - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if (a[ in ] > a[ in + 1 ]){
                    swap( in , in + 1 );
                }
            }
        }
    }
    public static void main(String[] args){
        BubbleSort b = new BubbleSort(10);
        for (int i=0;i<10;i++){
            b.add((int)(Math.random()*100));
        }
        b.sort();
        for (int i=0;i<10;i++){
            System.out.print(b.a[i] + " ");
        }
    }
}
