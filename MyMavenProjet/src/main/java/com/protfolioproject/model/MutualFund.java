package com.protfolioproject.model;

public class MutualFund extends Asset {

    private double nav;

    // Constructor
    public MutualFund(String assetId,
                      String assetName,
                      double purchasePrice,
                      double nav) {

        super(assetId, assetName, purchasePrice);

        this.nav = nav;
    }

    // Method overriding
    public double calculateCurrentValue() {

        return nav;
    }

    // Getter
    public double getNav() {

        return nav;
    }

    // Setter
    public void setNav(double nav) {

        this.nav = nav;
    }

    public String toString() {

        return "MutualFund{" +
                "Asset ID='" + getAssetId() + '\'' +
                ", Asset Name='" + getAssetId() + '\'' +
                ", Purchase Price=" + getPurchasePrice() +
                ", NAV=" + nav +
                '}';
    }

}