package com.miage.altea.trainer_api.service;

import com.miage.altea.trainer_api.bo.Trainer;
import org.springframework.stereotype.Component;

public interface TrainerService {

    Iterable<Trainer> getAllTrainers();
    Trainer getTrainer(String name);
    Trainer createTrainer(Trainer trainer);
}
