package ba.unsa.etf.rpr;

public class Sat {
    private int sati = 0, minute = 0, sekunde = 0;
    // public
    public Sat(int sati, int minute, int sekunde) { postavi(sati, minute, sekunde); }
    public void postavi(int h, int m, int s) { sati = h; minute = m; sekunde = s; }
    public void sljedeci() {
        sekunde++;
        if(sekunde == 60) { sekunde = 0; minute++; }
        if(minute == 60) { minute = 0; sati++; }
        if(sati == 24) { sati = 0; }
    }
    public void prethodni() {
        sekunde--;
        if(sekunde == -1) { sekunde = 59; minute--; }
        if(minute == -1) { minute = 59; sati--; }
        if(sati == -1) { sati = 23; }
    }
    public void pomjeriZa(int pomak) {
        if(pomak > 0) for(int i = 0; i < pomak; i++) sljedeci();
        else for(int i = 0; i < -pomak; i++) prethodni();
    }
    public int getSati() {
        return sati;
    }
    public int getMinute() {
        return minute;
    }
    public int getSekunde() {
        return sekunde;
    }
    public void ispisi() {
        System.out.println(getSati() + ":" + getMinute() + ":" + getSekunde() + "\n");
    }
}
