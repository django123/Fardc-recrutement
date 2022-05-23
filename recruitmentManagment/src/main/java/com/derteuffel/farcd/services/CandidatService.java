package com.derteuffel.farcd.services;


import com.derteuffel.farcd.dto.CandidateDto;
import com.derteuffel.farcd.exceptions.ResourceNotFoundException;

import java.util.List;

public interface CandidatService {

    public List<CandidateDto> listCandidate();
    CandidateDto saveCandidate(CandidateDto candidateDto);
    CandidateDto updateCandidate(CandidateDto candidateDto);
    CandidateDto getCandidate(String candidateId) throws ResourceNotFoundException;
    void deleteCandidate(String candidateId) throws ResourceNotFoundException;
}
