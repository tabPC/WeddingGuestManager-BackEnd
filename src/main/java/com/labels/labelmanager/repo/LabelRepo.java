package com.labels.labelmanager.repo;

import com.labels.labelmanager.model.Label;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Label Repository interface that extends JPA Repostiory class
 * to access its pre-made methods.
 */
public interface LabelRepo extends JpaRepository<Label, Long> {
    /**
     * Delete Label/Guest by ID
     * @param id Guest's ID; must not be {@literal null}.
     */
    void deleteById(Long id);

    /**
     * Find Label/Guest by ID
     * @param id Guest's ID; must not be {@literal null}.
     * @return  the Label/Guest, an Optional value
     */
    Optional<Label> findById(Long id);

}
