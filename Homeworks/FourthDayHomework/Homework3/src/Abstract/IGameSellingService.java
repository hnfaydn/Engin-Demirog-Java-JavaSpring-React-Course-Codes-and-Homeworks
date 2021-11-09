package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface IGameSellingService {

    void gameSellingInformation(Player player, Game game, Campaign campaign);
}
