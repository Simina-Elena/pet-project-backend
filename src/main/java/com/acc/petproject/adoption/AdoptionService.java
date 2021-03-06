package com.acc.petproject.adoption;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AdoptionService {

    List<Adoption> getAllAdoptionsByShelterId(Long shelterId);
    List<Adoption> getAllAdoptionsByVisitorId(Long visitorId);
    Adoption adopt(AdoptionDto adoptionDto);
    Adoption acceptAdoption(Long adoptionId);
    Adoption declineAdoption(Long adoptionId);

}
