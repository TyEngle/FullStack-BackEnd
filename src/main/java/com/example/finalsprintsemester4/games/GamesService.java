package com.example.finalsprintsemester4.games;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class GamesService {

    private final GamesRepository gamesRepository;

    @Autowired
    public GamesService(GamesRepository gamesRepository) {
        this.gamesRepository = gamesRepository;
    }

    // GET logic
    public List<Games> getGames(){
        return gamesRepository.findAll();
    }

    // POST logic
    public void addNewGame(Games games) {
        System.out.println("Successfully added new game!!!");
        gamesRepository.save(games);
    }

    // PUT logic
    @Transactional
    public void updateGame(Long id, String title, String developer, String release_date){
        Games games = gamesRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(
                        "You nerd, that id " + id + "ain't in this table"
                ));

        if (title != null && title.length() > 0 && !Objects.equals(games.getTitle(), title)) {
            games.setTitle(title);
            gamesRepository.save(games);
        }

        if (developer != null && developer.length() > 0 && !Objects.equals(games.getDeveloper(), developer)) {
            games.setDeveloper(developer);
            gamesRepository.save(games);
        }

        if (release_date != null && release_date.length() > 0 && !Objects.equals(games.getRelease_date(), release_date)) {
            games.setRelease_date(release_date);
            gamesRepository.save(games);
        }
    }

    // DELETE logic
    public void deleteGame(Long id){
        boolean exists = gamesRepository.existsById(id);
        if (!exists){
            throw new IllegalStateException(
                    "You nerd, that id" + id + "ain't in this table"
            );
        }
        gamesRepository.deleteById(id);
    }
}
