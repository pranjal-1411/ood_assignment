package learnJava ;


class gear{
    private int chainring,corg ;
    private wheel wheel;
    gear( int chainring,int corg){ this.chainring = chainring; this.corg = corg ;  }
    gear( int chainring,int corg,wheel wheel ){ this.chainring = chainring; this.corg = corg ; this.wheel = wheel ;  }
    double ratio(){  return chainring/corg ;  }
    double geaInches(){ return ratio()*wheel.diameter(); }
}

class wheel{
    private int rim,tire ; 
    wheel( int rim,int tire ) {  this.rim=rim ; this.tire= tire ;  }
    int diameter(){  return rim+tire*2 ;  }
    double circumference() {  return diameter()*Math.PI ;}
}

public class ood{
    public static void main(String[] args){
`
    }
}

