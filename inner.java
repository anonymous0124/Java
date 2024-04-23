 class Rect {
    Point a;
    Point b;
    public Rect(int x1, int y1, int x2, int y2){
        a= new Point(x1,y1);
        b= new Point(x2,y2);
    }
    public void area(){
        int len=b.x=a.x;
        int br=b.y=a.y;
        System.out.println("area= "+(len*br));
    }
    class Point{
        int x,y;
        public Point(int x, int y){
            this.x=x;
            this.y=y;
        }
        public void show(){
            System.out.println("x="+x);
            System.out.println("y="+y);
        }
    }
    }
    class inner{
        public static void main (String[] argv) {
            Rect r = new Rect(100,200, 300, 400);
            r.a.show();
            r.b.show();
            r.area();
        }
}