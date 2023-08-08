package co.simplon.stickme.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "aspects")
public class Aspect extends AbstractEntity {

    @Column(name = "name", updatable = false)
    private String name;

    public Aspect() {
	super();
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    @Override
    public String toString() {
	return "{name=" + name + "}";
    }

}
