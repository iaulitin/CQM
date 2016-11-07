package org.cqm.data.services;

import org.cqm.data.repositories.CafeteriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Dmitriy on 08.11.2016.
 */
@Service
public class CafeteriaService {
    @Autowired
    CafeteriaRepository cafeteriaRepository;

    public CafeteriaRepository getCafeteriaRepository() {
        return this.cafeteriaRepository;
    }
}
