public class UnreachableObject {
    private String name;

    public UnreachableObject(String name) {
        this.name = name;
        System.out.println("Object created: " + name);
    }

    public void display() {
        UnreachableObject obj = new UnreachableObject("InnerObject");
        System.out.println("Displaying object: " + obj.name);
    }

    public void show() {
        UnreachableObject obj = new UnreachableObject("OuterObject");
        obj.display();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected: " + name);
        super.finalize();
    }

    public static void main(String[] args) {
        UnreachableObject uo = new UnreachableObject("MainObject");
        uo.show();
        uo = null;
        System.gc();
        System.out.println("Garbage collector invoked.");
    }
}
