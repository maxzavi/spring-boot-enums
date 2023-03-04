package pe.maxz.demoenums.model;

import lombok.Data;

@Data
public class People {
    private String name;
    private String lastname;
    private PeopleGender gender;
    private PeopleStatus status;
}
