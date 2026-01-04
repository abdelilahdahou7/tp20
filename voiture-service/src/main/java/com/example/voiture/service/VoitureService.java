package com.example.voiture.service;

import com.example.voiture.entity.Voiture;
import com.example.voiture.repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VoitureService {
    @Autowired
    private VoitureRepository voitureRepository;

    public List<Voiture> getAllVoitures() {
        return voitureRepository.findAll();
    }

    public Voiture createVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }
}
