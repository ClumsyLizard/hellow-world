public class Battle {
  public static void main(String[] args) {
    System.out.println("創建角色1");
    Character chara1 = new Character();
    System.out.println("生成角色成功！");
    System.out.println("創建角色2");
    Character chara2 = new Character();
    System.out.println("生成角色成功！");
    System.out.println("Battle Starts!!");
    int i = 0;
    int j = 0;
    while(chara1.isAlive()&&chara2.isAlive()) {
      if(chara1.DEX * i > 1000) {
        chara1.Attack(chara2);
        i = 0;
      }
      if(chara2.DEX * j > 1000) {
        chara2.Attack(chara1);
        j = 0;
      }
      i++;
      j++;
    }
    if(chara1.isAlive()&&(!chara2.isAlive())) {
      System.out.println(chara1.name + "撃敗了" + chara2.name + " ！");
    }else if(chara2.isAlive()&&(!chara1.isAlive())) {
      System.out.println(chara2.name + "撃敗了" + chara1.name + " ！");
    }else {
      System.out.println(chara1.name + "和" + chara2.name + " 都死啦！");
    }
  }
}
