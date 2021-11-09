package Adopters;

import Abstract.IPlayerValidationService;
import Entities.Player;
import MernisRefference.DBIKPSPublicSoap;

public class MernisCheck implements IPlayerValidationService {
    @Override
    public boolean playerValidation(Player player) throws Exception {
        DBIKPSPublicSoap gamer = new DBIKPSPublicSoap();
        return gamer.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),
                player.getFirstName().toUpperCase(),
                player.getLastName().toUpperCase(),
                Integer.parseInt(player.getDateOfBirth()));
    }
}
