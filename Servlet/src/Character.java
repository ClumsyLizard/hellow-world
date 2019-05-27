
import java.util.*;
public class Character {
  public String name;
  private int STR;
  public int DEX;
  private int HP;
  public Character() {
    Scanner sc = new Scanner(System.in);
    System.out.print("輸入玩家姓名：");
    name = sc.next();
    System.out.print("輸入力量：");
    STR = sc.nextInt();
    System.out.print("輸入敏捷：");
    DEX = sc.nextInt();
    System.out.print("輸入体力：");
    HP = sc.nextInt();
  }
  public void Attack(Character rival) {
    rival.HP = rival.HP - STR;
    System.out.println(name + "対" + rival.name + "造成了" + STR + "点傷害！");
  }
  public boolean isAlive() {
    boolean r = true;
    if(HP > 0) {
      r = true;
    }else if(HP<=0) {
      r = false;
    }
    return r;
  }
}
