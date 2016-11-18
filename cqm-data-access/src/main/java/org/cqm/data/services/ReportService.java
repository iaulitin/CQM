package org.cqm.data.services;

import org.cqm.data.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Dmitriy on 08.11.2016.
 */

@Service
public class ReportService {
    @Autowired
    ReportRepository reportRepository;

    public ReportRepository getReportRepository() {
        return this.reportRepository;
    }
}
