package main.java.mx.utng.s25.testdb.model;

import jakarta.persistence.GenerateValue;
import jakarta.persistence.Colum;
import javax.processing.GeneratedValueType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity  
public class Trainer {

    @Id @GeneratedValue
    @GenerateValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

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
}