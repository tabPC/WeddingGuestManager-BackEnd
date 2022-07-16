package com.labels.labelmanager;

import com.labels.labelmanager.model.Label;
import com.labels.labelmanager.service.LabelService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/label")
public class LabelResource {
    private final LabelService labelService;

    public LabelResource(LabelService labelService) {
        this.labelService = labelService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Label>> getAllLabels () {
        List<Label> labels = labelService.findAllLabels();
        return new ResponseEntity<>(labels, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Label> getLabelById (@PathVariable("id") Long id) {
        Label label = labelService.findLabelById(id);
        return new ResponseEntity<>(label, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Label> addLabel(@RequestBody Label label) {
        Label newLabel = labelService.addLabel(label);
        return new ResponseEntity<>(newLabel, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Label> updateLabel(@RequestBody Label label) {
        Label updateLabel = labelService.updateLabel(label);
        return new ResponseEntity<>(updateLabel, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Label> deleteLabel(@PathVariable("id") Long id) {
        labelService.deleteLabel(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
