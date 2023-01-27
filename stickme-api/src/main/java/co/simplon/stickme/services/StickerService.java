package co.simplon.stickme.services;

import java.util.Collection;
import java.util.Optional;

import javax.validation.Valid;

import co.simplon.stickme.dtos.AllStickersView;
import co.simplon.stickme.dtos.EditAllStickers;
import co.simplon.stickme.dtos.StickerCreateDto;
import co.simplon.stickme.dtos.StickerDetailsView;
import co.simplon.stickme.dtos.StickerUpdateDto;

public interface StickerService {

    void create(@Valid StickerCreateDto inputs);

    Collection<AllStickersView> getAll();

    Collection<EditAllStickers> getAllForEdit();

    void update(@Valid StickerUpdateDto inputs, Long id);

    Optional<StickerDetailsView> getStickerById(Long id);

    void delete(Long id);

}
