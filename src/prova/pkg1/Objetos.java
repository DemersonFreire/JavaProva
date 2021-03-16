
package prova.pkg1;


public class Objetos {
    String VeF = "Velozes e Furiosos";
    int notasVeF[] = {4,1,3};
    String AVDS = "A Voz Do Silêncio";
    int notasAVDS[] = {5,4,3};
    String LC = "Lucy";
    int notasLC[] = {2,5,3};
    

   /* public Objetos(String VeF, int notasVeF[], String AVDS, int notasAVDS[], String LC, int notasLC[]) {
        this.VeF = VeF;
        this.notasVeF = notasVeF;
        this.AVDS = AVDS;
        this.notasAVDS = notasAVDS;
        this.LC = LC;
        this.notasLC = notasLC;
        
    }*/
    
    
   void OBJ(){
      System.out.println("Filme: " + this.VeF + "\nNotas: " + notasVeF[0] + ", " + notasVeF[1] + ", " + notasVeF[2]);
      System.out.println("Filme: " + this.AVDS + "\nNotas: " + notasAVDS[0] + ", " + notasAVDS[1] + ", " + notasAVDS[2]);
      System.out.println("Filme: " + this.LC + "\nNotas: " + notasLC[0] + ", " + notasLC[1] + ", " + notasLC[2]);
      
  
  }

    public String getVeF() {
        return VeF;
    }

    public void setVeF(String VeF) {
        this.VeF = VeF;
    }

    public int[] getNotasVeF() {
        return notasVeF;
    }

    public void setNotasVeF(int[] notasVeF) {
        this.notasVeF = notasVeF;
    }

    public String getAVDS() {
        return AVDS;
    }

    public void setAVDS(String AVDS) {
        this.AVDS = AVDS;
    }

    public int[] getNotasAVDS() {
        return notasAVDS;
    }

    public void setNotasAVDS(int[] notasAVDS) {
        this.notasAVDS = notasAVDS;
    }

    public String getLC() {
        return LC;
    }

    public void setLC(String LC) {
        this.LC = LC;
    }

    public int[] getNotasLC() {
        return notasLC;
    }

    public void setNotasLC(int[] notasLC) {
        this.notasLC = notasLC;
    }
   
   
   
   
  
}
      
  

    

