package com.example.projekt_mobilpay;

public class Bruger {
    private String fnavn;
    private int phone;
    private String Email;
    private int kontoNr,kontrolCifre;
    private int expirationDate_M,expirationDate_y;
    private String username, password;

    //todo make getter and setter
    private int userBalance;
    private int amount;


    public String getfnavn() {
        return fnavn;}
    public void setfnavn(String fnavn) {
        fnavn = fnavn;}


    public int getPhone() {
        return phone;}
    public void setPhone(int phone) {
        this.phone = phone;}



    public String getEmail() {
        return Email;}
    public void setEmail(String email) {
        Email = email;}



    public int getKontoNr() {
        return kontoNr;}
    public void setKontoNr(int kontoNr) {
        this.kontoNr = kontoNr;}



    public int getKontrolCifre() {
        return kontrolCifre;}
    public void setKontrolCifre(int kontrolCifre) {
        this.kontrolCifre = kontrolCifre;}



    public int getExpirationDate_M() {
        return expirationDate_M;}
    public void setExpirationDate_M(int expirationDate_M) {
        this.expirationDate_M = expirationDate_M;}



    public int getExpirationDate_y() {
        return expirationDate_y;}
    public void setExpirationDate_y(int expirationDate_y) {
        this.expirationDate_y = expirationDate_y;}



    public String getUserName() {
        return username;}
    public void setUserName(String userName) {
        this.username = userName;}



    public String getKode() {
        return password;}
    public void setKode(String kode) {
        this.password = kode;}
}
