import Concrete.CampaingManager;
import Concrete.GameManager;
import Concrete.PlayerValidationManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(1,"Mehmet Hanifi","Aydın","1995","11111111111");

        PlayerValidationManager playerValidationManager = new PlayerValidationManager();
        playerValidationManager.playerValidation(player);

        Game game = new Game(1,"Warface","Crytek",39.90);
        GameManager gameManager = new GameManager();
        gameManager.gameAdd(game);
        gameManager.gameDelete(game);
        gameManager.gameUpdate(game);

        Campaign campaign = new Campaign(1,"Hallowen","10.10.2020","10.20.21",10);
        CampaingManager campaingManager = new CampaingManager();
        campaingManager.newCampaign(campaign);
        campaingManager.deleteCampaign(campaign);
        campaingManager.updateCampaign(campaign);
    }
}
