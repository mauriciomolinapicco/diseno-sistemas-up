public class Cliente {
    public static void main(String[] args) throws Exception {
        EnchufeAmericano enchufeAmericano = new EnchufeAmericano();
        EnchufeArgentino enchufeArgentino = new EnchufeArgentino();
        AdaptadorEnchufeAmericanoArgentino adaptador = new AdaptadorEnchufeAmericanoArgentino(enchufeAmericano);
        
        System.out.println(adaptador.enchufar(enchufeArgentino));
    }
}
