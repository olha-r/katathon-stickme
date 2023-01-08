package co.simplon.stickme.services;

import java.util.Collection;

import org.springframework.stereotype.Service;

import co.simplon.stickme.dtos.LabelValue;
import co.simplon.stickme.repositories.AspectRepository;

@Service
public class AspectServiceImpl implements AspectService {

    private AspectRepository aspects;

    public AspectServiceImpl(AspectRepository aspects) {
	this.aspects = aspects;

    }

    @Override
    public Collection<LabelValue> getAll() {

	return aspects.findAllByOrderByIdAsc();
    }

}
