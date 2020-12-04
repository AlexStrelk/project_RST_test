package data;

public enum UserRstTest {

    email ("sashastrelkovsky18@gmail.com"),
    password ("12345");






    private final String value;


    UserRstTest(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
