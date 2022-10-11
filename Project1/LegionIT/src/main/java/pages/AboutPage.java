package pages;

public class AboutPage extends Page implements PageInterface {
    String Discaimer;

    public java.lang.String getDiscaimer() {
        return Discaimer;
    }

    public void setDiscaimer(java.lang.String discaimer) {
        Discaimer = discaimer;
    }

   public void getDeveloperName(){
       System.out.println("Mary Johns");
   }

}
