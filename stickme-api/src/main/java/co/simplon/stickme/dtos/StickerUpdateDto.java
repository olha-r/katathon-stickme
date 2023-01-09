package co.simplon.stickme.dtos;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class StickerUpdateDto {

    @NotEmpty
    @Size(min = 1, max = 100)
    private String name;

    @NotEmpty
    @Size(min = 1, max = 1000)
    private String description;

    @NotEmpty
    @Size(min = 1, max = 300)
    private String imageUrl;

    @NotNull
    private Long sizeId;

    @NotNull
    private Long aspectId;

    @NotNull
    @Positive
    @DecimalMax("100.00")
    private Double price;

    public StickerUpdateDto() {
	super();
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

    public Long getSizeId() {
	return sizeId;
    }

    public void setSizeId(Long sizeId) {
	this.sizeId = sizeId;
    }

    public Long getAspectId() {
	return aspectId;
    }

    public void setAspectId(Long aspectId) {
	this.aspectId = aspectId;
    }

    public Double getPrice() {
	return price;
    }

    public void setPrice(Double price) {
	this.price = price;
    }

    @Override
    public String toString() {
	return "{name=" + name + ", description="
		+ description + ", imageUrl=" + imageUrl
		+ ", sizeId=" + sizeId + ", aspectId="
		+ aspectId + ", price=" + price + "}";
    }

}
