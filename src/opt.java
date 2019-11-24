//Group 5
//IST 240
//Prof Fisher

////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////// Final/////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////
public class opt {

    String name = "Wade Watts";
    String difficulty = "Easy";
    int sco = 0; // holds the hits

    public opt() {
        super();
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public void setDifficulty(String d) {
        this.difficulty = d;
    }

    public String getDifficulty() {
        return this.difficulty;
    }

    public void setScore(int s) {
        sco = s;
    }

    public int getScore() {
        return sco;
    }
}
