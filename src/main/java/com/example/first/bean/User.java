package com.example.first.bean;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema
public class User {

    @Schema(example = "100")
    private int id;

    @Schema(example = "testName")
    private String name;

    @Schema(type = "List", subTypes = String.class, example = "[\"a\", \"b\"]")
    private String[] dogs;

    public String[] getDogs() {
        return dogs;
    }

    public void setDogs(String[] dogs) {
        this.dogs = dogs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
