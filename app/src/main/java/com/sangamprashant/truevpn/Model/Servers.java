package com.sangamprashant.truevpn.Model;

public class Servers {
    private String serverCountry;
    private String flagUrl;
    private String ovpn;
    private String ovpnUserName;
    private String ovpnPassword;

    // Empty constructor
    public Servers() {
    }

    public Servers(String serverCountry, String flagUrl, String ovpn, String ovpnUserName, String ovpnPassword) {
        this.serverCountry = serverCountry;
        this.flagUrl = flagUrl;
        this.ovpn = ovpn;
        this.ovpnUserName = ovpnUserName;
        this.ovpnPassword = ovpnPassword;
    }

    public String getServerCountry() {
        return serverCountry;
    }

    public void setServerCountry(String serverCountry) {
        this.serverCountry = serverCountry;
    }

    public String getFlagUrl() {
        return flagUrl;
    }

    public void setFlagUrl(String flagUrl) {
        this.flagUrl = flagUrl;
    }

    public String getOvpn() {
        return ovpn;
    }

    public void setOvpn(String ovpn) {
        this.ovpn = ovpn;
    }

    public String getOvpnUserName() {
        return ovpnUserName;
    }

    public void setOvpnUserName(String ovpnUserName) {
        this.ovpnUserName = ovpnUserName;
    }

    public String getOvpnPassword() {
        return ovpnPassword;
    }

    public void setOvpnPassword(String ovpnPassword) {
        this.ovpnPassword = ovpnPassword;
    }
}
