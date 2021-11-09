package Concrete;

import Abstract.IPlayerService;
import Entities.Player;

public class PlayerManager implements IPlayerService {
    @Override
    public void playerRegistration(Player player) {
        System.out.println(player.getFirstName()+" "+player.getLastName()+" isimli kullanıcı kayıt edildi.");
    }

    @Override
    public void playerUpdate(Player player) {
        System.out.println(player.getFirstName()+" "+player.getLastName()+" isimli kullanıcı silindi.");
    }

    @Override
    public void playerDelete(Player player) {
        System.out.println(player.getFirstName()+" "+player.getLastName()+" isimli kullanıcı bilgileri güncellendi.");
    }
}
