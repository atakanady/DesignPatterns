package builder;

public class test {
    public static void main(String[] args) {
        BarbellMovement ftns = new BarbellMovement(new BarbellMovement.Builder("kjhjkhkj").BarbellGroup("BarbellP").BarbellGroupRow("Rows"));

        System.out.println(ftns);
    }
}
