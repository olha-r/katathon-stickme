package co.simplon.stickme.repositories;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.stickme.dtos.AllStickersView;
import co.simplon.stickme.dtos.EditAllStickers;
import co.simplon.stickme.dtos.StickerDetailsView;
import co.simplon.stickme.entities.Sticker;

public interface StickerRepository
	extends JpaRepository<Sticker, Long> {

    Collection<AllStickersView> findAllStickersProjectedBy();

    Collection<EditAllStickers> findAllStickersForEditProjectedBy();

    Optional<StickerDetailsView> findProjectedById(Long id);
}
