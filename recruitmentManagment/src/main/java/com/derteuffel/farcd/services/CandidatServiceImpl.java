package com.derteuffel.farcd.services;

import com.derteuffel.farcd.dto.CandidateDto;
import com.derteuffel.farcd.entities.Candidate;
import com.derteuffel.farcd.exceptions.ResourceNotFoundException;
import com.derteuffel.farcd.mapper.CandidateMapper;
import com.derteuffel.farcd.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class CandidatServiceImpl implements CandidatService{

    private final CandidateRepository candidateRepository;
    private final CandidateMapper mapper;

    @Override
    public List<CandidateDto> listCandidate() {
        List<Candidate> candidates = candidateRepository.findAll();
        return candidates.stream()
                         .map(mapper::fromCandidate)
                         .collect(Collectors.toList());
    }

    @Override
    public CandidateDto saveCandidate(CandidateDto candidateDto) {

        Candidate candidate = mapper.fromCandidateDto(candidateDto);
        Candidate saveCandidate = candidateRepository.save(candidate);
        return mapper.fromCandidate(saveCandidate);
    }

    @Override
    public CandidateDto updateCandidate(CandidateDto candidateDto) {
        Candidate candidate = mapper.fromCandidateDto(candidateDto);
        Candidate updateCandidate = candidateRepository.save(candidate);
        return mapper.fromCandidate(updateCandidate);
    }

    @Override
    public CandidateDto getCandidate(String candidateId) throws ResourceNotFoundException {
        Candidate candidate = candidateRepository.findById(candidateId).orElseThrow(()->new ResourceNotFoundException("Candidate", "id", candidateId));
        return mapper.fromCandidate(candidate);
    }

    @Override
    public void deleteCandidate(String candidateId) throws ResourceNotFoundException {
       Candidate candidate = candidateRepository.findById(candidateId).orElseThrow(()->new ResourceNotFoundException("Candidate", "id", candidateId));
       candidateRepository.delete(candidate);
    }
}
