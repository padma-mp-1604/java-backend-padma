package lambdaexpression5;

public class Main {
    public static void main(String[] args) {
        Addable ad1 = (a, b) -> (a + b);
        int result = ad1.add(10, 20);
        System.out.println(result);

        Addable ad2 =(int a, int b) -> (a+b);
        System.out.println(ad2.add(30,20));

        Addable ad3 =( a,  b) -> (a+b);
        System.out.println(ad3.add(50,20));

        Addable ad4 =(a, b)->{
            return (a+b);

        };
        System.out.println(ad4.add(70,20));

    }
}


