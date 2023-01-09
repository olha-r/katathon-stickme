package co.simplon.stickme.dtos;

import co.simplon.stickme.entities.Aspect;
import co.simplon.stickme.entities.Size;

public interface StickerDetailsView {

    String getName();

    String getImageUrl();

    Size getSize();

    Aspect getAspect();

    String getDescription();

    Double getPrice();

}
