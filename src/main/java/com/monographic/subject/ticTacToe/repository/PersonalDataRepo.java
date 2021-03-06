package com.monographic.subject.ticTacToe.repository;

import com.monographic.subject.ticTacToe.model.entity.PersonalDataBE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalDataRepo extends JpaRepository<PersonalDataBE, Long> {

    PersonalDataBE findFirstByPlayerId(long playerId);
}
