package membelicemilan;

abstract class NamaCemilan {
  protected String nama;
  public NamaCemilan(String nama){
    this.nama = nama;
  }
  

  public abstract void harga();

  

  public void info(){
    System.out.println("Nama cemilan: "+ nama);
  }
}
