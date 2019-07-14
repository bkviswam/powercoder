class TowerOfHanoi{
  public static void main(String [] arg){
    TowerOfHanoi tw = new TowerOfHanoi();
    int numberOfDisks = 5;
    char source = 'A';
    char destionation = 'B';
    char intermediate = 'C';
    tw.move(numberOfDisks,source,destionation,intermediate);
  }
  public void move(int numberOfDisks, char source, char destionation, char intermediate){
    if(numberOfDisks==1){
        System.out.println("Moved "+numberOfDisks+" from "+source+" to "+destionation);
    }else{
        move(numberOfDisks-1, source, intermediate, destionation);
        System.out.println("Moved "+numberOfDisks+" from "+source+" to "+destionation);
        move(numberOfDisks-1, intermediate, destionation, source);
    }
  }
}
