public class fibonaci {
    public void fibonaci(int length){
        int a=0;
        int b=1;
        for (int i=0;i<length;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String[] args){
    fibonaci f=new fibonaci();
    f.fibonaci(10);
    }
}
