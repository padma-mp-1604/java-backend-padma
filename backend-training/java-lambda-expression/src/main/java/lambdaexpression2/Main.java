package lambdaexpression2;

public class Main {
    public static void main(String[] args) {

        Addable add = (a,b) -> (a+b);
        int result = add.addition(10,20);
        System.out.println(result);

        Addable add1 = (int a, int b) ->{
            int c=(a+b);
            return c;
        };
        System.out.println(add1.addition(10,20));
    }
}
