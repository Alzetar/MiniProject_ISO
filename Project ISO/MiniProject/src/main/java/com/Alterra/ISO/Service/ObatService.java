package com.Alterra.ISO.Service;

import com.Alterra.ISO.Model.Obat;

import java.util.List;

public interface ObatService {
    Obat create(Obat obat);
    List<Obat> findAll();
    Obat findById(Integer id);
    Obat update(Integer id, Obat obat);
    void delete(Integer id);
}
