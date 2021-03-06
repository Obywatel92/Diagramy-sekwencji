package model;

/**
 * Interfejs odpowiedzialny za język napisów na kontrolkach, komunikatach itp.
 * @author Michał Wróbel
 */
public interface JezykInterfejsu {
    
    public String nazwaJezyka();
    
    public String menuPlik ();
    public String menuEdycja ();
    public String menuDiagram ();
    public String menuPomoc();
    public String menuPlikWczytaj();
    public String menuPlikZapisz();
    public String menuPlikZapiszJako();
    public String menuPlikZamknij();
    public String menuEdycjaCofnij();
    public String menuEdycjaPonow();
    public String menuEdycjaWytnij();
    public String menuEdycjaKopiuj();
    public String menuEdycjaWklej();
    public String menuEdycjaWstaw();
    public String menuEdycjaWstawAktora();
    public String menuEdycjaWstawKomunikat();
    public String menuEdycjaWstawObszarWydzielony();
    public String menuOpcje();
    public String menuOpcjeJezyk();
    public String menuOpcjeAutoodswiezanie();
    public String menuDiagramGeneruj();
    public String menuDiagramZapisz();
    public String menuPomocPomoc();
    public String menuPomocOProgramie();
    
    public String kontrolkaKodZrodlowy();
    public String kontrolkaKonsola();
    public String kontrolkaJezykInterfejsu();
    public String kontrolkaJezykSkladni();
    
    public String przyciskTak();
    public String przyciskNie();
    public String przyciskAnuluj();
    
    public String oknoNiezapisaneNaglowek();
    public String onkoNiezapisaneTresc();
    public String oknoBladWczytania();
    public String oknoBladZapisu();
    public String oknoBladKompilacji();

    public String komunikatPoprawnaKompilacja();
    
    public String bladNaglowek();
    public String bladSkladnia();
    public String bladNieistniejacaKomenda();
    public String bladDwukrotnaDefinicja();
    public String bladWymaganaLiczba();
    public String bladOdnaleziono1();
    public String bladOdnaleziono2();
    public String bladPonizej50();
    public String bladPowtorzonyIdentyfikatorObiektu();
    public String bladNieistniejacyTypObiektu();
    public String bladNieistniejacyTypKomunikatu();
    public String bladObiektNieutworzony1();
    public String bladObiektNieutworzony2();
    public String bladObiektNieutworzony3();
    public String bladObiektUsuniety();
    public String bladPowtorzonyIdentyfikatorElementuPoziomego();
    public String bladDwukrotneUsuniecieObiektu();
    public String bladObiektNiefunkcjonujacy();
    public String bladOdwroconyObszar();
    public String bladNiedodatniaWysokoscBloku();
    public String bladBrakObiektu();
    public String bladBrakKomunikatu();
    public String bladWartoscNieliczbowa();
    public String bladWartoscUjemna();
    public String bladNieoczekiwanyAtrybut();
    public String bladNiezdefiniowanyAtrybutObowiazkowy();
    public String bladBlednaLiczbaPunktow();
    public String bladLinia();

    public String pomocOProgramie();
    public String pomocOgolna();
    public String pomocOgolnaTresc();
    public String pomocSkladnia();
    public String pomocSkladniaTresc(JezykSkladni jezyk);
    public String pomocDiagram();
    public String pomocDiagramTresc(JezykSkladni jezyk);
    public String pomocObiekty();
    public String pomocObiektyTresc(JezykSkladni jezyk);
    public String pomocKomunikaty();
    public String pomocKomunikatyTresc(JezykSkladni jezyk);
    public String pomocBloki();
    public String pomocBlokiTresc(JezykSkladni jezyk);
    public String pomocPliki();
    public String pomocPlikiTresc();
    public String pomocGenerowanieDiagramu();
    public String pomocGenerowanieDiagramuTresc();

    public String etykietaNazwaPliku();
    public String etykietaTypPliku();
    public String etykietaModyfikuj();
    public String etykietaWszystkiePliki();
    public String etykietaPrzegladaj();
    public String etykietaZapiszDo();
    public String etykietaWGore();
    public String etykietaPulpit();
    public String etykietaNowyFolder();
    public String etykietaLista();
    public String etykietaSzczegoly();
    public String etykietaPlikUml();
    public String etykietaPlikPng();

}
