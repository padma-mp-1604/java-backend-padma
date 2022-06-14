package methodreference_constructor;

public class ConstructorReference {
    public static void main(String[] args) {
        Abc abc= Pqr::new;
        abc.count();
    }
}
