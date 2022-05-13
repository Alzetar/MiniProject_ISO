package com.Alterra.ISO.Service.Impl;

import com.Alterra.ISO.Model.ObatGenerik;
import com.Alterra.ISO.Repository.ObatGenerikRepository;
import com.Alterra.ISO.Service.ObatGenerikService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ObatGenerikServiceImpl implements ObatGenerikService {
    @Autowired
    private ObatGenerikRepository generikRepository;

    @Override
    public ObatGenerik createGenerik(ObatGenerik generik) {
        return generikRepository.save(generik);
    }

    @Override
    public List<ObatGenerik> findAllObatGenerik() {
        return (List<ObatGenerik>) generikRepository.findAll();
    }

    @Override
    public ObatGenerik findByIdGenerik(Integer id) {
        return generikRepository.findById(id).orElse(null);
    }

    @Override
    public ObatGenerik updateObatGenerik(Integer id, ObatGenerik generik) {
        Optional<ObatGenerik> optionalObatGenerik = generikRepository.findById(id);
        if (optionalObatGenerik.isEmpty()){
            log.warn("Cannot update obat generik with {} because not found", id);
            return null;
        }
        ObatGenerik generikById = optionalObatGenerik.get();
        generikById.setNamaObatGenerik(generik.getNamaObatGenerik());
        return generikRepository.save(generikById);    }

    @Override
    public void deleteObatGenerik(Integer id) {
        generikRepository.deleteById(id);
    }
}
