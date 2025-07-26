package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.CrimeReport;

@Repository
public interface CrimeRepository extends JpaRepository<CrimeReport, Long> {
    List<CrimeReport> findByType(String type);
    List<CrimeReport> findByStatus(CrimeReport.Status status);
}
