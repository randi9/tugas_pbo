package membelicemilan;

class Kripik extends NamaCemilan {
  public Kripik(String nama){
    super(nama);
  }
  @Override
  public void harga() {
    System.out.println("Rp. 10.000");
  }
}

