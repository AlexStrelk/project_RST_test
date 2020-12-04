package data;

public enum Projects {
    RST_TEST("https://rst.ua/"),
    RST_Voiti_V_Kabinet("https://rst.ua/signin/");

    private final String value;


    Projects(String value) {
        this.value = value;
    }

    public String getUrl() {
        return value;
    }


}
