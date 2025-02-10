package Q45;

public class Image {
    private int imageWidth;
    private int imageHeight;
    private String colorCode;

    public Image() {
        this.imageWidth = 0;
        this.imageHeight = 0;
        this.colorCode = "#000000";
    }

    public Image(int width, int height, String color) {
        this.imageWidth = width;
        this.imageHeight = height;
        this.colorCode = color;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setImageWidth(int width) {
        this.imageWidth = width;
    }

    public void setImageHeight(int height) {
        this.imageHeight = height;
    }

    public void setColorCode(String color) {
        this.colorCode = color;
    }

    public String toString() {
        return "Image Details - Width: " + imageWidth + ", Height: " + imageHeight + ", Color Code: " + colorCode;
    }
    public static void main(String[] args) {
        Image image1 = new Image();
        Image image2 = new Image(100, 200, "#FF0000");

        System.out.println(image1);
        System.out.println(image2);

        image1.setImageWidth(300);
        image1.setImageHeight(400);
        image1.setColorCode("#00FF00");

        System.out.println("After modifying image1:");
        System.out.println(image1);
        System.out.println(image2);
    }
}
