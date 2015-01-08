package jeudego;

public class Pion {
 private Point pos;
 private String color; 
 private PlateauJeu plateau;
 private Groupe group;
 
 public Pion (Point p, String s,PlateauJeu pl){
	 this.pos=p;
	 this.color=s;
	 this.plateau=pl;	 
}
 
public Point getpos(){return this.pos;
}

public String getColor(){return this.color;
}

public PlateauJeu getPlateau(){return this.plateau;
}

public void setpos(Point p){this.pos=p;
}

public void setColor(String c){this.color=c;
}

public void setPlateau(PlateauJeu plato){this.plateau=plato;
}

public Groupe getGroupe(){return this.group;
}

public void setGroupe(Groupe G){this.group=G;
}


 
 
 
}
