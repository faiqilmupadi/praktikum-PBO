public class main {
  public static void main(String[] args) {
    ulat u = new ulat();
    Data<ulat> anu = new Data<>();
    anu.setIsi(u);
    anu.getIsi().gerak();
    anu.setIsi(new kepompong());
    anu.getIsi().gerak();

  }
}
