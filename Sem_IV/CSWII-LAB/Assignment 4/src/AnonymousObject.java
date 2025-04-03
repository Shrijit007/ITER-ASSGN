public class AnonymousObject {
    private String name;

    public AnonymousObject(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Garbage collected for object: " + name);
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        new AnonymousObject("AnonymousObjectInstance");
        System.gc();
        System.out.println("Garbage collection requested.");
    }
}
