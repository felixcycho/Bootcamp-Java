package hero;

public class Archer extends Hero {
  private Bow bow;           // Recurve 反曲之弓 / Guinsoo 鬼索之弓

  // Archer Object has Hero Object inside
  public Archer() {
  //  super();        唔寫等於寫咗, implicitly written -> empty constructor
  }

  public void setBow(Bow bow) {
    
  }

}
