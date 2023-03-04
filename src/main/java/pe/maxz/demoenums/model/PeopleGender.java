package pe.maxz.demoenums.model;

public enum PeopleGender {
    MALE ("Male"), FEMALE ("Female");

    private String code;

    private PeopleGender(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
