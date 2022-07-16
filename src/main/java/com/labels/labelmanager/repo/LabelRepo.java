package com.labels.labelmanager.repo;

import com.labels.labelmanager.model.Label;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LabelRepo extends JpaRepository<Label, Long> {
    void deleteById(Long id);
    Optional<Label> findById(Long id);

}
