package com.derteuffel.farcd.services;


import com.derteuffel.farcd.dto.CandidateDto;

import java.util.List;

public interface CandidatService {

    public List<CandidateDto> listCandidate();
    CandidateDto saveCandidate(CandidateDto candidateDto);
    CandidateDto updateCandidate(CandidateDto candidateDto);
    CandidateDto getCandidate(String candidateId);
    void deleteCandidate(String candidateId);
}
