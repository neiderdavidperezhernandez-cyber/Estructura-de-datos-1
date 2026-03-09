public class aficionado extends personas {
    private String equipofavorito;
    public aficionado(int edad, String nombre, int identificacion, String genero,String equipofavorito) {
        super(edad, nombre, identificacion, genero);
        this.equipofavorito=equipofavorito;
    }

    public String getEquipofavorito() {
        return this.equipofavorito;
    }

    public void setEquipofavorito(String equipofavorito) {
        this.equipofavorito = equipofavorito;
    }
    @Override
    public void mostrarRol(){
        System.out.println("Eres aficionado de"+this.equipofavorito );

    }
    public void animarequipo(){
        System.out.println(nombre+"Esta animando al equipo");
    }
    public void comprarboleta(){
        System.out.println(nombre+"compro una boleta");
    }
}
