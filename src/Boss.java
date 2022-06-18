public class Boss extends GameEntity{
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    Weapon weapon=new Weapon();
    public String printlninfo(){
        return "Здоровье Босса: "+ getHealth()+"\nУрон Босса: "+getDamage()+weapon.getNameOfWeapon()+weapon.getTypeOfWeapon("Стрелковое");
    }

}
