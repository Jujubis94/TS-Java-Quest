public class Photo {
    private String url;
    private String filename;
    private String width;
    private String height;

    // Constructeur
    public Photo(String number, String street, String width, String height) {
        this.url = number;
        this.filename = street;
        this.width = width;
        this.height = height;
    }
}