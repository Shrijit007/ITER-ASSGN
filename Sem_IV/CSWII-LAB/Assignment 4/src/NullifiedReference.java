public class NullifiedReference {
    private String name;

    public NullifiedReference(String name) {
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
        NullifiedReference ref = new NullifiedReference("TestObject");
        ref = null;
        System.gc();
        System.out.println("Garbage collection requested.");
    }
}
