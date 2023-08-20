package ru.jdbcfighters.renthub.services.implementations;

import org.springframework.stereotype.Service;
import ru.jdbcfighters.renthub.domain.models.Attribute;
import ru.jdbcfighters.renthub.repositories.AttrubuteRepository;
import ru.jdbcfighters.renthub.services.AttributeService;

import java.util.List;

@Service
public class AttributeServerImpl implements AttributeService {
    private final AttrubuteRepository attrubuteRepository;

    public AttributeServerImpl(AttrubuteRepository attrubuteRepository) {
        this.attrubuteRepository = attrubuteRepository;
    }

    @Override
    public Attribute findById(Long id) {
        return attrubuteRepository.findById(id).orElseThrow(() -> new RuntimeException("Attribute not found!"));
    }

    @Override
    public List<Attribute> findAll() {
        return attrubuteRepository.findAll();
    }

    @Override
    public Attribute create(Attribute object) {
        return attrubuteRepository.save(object);
    }

    @Override
    public Attribute update(Attribute object) {
//        if (!attrubuteRepository.existsById(object.getId()))
//            throw new EntityNotFoundException("Subscription not found!");
        return attrubuteRepository.save(object);
    }

    @Override
    public void delete(Long id) {
//        if (!attrubuteRepository.existsById(id))
//            throw new EntityNotFoundException("Subscription not found!");
        attrubuteRepository.deleteAttribute(id);
    }

}
