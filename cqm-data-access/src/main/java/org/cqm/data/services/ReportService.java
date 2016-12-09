package org.cqm.data.services;

import org.cqm.data.repositories.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ReportService {

    @Autowired
    ReportRepository reportRepository;

    public ReportRepository getReportRepository() {
        return this.reportRepository;
    }
}
