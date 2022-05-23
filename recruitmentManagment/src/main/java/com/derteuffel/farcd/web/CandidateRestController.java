package com.derteuffel.farcd.web;

import com.derteuffel.farcd.dto.CandidateDto;
import com.derteuffel.farcd.services.CandidatService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@Tag(description = "Candidate resources that provides access to availabe candidate data",
        name = "Candidate resource")
@RestController
@RequestMapping("/api/v1/candidates")
@CrossOrigin("*")
@RequiredArgsConstructor
public class CandidateRestController {


    private final CandidatService candidatService;

    @GetMapping
    public List<CandidateDto> listCandidate(){
        return candidatService.listCandidate();
    }

    @GetMapping("/get/{id}")
    public CandidateDto getCandidate(@PathVariable("id") String candidateId){
        return candidatService.getCandidate(candidateId);
    }

    @PostMapping("/create")
    public ResponseEntity<CandidateDto> saveCandidate(@RequestBody CandidateDto candidateDto){
        URI url = URI.create(
                   ServletUriComponentsBuilder
                        .fromCurrentContextPath()
                        .path("/api/v1/candidates/create")
                        .toUriString());
        return ResponseEntity.created(url).body(candidatService.saveCandidate(candidateDto));
    }

    @PutMapping("/update/{candidateID}")
    public ResponseEntity<CandidateDto> updateCandidate(@RequestBody CandidateDto candidateDto, @PathVariable String candidateID){
        candidateDto.setId(candidateID);
        URI url = URI.create(
                        ServletUriComponentsBuilder
                            .fromCurrentContextPath()
                            .path("/api/v1/candidates/update/{candidateID}")
                            .toUriString()
        );
        return ResponseEntity.created(url).body(candidatService.updateCandidate(candidateDto));
    }


    @DeleteMapping("/delete/{candidateId}")
    public void deleteCandidate(@PathVariable String candidateId){
        candidatService.deleteCandidate(candidateId);
    }
}
