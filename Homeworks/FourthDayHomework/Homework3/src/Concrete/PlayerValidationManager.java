package Concrete;

import Abstract.IPlayerValidationService;
import Entities.Player;

public class PlayerValidationManager implements IPlayerValidationService {


    @Override
    public boolean playerValidation(Player player) {

        return true;
    }
}
