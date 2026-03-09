public class equipof {
    public static void main(String[]arg){
        jugador j1=new jugador("carlos",22,1122815652,"masculino",18,"delantero",17,15,3);
        j1.mostrarestadisticas();

        System.out.println(" El jugador juega un partido ");
        j1.jugarPartido();
        j1.anotargol(2);
        j1.darasistencia(1);
        System.out.println();
        j1.mostrarestadisticas();
    }
}
