package co.simplon.stickme.controllers;

import java.util.Collection;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.stickme.dtos.AllStickersView;
import co.simplon.stickme.dtos.EditAllStickers;
import co.simplon.stickme.dtos.StickerCreateDto;
import co.simplon.stickme.dtos.StickerDetailsView;
import co.simplon.stickme.dtos.StickerUpdateDto;
import co.simplon.stickme.services.StickerService;

@RestController
@RequestMapping("/stickers")
@CrossOrigin
public class StickerController {

    private StickerService service;

    public StickerController(StickerService service) {
	this.service = service;

    }

    @PostMapping()
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void create(
	    @Valid @RequestBody StickerCreateDto inputs) {
	service.create(inputs);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(
	    @Valid @RequestBody StickerUpdateDto inputs,
	    @PathVariable("id") Long id) {
	service.update(inputs, id);
    }

    @GetMapping()
    public Collection<AllStickersView> getAll() {
	return service.getAll();
    }

    @GetMapping("/edit-all")
    public Collection<EditAllStickers> getAllForEdit() {
	return service.getAllForEdit();
    }

    @GetMapping("/{id}")
    public Optional<StickerDetailsView> getSticker(
	    @PathVariable("id") Long id) {
	return service.getStickerById(id);
    }

}
