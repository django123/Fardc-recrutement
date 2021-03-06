package com.derteuffel.farcd.mapper;

;
import com.derteuffel.farcd.dto.CandidateDto;
import com.derteuffel.farcd.entities.Candidate;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class CandidateMapper {

    public CandidateDto fromCandidate(Candidate candidate){
        CandidateDto candidateDto = new CandidateDto();
        BeanUtils.copyProperties(candidate,candidateDto);
        candidateDto.setGender(candidate.getGender().name());
        return candidateDto;
    }

    public Candidate fromCandidateDto(CandidateDto candidateDto){
        Candidate candidate = new Candidate();
        BeanUtils.copyProperties(candidateDto,candidate);
        return candidate;
    }
}
