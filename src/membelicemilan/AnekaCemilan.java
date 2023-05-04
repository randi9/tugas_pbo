package membelicemilan;

public class AnekaCemilan {
  public static void main(String[] args) {
    Kicimpring kicimpring = new  Kicimpring ("Kicimpring kang Mus");
    Kripik kripik = new Kripik ("kripik kang Saep ");
    Sele sele = new Sele ("Sele kang Ujang");

    System.out.println("Harga Aneka Cemilan");
    kicimpring.info();
    kicimpring.harga();   

    kripik.info();
    kripik.harga();

    sele.info();
    sele.harga();
  }
}
