class Program10 {
    public static void main(String[] args) {

        int x = 10;

        int a = x--;
        int b = --x;
        int c = x--;

        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}