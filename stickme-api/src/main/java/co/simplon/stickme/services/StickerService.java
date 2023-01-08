package co.simplon.stickme.services;

import java.util.Collection;

import javax.validation.Valid;

import co.simplon.stickme.dtos.AllStickersView;
import co.simplon.stickme.dtos.EditAllStickers;
import co.simplon.stickme.dtos.StickerCreateDto;

public interface StickerService {

    void create(@Valid StickerCreateDto inputs);

    Collection<AllStickersView> getAll();

    Collection<EditAllStickers> getAllForEdit();

}
