//package com.example.finalsprintsemester4.games;
//
//
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import javax.servlet.ServletOutputStream;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Collection;
//import java.util.List;
//import java.util.Locale;
//import java.util.Optional;
//
//import static org.junit.Assert.*;
//
//abstract class HttpServletResponseHelper implements HttpServletResponse{
//    @Override
//    public void addCookie(Cookie cookie) {
//
//    }
//
//    @Override
//    public boolean containsHeader(String s) {
//        return false;
//    }
//
//    @Override
//    public String encodeURL(String s) {
//        return null;
//    }
//
//    @Override
//    public String encodeRedirectURL(String s) {
//        return null;
//    }
//
//    @Override
//    public String encodeUrl(String s) {
//        return null;
//    }
//
//    @Override
//    public String encodeRedirectUrl(String s) {
//        return null;
//    }
//
//    @Override
//    public abstract void sendError(int i, String s) throws IOException;
//
//
//    @Override
//    public void sendError(int i) throws IOException {
//
//    }
//
//    @Override
//    public void sendRedirect(String s) throws IOException {
//
//    }
//
//    @Override
//    public void setDateHeader(String s, long l) {
//
//    }
//
//    @Override
//    public void addDateHeader(String s, long l) {
//
//    }
//
//    @Override
//    public void setHeader(String s, String s1) {
//
//    }
//
//    @Override
//    public void addHeader(String s, String s1) {
//
//    }
//
//    @Override
//    public void setIntHeader(String s, int i) {
//
//    }
//
//    @Override
//    public void addIntHeader(String s, int i) {
//
//    }
//
//    @Override
//    public void setStatus(int i) {
//
//    }
//
//    @Override
//    public void setStatus(int i, String s) {
//
//    }
//
//    @Override
//    public int getStatus() {
//        return 0;
//    }
//
//    @Override
//    public String getHeader(String s) {
//        return null;
//    }
//
//    @Override
//    public Collection<String> getHeaders(String s) {
//        return null;
//    }
//
//    @Override
//    public Collection<String> getHeaderNames() {
//        return null;
//    }
//
//    @Override
//    public String getCharacterEncoding() {
//        return null;
//    }
//
//    @Override
//    public String getContentType() {
//        return null;
//    }
//
//    @Override
//    public ServletOutputStream getOutputStream() throws IOException {
//        return null;
//    }
//
//    @Override
//    public PrintWriter getWriter() throws IOException {
//        return null;
//    }
//
//    @Override
//    public void setCharacterEncoding(String s) {
//
//    }
//
//    @Override
//    public void setContentLength(int i) {
//
//    }
//
//    @Override
//    public void setContentLengthLong(long l) {
//
//    }
//
//    @Override
//    public void setContentType(String s) {
//
//    }
//
//    @Override
//    public void setBufferSize(int i) {
//
//    }
//
//    @Override
//    public int getBufferSize() {
//        return 0;
//    }
//
//    @Override
//    public void flushBuffer() throws IOException {
//
//    }
//
//    @Override
//    public void resetBuffer() {
//
//    }
//
//    @Override
//    public boolean isCommitted() {
//        return false;
//    }
//
//    @Override
//    public void reset() {
//
//    }
//
//    @Override
//    public void setLocale(Locale locale) {
//
//    }
//
//    @Override
//    public Locale getLocale() {
//        return null;
//    }
//};
//
//
//public class GamesServiceTest {
//    GamesRepository gamesRepository;
//    // GamesServiceHelpers gamesServiceHelpers;
////
////    @Test
////    public void testGet(){
////        Games listGames = new Games();
////        listGames.setTitle("JUnit");
////        listGames.setDeveloper("Maurice");
////        listGames.setRelease_date("09-12-2022");
////
////        List<Games> l1 = List.of(listGames);
////
////        Games getGameLogic = (Games) GamesServiceHelpers.getGamesLogic(l1, listGames);
////        assertEquals(getGameLogic.getTitle(), "JUnit 3");
////        assertEquals(getGameLogic.getDeveloper(), "Roy");
////        assertEquals(getGameLogic.getRelease_date(), "07-16-2022");
////    }
////
////    @Test
////    public void testGetId(){
////        Games listGamesById = new Games();
////        listGamesById.setId(1L);
////        Optional<Games> l2 = Optional.of(listGamesById);
////
////        Games getGameLogicById = GamesServiceHelpers.getGamesLogicById(l2, listGamesById);
////
////        assertEquals(Optional.ofNullable(getGameLogicById.getId()), 1L);
////
////    }
////
////    @Test
////    public void testPost(){
////        Games newGame = new Games();
////        newGame.setTitle("JUnit 4");
////        newGame.setDeveloper("Kennedy");
////        newGame.setRelease_date("04-14-2022");
////
////        Optional<Games> opt2 = Optional.of(newGame);
////
////        Games addGameLogic = GamesServiceHelpers.addGameLogic(opt2, newGame);
////
////        assertEquals(addGameLogic.getTitle(), "JUnit 4");
////        assertEquals(addGameLogic.getDeveloper(), "Kennedy");
////        assertEquals(addGameLogic.getRelease_date(), "04-14-2022");
////
////
////    }
//
////    @Test
////    public void testPut(){
////        Games originalGame = new Games();
////        Games updateGames = new Games();
////        originalGame.setId(1L);
////        originalGame.setTitle("Raft");
////        originalGame.setDeveloper("Not Me");
////        originalGame.setRelease_date("03-12-2022");
////        updateGames.setTitle("JUnit 3");
////        updateGames.setDeveloper("Roy");
////        updateGames.setRelease_date("07-16-2022");
////        Optional<Games> opt = Optional.of(originalGame);
////        HttpServletResponse httpServletResponse = new HttpServletResponseHelper() {
////            @Override
////            public void sendError(int i, String s) throws IOException {
////                assertEquals(404, i);
////                assertEquals("Game with id: " + Integer.toString(1) + " not found.", s);
////            }
////        };
////        Games updatedGameLogic = GamesServiceHelpers.updateGameLogic(opt, updateGames, httpServletResponse);
////        assertEquals(updatedGameLogic.getTitle(), "JUnit 3");
////        assertEquals(updatedGameLogic.getDeveloper(), "Roy");
////        assertEquals(updatedGameLogic.getRelease_date(), "07-16-2022");
////    }
//
////    @Test
////    public void testDelete(){
////        Games deleteGame = new Games();
////
////        Optional<Games> del = Optional.of(deleteGame);
////        Games deleteGameLogic = GamesServiceHelpers.deleteGameLogic(del);
////    }
//}
