public class Bruger
{

    String navn;
    String kode;

    public Bruger(String navn, String kode)
    {
        this.navn = navn;
        this.kode = kode;
    }

    public String getNavn()
    {
        return navn;
    }

    public String getKode()
    {
        return kode;
    }
}
