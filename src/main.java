public class main {
    public static void main(String[] args) {
        tahu cabang1 = new tahu();
        tahu cabang2 = new tahu();
        tahu cabang3 = new tahu();

        cabang1.namakota = "bandung";
        cabang1.uangkita = 5000;
        cabang1.hargatahu = 500;

        cabang2.namakota = "jakarta";
        cabang2.uangkita = 8000;
        cabang2.hargatahu = 800;

        cabang3.namakota = "surabaya";
        cabang3.uangkita = 7000;
        cabang3.hargatahu = 700;

        cabang1.klik();
        System.out.println(cabang1.uangkita);
        System.out.println(cabang2);
        System.out.println(cabang2.uangkita);
        System.out.println(cabang3);
        System.out.println(cabang3.uangkita);

    }
}
