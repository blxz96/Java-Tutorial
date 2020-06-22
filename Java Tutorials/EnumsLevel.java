public enum EnumsLevel{
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int lvlNum;

    private EnumsLevel(int num){
        this.lvlNum = num;
    }

    public int getLvl(){
        return this.lvlNum;
    }

    public void setLvl(int num){
        this.lvlNum = num;
    }
}