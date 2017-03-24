package org.cqm.data.services;

import org.cqm.data.entity.Cafeteria;
import org.cqm.data.repositories.CafeteriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

@Service("cafeteriaService")
public class CafeteriaService {

    @Autowired
    CafeteriaRepository cafeteriaRepository;

    public CafeteriaRepository getCafeteriaRepository() {
        return this.cafeteriaRepository;
    }
}
