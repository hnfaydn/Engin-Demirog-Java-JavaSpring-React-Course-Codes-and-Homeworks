package Abstract;

import Entities.Player;

public interface IPlayerValidationService {

    boolean playerValidation(Player player) throws Exception;
}
