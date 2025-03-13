public abstract class Sort {
    public int[] a;
    public int elem = 0;

    void add(int numb){
        a[elem]=numb;
        elem++;
    };
    void sub(int numb){
    for (int i = numb; i < elem - 1; i++){
        a[i] = a[i + 1];
    }
    elem--;
    };

    public void print(){
        for (int i=0;i<elem;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}