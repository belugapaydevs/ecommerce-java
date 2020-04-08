package com.example.javarequest.bean;

public class Request {
  private CardHolder cardHolder;
  private Card card;
  private Address address;
  private SaleTransaction saleTransaction;
  private Apikey apikey;

  public CardHolder getCardHolder() {
    return cardHolder;
  }

  public void setCardHolder(CardHolder cardHolder) {
    this.cardHolder = cardHolder;
  }

  public Card getCard() {
    return card;
  }

  public void setCard(Card card) {
    this.card = card;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public SaleTransaction getSaleTransaction() {
    return saleTransaction;
  }

  public void setSaleTransaction(SaleTransaction saleTransaction) {
    this.saleTransaction = saleTransaction;
  }

  public Apikey getApikey() {
    return apikey;
  }

  public void setApikey(Apikey apikey) {
    this.apikey = apikey;
  }
}
