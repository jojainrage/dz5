public class Skeleton extends Boss{
    public int getAmountOfArrows() {
        return amountOfArrows;
    }

    public void setAmountOfArrows(int amountOfArrows) {
        this.amountOfArrows = amountOfArrows;
    }

    private int amountOfArrows;

    @Override
    public String printlninfo() {
        return "\n Здоровье скелета: "+getHealth()+"\nУрон скелета: "+getDamage()+"\nОружие: "+weapon.getNameOfWeapon()+
                "\nКол-во стрел; " + getAmountOfArrows() + "\nТип оружия: "+weapon.getTypeOfWeapon("Стрелковое") ;
    }
}
