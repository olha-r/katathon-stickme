package co.simplon.stickme.services;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import co.simplon.stickme.dtos.AllStickersView;
import co.simplon.stickme.dtos.EditAllStickers;
import co.simplon.stickme.dtos.StickerCreateDto;
import co.simplon.stickme.dtos.StickerDetailsView;
import co.simplon.stickme.dtos.StickerUpdateDto;
import co.simplon.stickme.entities.Aspect;
import co.simplon.stickme.entities.Size;
import co.simplon.stickme.entities.Sticker;
import co.simplon.stickme.repositories.AspectRepository;
import co.simplon.stickme.repositories.SizeRepository;
import co.simplon.stickme.repositories.StickerRepository;

@Service
public class StickerServiceImpl implements StickerService {

    private SizeRepository sizesRepo;
    private AspectRepository aspectsRepo;
    private StickerRepository stickersRepo;

    public StickerServiceImpl(SizeRepository sizesRepo,
	    AspectRepository aspectsRepo,
	    StickerRepository stickersRepo) {
	this.sizesRepo = sizesRepo;
	this.aspectsRepo = aspectsRepo;
	this.stickersRepo = stickersRepo;

    }

    @Override
    public void create(@Valid StickerCreateDto inputs) {

	Sticker sticker = new Sticker();
	sticker.setName(inputs.getName());
	sticker.setDescription(inputs.getDescription());
	sticker.setImageUrl(inputs.getImageUrl());
	sticker.setPrice(inputs.getPrice());

	Long sizeId = inputs.getSizeId();
	Size size = sizesRepo.getReferenceById(sizeId);
	sticker.setSize(size);

	Long aspectId = inputs.getAspectId();
	Aspect aspect = aspectsRepo
		.getReferenceById(aspectId);
	sticker.setAspect(aspect);

	LocalDate createdAt = LocalDate.now();
	sticker.setCreatedAt(createdAt);
	this.stickersRepo.save(sticker);

    }

    @Override
    public Collection<AllStickersView> getAll() {

	return stickersRepo.findAllStickersProjectedBy();
    }

    @Override
    public Collection<EditAllStickers> getAllForEdit() {

	return stickersRepo
		.findAllStickersForEditProjectedBy();
    }

    @Override
    public void update(@Valid StickerUpdateDto inputs,
	    Long id) {

	Sticker entity = stickersRepo.findById(id).get();

	entity.setName(inputs.getName());
	entity.setImageUrl(inputs.getImageUrl());
	entity.setDescription(inputs.getDescription());
	Long sizeId = inputs.getSizeId();
	Size size = sizesRepo.getReferenceById(sizeId);
	entity.setSize(size);
	Long aspectId = inputs.getAspectId();
	Aspect aspect = aspectsRepo
		.getReferenceById(aspectId);
	entity.setAspect(aspect);
	entity.setPrice(inputs.getPrice());
	stickersRepo.save(entity);
    }

    @Override
    public Optional<StickerDetailsView> getStickerById(
	    Long id) {

	return stickersRepo.findProjectedById(id);
    }

    @Override
    public void delete(Long id) {
	stickersRepo.deleteById(id);
    }

}
