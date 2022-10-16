
package actividad05;


class Musico extends Artista {

    
    String siteweb_lgr;
    String title_last_sing_lgr;       
    String TopSong_lgr[] = new String[10];
    
    public String[] mostrarCanciones(){    
        TopSong_lgr[0]= "Top 1: El monte de las animas";
        TopSong_lgr[1]= "Top 2: Tom bombardi";
        TopSong_lgr[2]= "Top 3: Salta";
        TopSong_lgr[3]= "Top 4: Las minas de moira";
        TopSong_lgr[4]= "Top 5: Irai Dei";
        TopSong_lgr[5]= "Top 6: Aquel paseo sin retorno";
        TopSong_lgr[6]= "Top 7: Pony pisador";
        TopSong_lgr[7]= "Top 8: Se acerca el invierno";
        TopSong_lgr[8]= "Top 9: El lazarillo de tormes";
        TopSong_lgr[9]= "Top 10: Noche de Halloween";
    
        System.out.println("\tTop 10 canciones de Saurom:\n");
        for (String i_lgr : TopSong_lgr){           
            System.out.println(i_lgr);
        }
        return TopSong_lgr; 
    } 
    

    
    
    Musico(String dni, String nombre, int fecha_nac, String sexo, String siteweb_lgr, String title_last_sing_lgr, String TopSong_lgr) {
        super(dni, nombre, fecha_nac, sexo);
        
        this.setsiteweb_lgr(siteweb_lgr);
        this.settitle_last_sing_lgr(title_last_sing_lgr);
        this.setTopSong_lgr(TopSong_lgr);        
    }

    Musico() {}

    void setsiteweb_lgr(String siteweb_lgr) {
        this.siteweb_lgr =siteweb_lgr ;
    }
    public String getsiteweb_lgr(){
        return this.siteweb_lgr;
    }

    void settitle_last_sing_lgr(String title_last_sing_lgr) {
       this.title_last_sing_lgr = title_last_sing_lgr;
    }
    public String gettitle_last_sing_lgr (){
        return this.title_last_sing_lgr;
    }


    public String[] gettop_10_song_lgr(){
        return this.TopSong_lgr;
    }

    public void setTopSong_lgr(String TopSong_lgr) {
        
    }

}



