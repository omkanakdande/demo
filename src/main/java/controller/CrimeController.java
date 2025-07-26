package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.CrimeReport;
import service.CrimeService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/crimes")
public class CrimeController {

    @Autowired private CrimeService crimeService;
    @GetMapping("/test")
    public ResponseEntity<String> testBackend() {
        return ResponseEntity.ok("Backend is working!");
    }

    @PostMapping("/report")
    public ResponseEntity<CrimeReport> reportCrime(@RequestBody CrimeReport report) {
        return ResponseEntity.ok(crimeService.reportCrime(report));
    }

    @GetMapping("/all")
    public ResponseEntity<List<CrimeReport>> getAll() {
        return ResponseEntity.ok(crimeService.getAllReports());
    }

    @PutMapping("/status/{id}")
    public ResponseEntity<CrimeReport> updateStatus(@PathVariable Long id, @RequestParam String status) {
        return ResponseEntity.ok(crimeService.updateStatus(id, CrimeReport.Status.valueOf(status)));
    }
}