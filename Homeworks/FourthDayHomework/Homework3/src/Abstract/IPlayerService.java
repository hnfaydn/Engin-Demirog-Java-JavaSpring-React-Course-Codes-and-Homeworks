package Abstract;

import Entities.Player;

public interface IPlayerService {
    void playerRegistration(Player player);

    void playerUpdate(Player player);

    void playerDelete(Player player);
}
