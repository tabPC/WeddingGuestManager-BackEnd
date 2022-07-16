package com.labels.labelmanager.service;

import com.labels.labelmanager.exception.UserNotFoundException;
import com.labels.labelmanager.model.Label;
import com.labels.labelmanager.repo.LabelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelService {
    private final LabelRepo labelRepo;

    @Autowired
    public LabelService(LabelRepo labelRepo) {
        this.labelRepo = labelRepo;
    }

    public Label addLabel(Label label) {
        return labelRepo.save(label);
    }

    public List<Label> findAllLabels() {
        return labelRepo.findAll();
    }

    public Label updateLabel(Label label) {
        return labelRepo.save(label);
    }

    public Label findLabelById(Long id) {
        return labelRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException( "User by id " + id + " was not found"));
    }

    public void deleteLabel(Long id) {
        labelRepo.deleteById(id);
    }
}
