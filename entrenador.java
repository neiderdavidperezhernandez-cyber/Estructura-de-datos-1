public class entrenador extends personas {
    private String cargo;
    public entrenador(int edad, String nombre, int identificacion, String genero,String cargo){
        super(edad,nombre,identificacion,genero);
        this.cargo=cargo;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public void mostrarRol(){
        System.out.println("Eres el entrenador ");
    }
    public void dirigirentrenamiento(){
        System.out.println(this.nombre+ "Esta dirigiendo el entrenamiento");
    }
    public void plantearestrategia(){
        System.out.println(this.nombre+ "Esta plantenado la estrategia del partido");
    }
}
