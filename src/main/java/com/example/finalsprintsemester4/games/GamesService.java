package com.example.finalsprintsemester4.games;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

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

    public Optional<Games> getGamesById(Long id){
        return gamesRepository.findById(id);
    }

    // POST logic
    public void addNewGame(Games games) {
        System.out.println("Successfully added new game!!!");
        gamesRepository.save(games);

    }

    // PUT logic
    @Transactional
    public void updateGame(@PathVariable String id, @RequestBody Games games, HttpServletResponse response) {
        Optional<Games> returnValue = gamesRepository.findById(Long.parseLong(id));
        Games gamesToUpdate;

        if (returnValue.isPresent()) {
            gamesToUpdate = returnValue.get();

            gamesToUpdate.setTitle(games.getTitle());
            gamesToUpdate.setDeveloper(games.getDeveloper());
            gamesToUpdate.setRelease_date(games.getRelease_date());

            gamesRepository.save(gamesToUpdate);
        } else {
            try {
                response.sendError(404, "City with id: " + games.getId() + " not found.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
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
