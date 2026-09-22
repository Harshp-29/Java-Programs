class Program20 {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        a++;
        b--;

        int c = a++ + ++b;

        c += 5;

        double d = c / 2;

        int e = (int) (c / 2.0);

        int result = (e > 10) ? e : e + 5;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(result);
    }
}