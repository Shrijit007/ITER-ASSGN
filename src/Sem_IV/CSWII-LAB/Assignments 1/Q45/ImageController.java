package Q45;

class ImageLibrary {
    private Image images[];
    private int count = 0;
    
    public ImageLibrary(int n) {
        images = new Image[n];
        this.count = 0;
    }

    public void insertImage(Image image) {
        if(this.count < images.length)
            images[count++] = image;
        else 
            System.out.println("Image Library is Full");
    }

    public Image searchImage(int w, int h, String c) {
        for (Image img : images) {
            if (img.getImageWidth()==w && img.getImageHeight()==h && img.getColorCode()==c) {
                return img;
            }
        }
        return null;
    }
}

public class ImageController {
    public static void main(String[] args) {

        Image img1 = new Image(1920, 1080, "#FF5733");
        Image img2 = new Image(1080, 720, "#FF5606");

        ImageLibrary library = new ImageLibrary(2);
        library.insertImage(img1);
        library.insertImage(img2);

        Image foundImage = library.searchImage(1920,1080,"#FF5733");
        if (foundImage != null) 
            System.out.println("\nImage Found with Color Code : " + foundImage);
        else 
            System.out.println("\nNo Image Found with Color Code");
    }
}
