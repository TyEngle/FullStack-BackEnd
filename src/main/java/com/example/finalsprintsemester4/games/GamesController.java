package com.example.finalsprintsemester4.games;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class GamesController {

    private final GamesService gamesService;

    @Autowired
    public GamesController(GamesService gamesService){
        this.gamesService = gamesService;
    }

    @GetMapping("/games")
    public List<Games> getGames(){
        return gamesService.getGames();
    }

    @GetMapping("/games/{id}")
    public Optional<Games> getGamesById(@PathVariable Long id){
        return gamesService.getGamesById(id);
    }

//    @GetMapping("/games/{title}")
//    public Optional<Games> getGamesByTitle(@PathVariable String title){
//        Optional<Games> games = gamesService.getGamesByTitle(title);
//        return gamesService.getGamesByTitle(title);
//    }

    @PostMapping("/games")
    public void addNewGame(@RequestBody Games games){
        gamesService.addNewGame(games);
    }

    @PutMapping("/games/{id}")
    public void updateGame(
            @PathVariable ("id") String id, @RequestBody Games games, HttpServletResponse response
) {
        gamesService.updateGame(id, games, response);
    }

    @DeleteMapping("/games/{id}")
    public void deleteGame(@PathVariable Long id){
        gamesService.deleteGame(id);
    }

}
