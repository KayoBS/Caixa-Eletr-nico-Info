//TODO: trocar toda a formatação "var_espec" por "varSpec"
public class Sale {
  public Vector<Product> products;

  private int amount;
  private float amountRaised;
  private CalendarDay day; //TODO: mudar "day" para "calendar", faz mais sentido

  //setters
  public void set_amount( int amount ) {
    this.amount = amount;
    if( amount < 0 ) {
      amount *= -1;
    }
  }

  public void set_amount_raised() {
    //TODO: isso é algo a se fazer depois, fazer um loop/iterador
    //para percorrer o vetor de produtos e somar todos os valores
  }

  //CalendarDay
  public void set_calendar() {
    //TODO: pegar data do sistema
  }
  public void set_calendar( CalendarDay calendar ) {
    this.day = calendar;
  }
  public void set_calendar( int day, int month, int year ) {
    this.day.setDay(day);
    this.day.setMonth(month);
    this.day.setYear(year);
  }

  //getters
  public int get_amount() {
    return this.amount;
  }

  public float get_amount_raised() {
    return this.amountRaised;
  }

  public String get_calendar() {
    return this.day.toString();
  }
}
