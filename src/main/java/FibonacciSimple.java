public class FibonacciSimple {
    public static void main(String[] args) {
        int x = 0,y = 1;
            for(int i=0;i<3;i++){
            System.out.println(x);
            System.out.println(y);
            x=x+y;
            y=x+y;
        }
    }
}
