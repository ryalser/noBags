package mock;

public class Main {
    public static void main(String[] args) {

        CinemaTicket cinemaTicket = new CinemaTicket("Билет в кино",500,"Планетарий");

        Discont discont = new Discont();
        discont.applyDiscount(cinemaTicket);
    }




}
