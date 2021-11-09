package Abstract;

import Entities.Campaign;

public interface ICampaignService {

    void newCampaign(Campaign campaign);
    void deleteCampaign(Campaign campaign);
    void updateCampaign(Campaign campaign);


}
