public class ReassigningReference {
    private String name;

    public ReassigningReference(String name) {
        this.name = name;
        System.out.println("Object created: " + name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected: " + name);
        super.finalize();
    }

    public static void main(String[] args) {
        ReassigningReference ref1 = new ReassigningReference("Object1");
        ReassigningReference ref2 = new ReassigningReference("Object2");

        ref1 = ref2;

        System.gc();
        System.out.println("Garbage collector invoked.");
        
    }
}
