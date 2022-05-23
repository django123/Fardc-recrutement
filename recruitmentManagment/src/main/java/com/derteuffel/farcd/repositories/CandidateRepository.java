package com.derteuffel.farcd.repositories;


import com.derteuffel.farcd.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate,String> {
}
