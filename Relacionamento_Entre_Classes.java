package my.relacionamento_entre_classes;

public class Relacionamento_Entre_Classes {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Charles do Bronx", "Brasil", 31, 1.77F, 70.29F, 33, 8, 0);
        l[1] = new Lutador("Amanda Nunes", "Brasil", 34, 1.72F, 65.3F, 22, 5, 0);
        l[2] = new Lutador("Deiveson Figueiredo", "Brasil", 32, 1.65F, 56.8F, 21, 2, 1);
        l[3] = new Lutador("Aljamain Sterling", "Estados Unidos", 30, 1.70F, 61.8F, 21, 3, 0);
        l[4] = new Lutador("Israel Adesanya", "Nigeria", 32, 1.93F, 81.93F, 23, 1, 0);
        l[5] = new Lutador("Francis Ngannou", "Camarões", 33, 1.93F, 113.34F, 17, 3, 0);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0],  l[5]);
        UEC01.lutar();
        
    }
}