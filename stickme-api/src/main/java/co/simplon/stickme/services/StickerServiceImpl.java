package co.simplon.stickme.services;

import java.time.LocalDate;
import java.util.Collection;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import co.simplon.stickme.dtos.AllStickersView;
import co.simplon.stickme.dtos.EditAllStickers;
import co.simplon.stickme.dtos.StickerCreateDto;
import co.simplon.stickme.entities.Aspect;
import co.simplon.stickme.entities.Size;
import co.simplon.stickme.entities.Sticker;
import co.simplon.stickme.repositories.AspectRepository;
import co.simplon.stickme.repositories.SizeRepository;
import co.simplon.stickme.repositories.StickerRepository;

@Service
public class StickerServiceImpl implements StickerService {

    private SizeRepository sizes;
    private AspectRepository aspects;
    private StickerRepository stickers;

    public StickerServiceImpl(SizeRepository sizes,
	    AspectRepository aspects,
	    StickerRepository stickers) {
	this.sizes = sizes;
	this.aspects = aspects;
	this.stickers = stickers;

    }

    @Override
    public void create(@Valid StickerCreateDto inputs) {

	Sticker sticker = new Sticker();
	sticker.setName(inputs.getName());
	sticker.setDescription(inputs.getDescription());
	sticker.setImageUrl(inputs.getImageUrl());
	sticker.setPrice(inputs.getPrice());

	Long sizeId = inputs.getSizeId();
	Size size = sizes.getReferenceById(sizeId);
	sticker.setSize(size);

	Long aspectId = inputs.getAspectId();
	Aspect aspect = aspects.getReferenceById(aspectId);
	sticker.setAspect(aspect);

	LocalDate createdAt = LocalDate.now();
	sticker.setCreatedAt(createdAt);
	this.stickers.save(sticker);

    }

    @Override
    public Collection<AllStickersView> getAll() {

	return stickers.findAllStickersProjectedBy();
    }

    @Override
    public Collection<EditAllStickers> getAllForEdit() {

	return stickers.findAllStickersForEditProjectedBy();
    }

}
