public class Product {
  private int id;
  private Strig name;
  private float price;

  //contructors
  Product() {}
  Product( int id, String name, float price ) {
    //OBS:isso quebra a regra da responsabilidade única
    setId(id);
    setName(name);
    setPrice(price);
  }
  Product( Product p ) {
    setId(p.getId);
    setName(p.getName);
    setPrice(p.getPrice);
  }

  //setters
  public void setId( int id ) {
    this.id  id;
  }
  public void setName( String name ) {
    this.name = name;
  }
  public void setPrice( float price ) {
    this.price = price;
  }

  //getters
  public int getId() {
    return this.id;
  }
  public String getName() {
    return this.name;
  }
  public float getPrice() {
    return this.price();
  }

  //special
  public Product clone() {
    return self;
  }
}
