package com.example.demo.model;

public class Case {

    private String id;
    private String partyOne;
    private String partyTwo;

    public Case(String id, String partyOne, String partyTwo) {
        this.id = id;
        this.partyOne = partyOne;
        this.partyTwo = partyTwo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPartyOne() {
        return partyOne;
    }

    public void setPartyOne(String partyOne) {
        this.partyOne = partyOne;
    }

    public String getPartyTwo() {
        return partyTwo;
    }

    public void setPartyTwo(String partyTwo) {
        this.partyTwo = partyTwo;
    }
}
