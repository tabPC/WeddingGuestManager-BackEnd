package com.labels.labelmanager.service;

import com.labels.labelmanager.exception.UserNotFoundException;
import com.labels.labelmanager.model.Label;
import com.labels.labelmanager.repo.LabelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The Service component to handle CRUD operations
 * for Label/Guests in the Wedding Guest Manager database
 */
@Service
public class LabelService {
    /**
     * The LabelRepo that lets this class access
     * the repo's methods to handle CRUD operations
     */
    private final LabelRepo labelRepo;

    /**
     * Construct the LabelService and instantiate the LabelRepo injection
     * @param labelRepo     the Label Repository injection
     */
    @Autowired
    public LabelService(LabelRepo labelRepo) {
        this.labelRepo = labelRepo;
    }

    /**
     * Add new Label/Guest to database using label repo's save method
     * @param label the Label or Guest to add
     * @return      the Label that was added
     */
    public Label addLabel(Label label) {
        return labelRepo.save(label);
    }

    /**
     * List all labels from database using label repo with the find all method
     * @return  List of Label objects
     */
    public List<Label> findAllLabels() {
        return labelRepo.findAll();
    }

    /**
     * Update a Label/Guest in the database with the label repo save method
     * @param label the Label with desired updates
     * @return      the updated Label
     */
    public Label updateLabel(Label label) {
        return labelRepo.save(label);
    }

    /**
     * Find a Label/Guest by its ID using the Label Repo's find by ID method,
     * which throws an error if the user is not found.
     * @param id    the Label/Guest's ID to be found
     * @return      the found Label/Guest
     * @throws UserNotFoundException    the exception if the user isn't found
     */
    public Label findLabelById(Long id) {
        return labelRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException( "User by id " + id + " was not found"));
    }

    /**
     * Delete a Label/Guest by ID with the Label Repo's delete by ID method
     * @param id    the Label/Guest's ID
     */
    public void deleteLabel(Long id) {
        labelRepo.deleteById(id);
    }
}
