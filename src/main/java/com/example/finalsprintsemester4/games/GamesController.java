package com.example.finalsprintsemester4.games;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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

    @PostMapping("/games")
    public void addNewGame(@RequestBody Games games){
        gamesService.addNewGame(games);
    }

    @PutMapping("/games/{id}")
    public void updateGame(
            @PathVariable ("id") Long id,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String developer,
            @RequestParam(required = false) String release_date) {
        gamesService.updateGame(id, title, developer, release_date);
    }

    @DeleteMapping("/games/{id}")
    public void deleteGame(@PathVariable Long id){
        gamesService.deleteGame(id);
    }

}
