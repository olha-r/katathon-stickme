package co.simplon.stickme.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import co.simplon.stickme.dtos.LabelValue;
import co.simplon.stickme.repositories.SizeRepository;

@Service
public class SizeServiceIpml implements SizeService {

    private SizeRepository sizes;

    public SizeServiceIpml(SizeRepository sizes) {
	this.sizes = sizes;

    }

    @Override
    public Collection<LabelValue> getAll() {

	return sizes.findAllByOrderByIdAsc();
    }

}
