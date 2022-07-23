package com.labels.labelmanager;

import com.labels.labelmanager.model.Label;
import com.labels.labelmanager.service.LabelService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The RESTful Controller component that utilizes the Service component's
 * methods and maps them to specific URIs to respond to HTTP requests.
 */
@RestController
@RequestMapping("/label")
public class LabelResource {
    /**
     * The LabelService that lets this class respond to HTTP requests
     * with the Service's methods
     */
    private final LabelService labelService;

    /**
     * Constructor for the Controller that initializes the LabelService injection
     * @param labelService  the LabelService component to inject
     */
    public LabelResource(LabelService labelService) {
        this.labelService = labelService;
    }

    /**
     * Get a List of all Labels/Guests with the Service's Find All Labels method
     * @return  Response Entity with the List of Labels/Guests
     */
    @GetMapping("/all")
    public ResponseEntity<List<Label>> getAllLabels () {
        List<Label> labels = labelService.findAllLabels();
        return new ResponseEntity<>(labels, HttpStatus.OK);
    }

    /**
     * Find a Label/Guest by ID with the Service's find by ID method
     * @param id    the Label/Guest's ID
     * @return      the Label/Guest found, or UserNotFoundException message
     */
    @GetMapping("/find/{id}")
    public ResponseEntity<Label> getLabelById (@PathVariable("id") Long id) {
        Label label = labelService.findLabelById(id);
        return new ResponseEntity<>(label, HttpStatus.OK);
    }

    /**
     * Add a new Label/Guest through the Service's Add method
     * @param label the Label/Guest to be added
     * @return      the Response Entity with the added Label
     */
    @PostMapping("/add")
    public ResponseEntity<Label> addLabel(@RequestBody Label label) {
        Label newLabel = labelService.addLabel(label);
        return new ResponseEntity<>(newLabel, HttpStatus.CREATED);
    }

    /**
     * Update a Label/Guest with the Service's Update method
     * @param label the Label/Guest to update
     * @return      the udpated Label/Guest
     */
    @PutMapping("/update")
    public ResponseEntity<Label> updateLabel(@RequestBody Label label) {
        Label updateLabel = labelService.updateLabel(label);
        return new ResponseEntity<>(updateLabel, HttpStatus.OK);
    }

    /**
     * Delete a Label/Guest with the Service's
     * @param id the Label/Guest's ID
     * @return   the Response Entity HTTP Status OK
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Label> deleteLabel(@PathVariable("id") Long id) {
        labelService.deleteLabel(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
