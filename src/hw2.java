public class hw2 {

    public static void main(String[] args) {

        double a = 1.1;
        int b = 10;
        double value = b/a;
        String res = String.format("%.2f", value).replace(",", ".");
        String smail = "\ud83d\ude0a";


        System.out.println(b+a);
        System.out.println(b*a);
        System.out.println(b-a);
        System.out.println(res);

        System.out.println(smail);

    }
}
