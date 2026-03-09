public class personas {
    protected int edad;
    protected String nombre;
    protected int identificacion;
    protected String genero;
    public personas(int edad, String nombre, int identificacion, String genero){
        this.edad=edad;
        this.nombre=nombre;
        this.identificacion=identificacion;
        this.genero=genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return this.identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void mostrarRol(){
        System.out.println("Este es tu rol, haces parte del equipo de futbol ");
    }
}

