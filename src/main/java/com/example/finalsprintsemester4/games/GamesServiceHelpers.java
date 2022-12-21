//package com.example.finalsprintsemester4.games;
//
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//import java.util.Optional;
//
//public class GamesServiceHelpers {
//
//
////    public static List<Games> getGamesLogic(List<Games> repositoryGame, Games games){
////        List<Games> returnGame = repositoryGame;
////        Games gamesToFind = null;
////
////        gamesToFind.getTitle();
////        gamesToFind.getDeveloper();
////        gamesToFind.getRelease_date();
////        return returnGame;
////    }
////
////    public static Optional<Games> getGamesLogicById(Optional<Games> repositoryGame, Games games){
////        Optional<Games> returnGameById = repositoryGame;
////        Games gamesToFindById = null;
////
////        gamesToFindById.getId();
////        return returnGameById;
////    }
////
////    public static Games addGameLogic(Optional<Games> repositoryGame, Games games) {
////        Optional<Games> returnAddedValue = repositoryGame;
////        Games gamesToAdd = null;
////
////        gamesToAdd = returnAddedValue.get();
////
////        gamesToAdd.setTitle(games.getTitle());
////        gamesToAdd.setDeveloper(games.getDeveloper());
////        gamesToAdd.setRelease_date(games.getRelease_date());
////
////        return gamesToAdd;
////    }
//
////    public static Games updateGameLogic(Optional<Games> repositoryGame, Games games, HttpServletResponse response) {
////        Optional<Games> returnValue = repositoryGame;
////        Games gamesToUpdate = null;
////
////        if (returnValue.isPresent()) {
////            gamesToUpdate = returnValue.get();
////
////            gamesToUpdate.setTitle(games.getTitle());
////            gamesToUpdate.setDeveloper(games.getDeveloper());
////            gamesToUpdate.setRelease_date(games.getRelease_date());
////
////        } else {
////            try {
////                response.sendError(404, "Game with id: " + games.getId() + " not found.");
////            } catch (IOException e) {
////                throw new RuntimeException(e);
////            }
////        }
////        return gamesToUpdate;
////    }
//
////        public static Games deleteGameLogic(Long id, repositoryGame, Games games){
////            Optional<Games> deletedValue = repositoryGame;
////            Games gamesToDelete = null;
////            boolean exists = repositoryGame.existsById(id);
////            if (!exists){
////                throw new IllegalStateException(
////                        "You nerd, that id" + id + "ain't in this table"
////                );
////            }
////            return deletedValue;
////    }
//}