public class jugador extends personas    {
    private int numero;
    private String posicion;
    private int partidosjugados;
    private int goles;
    private int asistencias ;
    public jugador(String nombre,int edad , int identificacion, String genero,int numero,String posicion,int partidosjugados,int goles,int asistencias){
        super( edad, nombre, identificacion,genero);
        this.numero=numero;
        this.posicion=posicion;
        this.partidosjugados=partidosjugados;
        this.goles=goles;
        this.asistencias=asistencias;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPosicion() {
        return this.posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getPartidosjugados() {
        return this.partidosjugados;
    }

    public int getGoles() {
        return this.goles;
    }

    public int getAsistencias() {
        return this.asistencias;
    }

    @Override
    public void mostrarRol(){
        System.out.println("Eres jugador en la posicion"+this.posicion + "tienes el numero" + this.numero);

    }
    public void entrenar(){
        System.out.println(this.nombre+"Esta entrenando");
    }
    public void jugarPartido(){
        partidosjugados++;
        System.out.println(this.nombre+" jugo un partido");
    }
    public void anotargol(int cantidad){
        if(cantidad>0){
            goles+=cantidad;
            System.out.println(nombre+" anoto "+cantidad+" gol(es) ");
        }
    }
    public void darasistencia(int cantidad){
        if(cantidad>0){
            asistencias+=cantidad;
            System.out.println(nombre+" dio "+" asitencia(s) ");
        }
    }
    public void mostrarestadisticas(){
        System.out.println(" estadisticas del jugador");
        System.out.println("partidos jugados: "+this.partidosjugados);
        System.out.println("goles anotados: "+this.goles);
        System.out.println("asistencias: "+this.asistencias);
    }
}


