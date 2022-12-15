package com.example.finalsprintsemester4.games;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GamesRepository extends JpaRepository<Games, Long> {

    Optional<Games> findByTitle(String title);
}
