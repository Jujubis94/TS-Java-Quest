import java.util.Date;

public class User {
    private Date birthdate;
    private Number size;
    private Photo[] photos;
    private Address address;

    // Constructeur
    public User(Date birthdate, Number size, Photo[] photos, Address address) {
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos;
        this.address = address;
    }
}