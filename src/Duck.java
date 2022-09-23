public class Duck extends Animal{
    static{
        System.out.println("Whoa!");
    }

    final static int X = 42;

    /*
    same as
    final static int X;
    static {
    X = 42;
    }
     */

    private int size;
    private static int duckCount = 0;

    private String name;

    public int getDuckCount(){
        return duckCount;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    private Duck(){
        duckCount++;
    }

    public Duck(String name){
        this.name = name;
        duckCount++;
    }

    static Duck myDuck = new Duck();

    private Integer i; // because it's an object, default value is null
    private int j;

    public void go(){
        i = j;
        System.out.println(j);
        System.out.println(i);
    }


}
