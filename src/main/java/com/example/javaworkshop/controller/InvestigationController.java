package com.example.javaworkshop.controller;

import com.example.javaworkshop.model.Investigation;
import com.example.javaworkshop.service.InvestigationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/investigations")
public class InvestigationController {

    private final InvestigationService investigationService;

    public InvestigationController(InvestigationService investigationService) {
        this.investigationService = investigationService;
    }

    @GetMapping
    public List<Investigation> getAllInvestigations() {
        return investigationService.getAllInvestigations();
    }

    @GetMapping("/{id}")
    public Investigation getInvestigationById(@PathVariable Long id) {
        return investigationService.getInvestigationById(id);
    }

    @PostMapping
    public Investigation createInvestigation(
            @RequestParam Long transactionId,
            @RequestParam String reason) {

        return investigationService.createInvestigation(
                transactionId,
                reason
        );
    }

    @PutMapping("/{id}")
    public Investigation updateInvestigation(
            @PathVariable Long id,
            @RequestParam(required = false) String status,
            @RequestParam(required = false) String reason) {

        return investigationService.updateInvestigation(
                id,
                status,
                reason
        );
    }

    @DeleteMapping("/{id}")
    public void deleteInvestigation(@PathVariable Long id) {
        investigationService.deleteInvestigation(id);
    }
}