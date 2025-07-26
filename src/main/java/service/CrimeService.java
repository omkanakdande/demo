package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.CrimeReport;
import repository.CrimeRepository;

@Service
public class CrimeService {
    @Autowired private CrimeRepository crimeRepo;

    public CrimeReport reportCrime(CrimeReport report) {
        return crimeRepo.save(report);
    }

    public List<CrimeReport> getAllReports() {
        return crimeRepo.findAll();
    }

    public CrimeReport updateStatus(Long id, CrimeReport.Status status) {
        CrimeReport report = crimeRepo.findById(id).orElseThrow();
        report.setStatus(status);
        return crimeRepo.save(report);
    }
}