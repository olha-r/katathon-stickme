package co.simplon.stickme.dtos;

import java.time.LocalDate;

public interface EditAllStickers {

    Long getId();

    String getImageUrl();

    String getName();

    LocalDate getCreatedAt();

}
