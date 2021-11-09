package Entities;

public class Game {
    private int gameId;
    private String gameName;
    private String gameProviderCompany;
    private double gamePrice;

    public Game() {
    }

    public Game(int gameId, String gameName, String gameProviderCompany, double gamePrice) {
        super();
        this.gameId = gameId;
        this.gameName = gameName;
        this.gameProviderCompany = gameProviderCompany;
        this.gamePrice = gamePrice;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameProviderCompany() {
        return gameProviderCompany;
    }

    public void setGameProviderCompany(String gameProviderCompany) {
        this.gameProviderCompany = gameProviderCompany;
    }

    public double getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }
}
