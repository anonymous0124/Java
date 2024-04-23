class Num {
    public static void add( int a, int b)
    {
        System.out.println("sum="+(a+b));
    }
    public static void sub( int a, int b)
    {
        System.out.println("diff="+(a-b));
    }
}
class stat {
    public static void main(String[] argv)
    {
        Num.add(200,200);
        Num.sub(200,100);
    }
}
