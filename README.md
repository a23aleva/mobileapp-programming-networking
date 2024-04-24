
# Rapport
Jag började med att lägga till en recyclerview widget till min main layout för att sedan skapa en ny layout med en linearlayout innhållandes två textviews som vertikalt ska kunna visa bergsnamn och deras platser. Sedan skapade jag en ny javaklass för Mountain med fält, constructors och metoder som t.ex. getters och setters. När jag var klar med det testade jag att manuellt lägga in tre berg i en arraylist i onCreate. Här skapade jag även en ny instans av en RecyclerViewAdapter som jag sedan även gjorde en egen klass för. I den här klassen använde jag sedan metoderna som medföljde tillsammans med Mountains getters. Jag kopplade även ViewHoldern i RecyclerViewAdaptern till textviewsen i min egna layout. När jag lyckats få adaptern att läsa min arraylist och visa bergen på skärmen testade jag att istället med hjälp av gson omvandla jsonfilen till en lista och ritade ut den på skärmen istället. Slutligen tillät jag internetåtkomst i manifestfilen och kopplade URLn för kända berg och implementerade en updateData-metod i adaptern vilken sedan kallades i onPostExecute för att visa topparna från URLn.

```
function errorCallback(error) {
    switch(error.code) {
        case error.PERMISSION_DENIED:
            // Geolocation API stöds inte, gör något
            break;
        case error.POSITION_UNAVAILABLE:
            // Misslyckat positionsanrop, gör något
            break;
        case error.UNKNOWN_ERROR:
            // Okänt fel, gör något
            break;
    }
}
```

Bilder läggs i samma mapp som markdown-filen.

![](Picture1.png)
