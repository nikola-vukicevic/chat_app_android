package com.example.chatapp;

import com.google.firebase.database.DatabaseReference;

public class Korisnik {
    private String ime,
                   prezime,
                   korisnickoIme,
                   imaPrivilegije,
                   email,
                   avatar,
                   stringId,
                   token;

    public Korisnik(String stringId, String ime, String prezime, String korisnickoIme, String email, String avatar) {
        this.stringId       = stringId;
        this.korisnickoIme  = korisnickoIme;
        this.ime            = ime;
        this.prezime        = prezime;
        this.imaPrivilegije = "DA";
        this.email          = email;
        this.avatar         = avatar;
        this.token          = "";
    }

    public Korisnik(String stringId, String ime, String prezime, String korisnickoIme, String email, String avatar, String imaPrivilegije) {
        this.stringId       = stringId;
        this.korisnickoIme  = korisnickoIme;
        this.ime            = ime;
        this.prezime        = prezime;
        this.imaPrivilegije = imaPrivilegije;
        this.email          = email;
        this.avatar         = avatar;
        this.token          = "";
    }

    public Korisnik(String stringId, String ime, String prezime, String korisnickoIme, String email, String avatar, String imaPrivilegije, String token) {
        this.stringId       = stringId;
        this.korisnickoIme  = korisnickoIme;
        this.ime            = ime;
        this.prezime        = prezime;
        this.imaPrivilegije = imaPrivilegije;
        this.email          = email;
        this.avatar         = avatar;
        this.token          = token;
    }

    /* ----------------------------------------------------------------------------------------- */
    // GLAVNE FUNKCIJE:
    /* ----------------------------------------------------------------------------------------- */

    public void DodavanjeUBazu(DatabaseReference DBR){
        DBR.child(stringId).child("ime").setValue(ime);
        DBR.child(stringId).child("prezime").setValue(prezime);
        DBR.child(stringId).child("avatar").setValue(avatar);
        DBR.child(stringId).child("email").setValue(email);
        DBR.child(stringId).child("korisnickoIme").setValue(korisnickoIme);
        DBR.child(stringId).child("imaPrivilegije").setValue(imaPrivilegije);
        DBR.child(stringId).child("token").setValue(token);
    }

    @Override
    public String toString() {
        return korisnickoIme + "(" + ime + " " + prezime + ")";
    }

    /* ----------------------------------------------------------------------------------------- */
    // GET & SET
    /* ----------------------------------------------------------------------------------------- */

    public String citanjeStringId() {
        return stringId;
    }

    public void azuriranjeStringId(String stringId) {
        this.stringId = stringId;
    }

    public String citanjeIme() {
        return ime;
    }

    public void azuriranjeIme(String ime) {
        this.ime = ime;
    }

    public String citanjePrezime() {
        return prezime;
    }

    public void azuriranjePrezime(String prezime) {
        this.prezime = prezime;
    }

    public String citanjeKorisnicko_ime() {
        return korisnickoIme;
    }

    public void azuriranjeKorisnicko_ime(String korisnicko_ime) {
        this.korisnickoIme = korisnicko_ime;
    }

    public String citanjePrivilegije() {
        return imaPrivilegije;
    }

    public void azuriranjePrivilegije(String imaPrivilegije) {
        this.imaPrivilegije = imaPrivilegije;
    }

    public String citanjeEmail() {
        return email;
    }

    public void azuriranjeEmail(String email) {
        this.email = email;
    }

    public String citanjeAvatar() {
        return avatar;
    }

    public void azuriranjeAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String citanjeToken() {
        return token;
    }

    public void azuriranjeToken(String token) {
        this.token = token;
    }
}
