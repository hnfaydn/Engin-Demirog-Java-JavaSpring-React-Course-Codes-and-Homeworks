package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaingManager implements ICampaignService {
    @Override
    public void newCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignStartDate()+"-"+campaign.getCampaignEndDate()+" tarihleri arasında "+campaign.getCampaignName()+
                " isimli "+campaign.getDiscountAmount() +" kampanyası başlayacaktır");
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignStartDate()+"-"+campaign.getCampaignEndDate()+" tarihleri arasında "+campaign.getCampaignName()+
                " isimli "+campaign.getDiscountAmount() +" kampanyası bitecektir");
    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignStartDate()+"-"+campaign.getCampaignEndDate()+" tarihleri arasında "+campaign.getCampaignName()+
                " isimli "+campaign.getDiscountAmount() +" kampanyası ile değişecektir");
    }
}
