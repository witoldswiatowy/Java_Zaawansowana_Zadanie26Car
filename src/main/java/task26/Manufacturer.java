package task26;

import lombok.Getter;

import java.util.List;

@Getter
public class Manufacturer {
    public String name;
    public int yearOfCreation;
    List<Model> models;

    public Manufacturer(String name, int yearOfCreation, List<Model> models) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
        this.models = models;
    }
}
