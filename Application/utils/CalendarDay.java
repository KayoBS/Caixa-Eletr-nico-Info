public class CalendarDay {
  private int day;
  private int month;
  private int year;

  //constructors
  CalendarDay() {}
  CalendarDay( int day, int month, int year ) {
    //OBS: isso quebra a regra da responsabilidade única
    this.setDay(day);
    this.setMonth(month);
    this.setYear(year);
  }
  CalendarDay( CalendarDay calendar ) {
    this.day = calendar.getDay();
    this.month = calendar.getMonth();
    this.year = calendar.getYear();
  }

  //setters
  public void setDay( int day ) {
    if( day < 0 ) {
      day *= -1;
    }
    this.day = day;
  }
  public void setMonth( int month ) {
    if( month < 0 ) {
      month *= -1;
    }
    this.month = month;
  }
  public void setYear( int year ) {
    if ( year < 0 ) {
      year *= -1;
    }
    this.year = year;
  }

  //getters
  public int getDay() {
    return this.day;
  }
  public int getMonth() {
    return this.month;
  }
  public int getYear() {
    return this.year;
  }

  //special
  public String toString() {
    return (String.valueOf(day) + "/" + String.valueOf(month) + "/" + String.valueOf(year));
  }
  public void setCalendar( int day, int month, int year ) {
    //OBS: isso quebra a regra da responsabilidade única
    this.setDay(day);
    this.setMonth(month);
    this.setYear(year);
  }
  public CalendarDay getCalendar() {
    return this;
  }
}
