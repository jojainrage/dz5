public class Main {
    public static void main(String[] args) {
        Boss boss= new Boss();
        boss.setHealth(200);
        boss.setDamage(20);
        boss.weapon.setNameOfWeapon("Клэймор");
        boss.weapon.setTypeOfWeapon("Оружие ближнего боя");
        System.out.println();
        Skeleton skeleton1=new Skeleton();
        skeleton1.setHealth(100);
        skeleton1.setDamage(10);
        skeleton1.weapon.setNameOfWeapon("Bow");
        skeleton1.setAmountOfArrows(11);
        Skeleton skeleton2=new Skeleton();
        skeleton2.setHealth(110);
        skeleton2.setDamage(11);
        skeleton2.weapon.setNameOfWeapon("Arnament Bow");
        skeleton2.setAmountOfArrows(12);
        skeleton1.weapon.setTypeOfWeapon("Стрелковое");
        skeleton2.weapon.setTypeOfWeapon("Стрелковое");
        System.out.println(boss.printlninfo());
        System.out.println(skeleton1.printlninfo());
        System.out.println(skeleton2.printlninfo());
    }
}















    //Привет сенсей!