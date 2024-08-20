*/
class myClass{
  public static void main(String[]args){
        
    
    
    double royaleMiles = 286.0;
    double royaleGal = 9.0;
    double koopMiles = 412.0;
    double koopGal = 40.0;
    double pipeMiles = 361.0;
    double pipeGal = 18.0;
    double badMiles = 161.0;
    double badGal = 11.0;
    
    
    
    double royalAve = (royaleMiles / royaleGal);
    double koopAve = koopMiles / koopGal;
    double pipeAve = pipeMiles / pipeGal;
    double badAve = badMiles / badGal;
    
    System.out.format("%.1f", royalAve);
    System.out.println("");
    System.out.format("%.1f", koopAve);
    System.out.println(" ");
    System.out.format("%.1f", pipeAve);
    System.out.println(" ");
    System.out.format("%.1f", badAve);
