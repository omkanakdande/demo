package model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "crime_reports")
public class CrimeReport {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String type; // e.g., Theft, Assault
    private String description;

    private double locationLat;
    private double locationLng;

    private LocalDateTime dateReported = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    private Status status = Status.NEW;

    public enum Status {
        NEW, IN_REVIEW, RESOLVED
    }

    @ManyToOne
    private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getLocationLat() {
		return locationLat;
	}

	public void setLocationLat(double locationLat) {
		this.locationLat = locationLat;
	}

	public double getLocationLng() {
		return locationLng;
	}

	public void setLocationLng(double locationLng) {
		this.locationLng = locationLng;
	}

	public LocalDateTime getDateReported() {
		return dateReported;
	}

	public void setDateReported(LocalDateTime dateReported) {
		this.dateReported = dateReported;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "CrimeReport [id=" + id + ", title=" + title + ", type=" + type + ", description=" + description
				+ ", locationLat=" + locationLat + ", locationLng=" + locationLng + ", dateReported=" + dateReported
				+ ", status=" + status + ", user=" + user + "]";
	}

	public CrimeReport(Long id, String title, String type, String description, double locationLat, double locationLng,
			LocalDateTime dateReported, Status status, User user) {
		super();
		this.id = id;
		this.title = title;
		this.type = type;
		this.description = description;
		this.locationLat = locationLat;
		this.locationLng = locationLng;
		this.dateReported = dateReported;
		this.status = status;
		this.user = user;
	}

	public CrimeReport() {
		super();
		// TODO Auto-generated constructor stub
	}

    // Getters and Setters
    
}
