// polymorphism 
package ex07;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class program {
    public static void main(String[] args) {
        // //#region ex1 Demo

        // BaseHero hero3 = new Magician();
        // System.out.println(hero3.getInfo());

        // BaseHero hero4 = new Priest();
        // System.out.println(hero4.getInfo());

        // BaseHero hero5 = new Healer();
        // System.out.println(hero5.getInfo());

        // //#endregion

        // //#region ex2 Attack
        // System.out.println("------");
        // System.out.println(hero3.getInfo());
        // System.out.println(hero4.getInfo());

        // hero3.Attack(hero4);

        // hero4.Attack(hero3);
        // System.out.println(hero3.getInfo());
        // System.out.println(hero4.getInfo());

        // System.out.println("------");
        // hero4.Heal(10);
        // System.out.println(hero4.getInfo());

        // //#endregion

        //#region Teams
        int teamCount = 10;
        Random rand = new Random();
        int magicianCount = 0;
        int priestCount = 0;
        int healerCount = 0;

        List<BaseHero> teams = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            if (rand.nextInt(3) == 0) {
                teams.add(new Priest());
                priestCount++;
            }
            else if (rand.nextInt(3) == 1) {
                teams.add(new Magician());
                magicianCount++;
            }
            else {
                teams.add(new Healer());
                healerCount++;
            }

            System.out.println(teams.get(i).getInfo());
        }
        System.out.println();
        System.out.printf("magicianCount: %d priestCount: %d healerCount: %d \n\n\n", magicianCount, priestCount, healerCount);
        
        // attack

        // #endregion
    }
}
