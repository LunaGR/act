
package actividad05;


class Dibujante extends Artista {
//el extends encapsula la class de artista encadenando los valores que necesitamos
String last_expo_lgr;
String cuadro_caro_lgr;
double price_cuadro_caro_lgr;

    Dibujante(String dni, String nombre, int fecha_nac, String sexo, String last_expo_lgr,String cuadro_caro_lgr, double price_cuadro_caro_lgr) {
        super(dni, nombre, fecha_nac, sexo);
        this.setlast_expo_lgr(last_expo_lgr);
        this.setcuadro_caro_lgr (cuadro_caro_lgr);
        this.setprice_cuadro_caro_lgr (price_cuadro_caro_lgr);
    }

    void setlast_expo_lgr(String last_expo_lgr) {
        this.last_expo_lgr = last_expo_lgr;
    }
    public String getlast_expo_lgr(){
        return this.last_expo_lgr;
    }

    void setcuadro_caro_lgr(String cuadro_caro_lgr) {
        this.cuadro_caro_lgr = cuadro_caro_lgr;
    }
    public String getcuadro_caro_lgr(){
        return this.cuadro_caro_lgr;
    }

    void setprice_cuadro_caro_lgr(double price_cuadro_caro_lgr) {
        this.price_cuadro_caro_lgr = price_cuadro_caro_lgr;
    }
    public double getprice_cuadro_caro_lgr(){
        return this.price_cuadro_caro_lgr;
    }        
    
}
