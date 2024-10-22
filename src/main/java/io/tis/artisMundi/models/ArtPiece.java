package io.tis.artisMundi.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "OBRA")
public class ArtPiece {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String artist;
    private LocalDate creationDate;
    private String description;
    private int xDimension;
    private int yDimension;
    private String photoUrl;
    private String history;
    private boolean reproductionRights;
    private String conservationMaintenance;
    private String techniquesMaterials;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getxDimension() {
        return xDimension;
    }

    public void setxDimension(int xDimension) {
        this.xDimension = xDimension;
    }

    public int getyDimension() {
        return yDimension;
    }

    public void setyDimension(int yDimension) {
        this.yDimension = yDimension;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public boolean isReproductionRights() {
        return reproductionRights;
    }

    public void setReproductionRights(boolean reproductionRights) {
        this.reproductionRights = reproductionRights;
    }

    public String getConservationMaintenance() {
        return conservationMaintenance;
    }

    public void setConservationMaintenance(String conservationMaintenance) {
        this.conservationMaintenance = conservationMaintenance;
    }

    public String getTechniquesMaterials() {
        return techniquesMaterials;
    }

    public void setTechniquesMaterials(String techniquesMaterials) {
        this.techniquesMaterials = techniquesMaterials;
    }
}
