package main.java.mx.utng.s25.testdb.model;

import jakarta.persistence.GenerateValue;
import jakarta.persistence.Colum;
import javax.processing.GeneratedValueType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

public class Pokemon {

    @Id @GeneratedValue
    private long id;
    @Colum(length = 50, nullable = false )
    private String name;
    @Colum(nullable = false)

    private Type type;

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setType(Type type) {
        this.type = type;
    }

}