package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService {

    @Override
    public void gameAdd(Game game) {
        System.out.println(game.getGameName()+" isimli oyun "+game.getGamePrice()+" fiyatı ile satışa sunulacaktır");
    }

    @Override
    public void gameDelete(Game game) {
        System.out.println(game.getGameName()+" isimli oyun satışı sona ermiştir");
    }

    @Override
    public void gameUpdate(Game game) {
        System.out.println(game.getGameName()+" isimli oyun fiyatı güncellenmiştir");
    }
}
