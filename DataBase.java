package Projekt.Data;

import Projekt.Logic.Player;

import java.util.ArrayList;
import java.util.List;

public class DataBase{

    private static DataBase db = null;

    private List<Player> players = null;

    public static DataBase getInstance(){
        if(db == null){
            db = new DataBase();
        }
        return db;
    }

    private DataBase() {
        super();
        players = new ArrayList<>();
    }

    public boolean createPlayer(Player obj){

        for(Player p : players){
            if(p.getName().equals(obj.getName())){
                return false;
            }
        }
        players.add(obj);
        return true;
    }

    public Player readPlayer(Player obj){
        for(Player p : players){
            if(p.getName().equals(obj.getName())){
                return p;
            }
        }
        return null;
    }

    public Player[] readPlayer(){
        return players.toArray(new Player[1]);
    }

    public boolean updatePlayer(Player obj){
        for(Player p : players){
            if(p.getName().equals((obj.getName()))){
                p.setScore(obj.getScore());
                return true;
            }
        }
        return false;
    }

}