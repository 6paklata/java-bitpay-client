package com.bitpay.sdk.model.Invoice;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MinerFees {

    private MinerFeesItem _btc = new MinerFeesItem();
    private MinerFeesItem _bch = new MinerFeesItem();
    private MinerFeesItem _eth = new MinerFeesItem();

    public MinerFees() {
    }

    @JsonIgnore
    public MinerFeesItem getBtc() {
        return _btc;
    }

    @JsonProperty("BTC")
    public void setBtc(MinerFeesItem btc) {
        this._btc = btc;
    }

    @JsonIgnore
    public MinerFeesItem getBch() {
        return _bch;
    }

    @JsonProperty("BCH")
    public void setBch(MinerFeesItem bch) {
        this._bch = bch;
    }

    @JsonIgnore
    public MinerFeesItem getEth() {
        return _eth;
    }

    @JsonProperty("ETH")
    public void setEth(MinerFeesItem eth) {
        this._eth = eth;
    }
}
