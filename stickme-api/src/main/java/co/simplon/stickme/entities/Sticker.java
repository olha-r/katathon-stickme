package co.simplon.stickme.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stickers")
public class Sticker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "image_url")
    private String imageUrl;

    @JoinColumn(name = "size_id")
    @ManyToOne
    private Size size;

    @JoinColumn(name = "aspect_id")
    @ManyToOne
    private Aspect aspect;

    @Column(name = "price")
    private Double price;

    @Column(name = "created_at", updatable = false)
    private LocalDate createdAt;

    public Sticker() {
	super();
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getImageUrl() {
	return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
    }

    public Size getSize() {
	return size;
    }

    public void setSize(Size size) {
	this.size = size;
    }

    public Aspect getAspect() {
	return aspect;
    }

    public void setAspect(Aspect aspect) {
	this.aspect = aspect;
    }

    public Double getPrice() {
	return price;
    }

    public void setPrice(Double price) {
	this.price = price;
    }

    public LocalDate getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
	this.createdAt = createdAt;
    }

    @Override
    public String toString() {
	return "{id=" + id + ", name=" + name
		+ ", description=" + description
		+ ", imageUrl=" + imageUrl + ", size="
		+ size + ", aspect=" + aspect + ", price="
		+ price + ", createdAt=" + createdAt + "}";
    }

}
