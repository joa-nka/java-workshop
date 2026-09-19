package com.example.javaworkshop;

import com.example.javaworkshop.model.Investigation;
import com.example.javaworkshop.repository.InvestigationRepository;
import com.example.javaworkshop.service.InvestigationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class InvestigationServiceTest {

    @Mock
    private InvestigationRepository investigationRepository;

    private InvestigationService investigationService;

    @BeforeEach
    void setUp() {
        investigationService =
                new InvestigationService(investigationRepository);
    }

    @Test
    void shouldReturnInvestigationById() {

        Investigation investigation = new Investigation(
                1L,
                101L,
                "Suspicious transaction",
                "OPEN"
        );

        when(investigationRepository.findById(1L))
                .thenReturn(investigation);

        Investigation result =
                investigationService.getInvestigationById(1L);

        assertNotNull(result);
        assertEquals(1L, result.getId());
        assertEquals("OPEN", result.getStatus());
    }

    @Test
    void shouldCreateInvestigation() {

        Investigation investigation = new Investigation(
                1L,
                101L,
                "Unusual transaction amount",
                "OPEN"
        );

        when(investigationRepository.create(
                101L,
                "Unusual transaction amount"
        )).thenReturn(investigation);

        Investigation result =
                investigationService.createInvestigation(
                        101L,
                        "Unusual transaction amount"
                );

        assertNotNull(result);
        assertEquals(101L, result.getTransactionId());
        assertEquals("OPEN", result.getStatus());
    }

    @Test
    void shouldUpdateInvestigationStatus() {

        Investigation investigation = new Investigation(
                1L,
                101L,
                "Suspicious transaction flow",
                "OPEN"
        );

        when(investigationRepository.findById(1L))
                .thenReturn(investigation);

        Investigation result =
                investigationService.updateInvestigation(
                        1L,
                        "UNDER_INVESTIGATION",
                        null
                );

        assertNotNull(result);

        // INTENTIONALLY WRONG
        assertEquals("INVESTIGATING", result.getStatus());
    }

    @Test
    void shouldDeleteInvestigation() {

        investigationService.deleteInvestigation(1L);

        verify(investigationRepository).delete(1L);
    }
}