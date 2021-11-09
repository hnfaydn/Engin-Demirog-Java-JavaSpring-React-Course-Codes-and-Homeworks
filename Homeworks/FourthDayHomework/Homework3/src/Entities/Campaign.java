package Entities;

import java.time.LocalDate;

public class Campaign {
    private int campaignId;
    private String campaignName;
    private  String campaignStartDate;
    private String  campaignEndDate;
    private String discountAmount;

    public Campaign() {
    }

    public Campaign(int campaignId, String campaignName, String campaignStartDate, String campaignEndDate, String discountAmount) {
        super();
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.campaignStartDate = campaignStartDate;
        this.campaignEndDate = campaignEndDate;
        this.discountAmount = discountAmount;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCampaignStartDate() {
        return campaignStartDate;
    }

    public void setCampaignStartDate(String campaignStartDate) {
        this.campaignStartDate = campaignStartDate;
    }

    public String getCampaignEndDate() {
        return campaignEndDate;
    }

    public void setCampaignEndDate(String campaignEndDate) {
        this.campaignEndDate = campaignEndDate;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }
}
