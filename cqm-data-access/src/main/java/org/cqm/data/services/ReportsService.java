package org.cqm.data.services;

import org.cqm.data.repositories.ReportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Dmitriy on 08.11.2016.
 */

@Service
public class ReportsService {
    @Autowired
    ReportsRepository reportsRepository;

    public ReportsRepository getReportsRepository() {
        return this.reportsRepository;
    }
}
