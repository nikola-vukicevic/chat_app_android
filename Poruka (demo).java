package com.example.chatapp;

import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Poruka {
    private long   id;
    private String korisnickoIme,
                   avatar,
                   tekstProuke;

    public Poruka(long id, String korisnickoIme, String avatar, String tekstProuke) {
        this.id            = id;
        this.korisnickoIme = korisnickoIme;
        this.avatar        = avatar;
        this.tekstProuke   = tekstProuke;
    }

    /* ----------------------------------------------------------------------------------------- */
    // GLAVNE FUNKCIJE:
    /* ----------------------------------------------------------------------------------------- */

    @Override
    public String toString() {
        return korisnickoIme + ": \"" + tekstProuke + "\" (" + citanjeVreme() + ")";
    }

    public void DodavanjeUBazu(DatabaseReference DBR, String tabela){
        DBR.child(tabela).child(String.format("%d", id)).child("korisnickoIme").setValue(korisnickoIme);
        DBR.child(tabela).child(String.format("%d", id)).child("avatar").setValue(avatar);
        DBR.child(tabela).child(String.format("%d", id)).child("tekstPoruke").setValue(tekstProuke);
    }

    private static String milisekundeUDatumFormat(long milisekunde, String datumFormat)
    {
        SimpleDateFormat formatiranje = new SimpleDateFormat(datumFormat);

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milisekunde);
        return formatiranje.format(calendar.getTime());
    }

    /* ----------------------------------------------------------------------------------------- */
    // GET & SET:
    /* ----------------------------------------------------------------------------------------- */


    public long citanjeId() {
        return id;
    }

    public void azuriranjeId(long id) {
        this.id = id;
    }

    public String citanjeVreme() {
        return milisekundeUDatumFormat(id,"dd.MM.yyyy.\n     HH:mm:ss");
    }

    public String citanjeKorisnickoIme() {
        return korisnickoIme;
    }

    public void azuriranjeKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String citanjeAvatar() {
        return avatar;
    }

    public void azuriranjeAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String citanjeTekstProuke() {
        return tekstProuke;
    }

    public void azuriranjeTekstProuke(String tekstProuke) {
        this.tekstProuke = tekstProuke;
    }
}
