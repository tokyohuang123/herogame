import java.security.PublicKey;
import java.util.Random;
import java.util.Scanner;
class Hero {
    static Hero h;
    public String name;
    public int sex;
    public int age;
    public String weapon;
    public String skills;
    public int at;
    public int df;
    public int hp;
    public int mp;

    public Hero() {

    }

    public Hero(String name) {
        this.name = name;

    }

    public Hero(String name, int age) {
        this(name);
        this.age = age;

    }

    public Hero(String name, int age, int sex) {
        this(name, age);
        this.sex = sex;
        sexInfo(sex);


    }

    public Hero(String name, int age, int sex, String weapon) {
        this(name, age, sex);
        this.weapon = weapon;

    }

    public Hero(String name, int age, int sex, String weapon, String skills) {
        this(name, age, sex, weapon);
        this.skills = skills;

    }


    public void sexInfo(int sex) {
        if (sex == 1) {
            System.out.println("男");
        } else {
            System.out.println("女");
        }

    }

    public void btInfo(int at, int df, int hp) {
        if (at / df < 0.5 && hp > at) {
            System.out.println("防御型英雄");
        } else if (at / df > 1 && at / df < 2) {
            System.out.println("平衡英雄");
        } else if (at / df > 2) {
            System.out.println("攻击英雄");
        } else
            System.out.println("攻守平衡英雄");
    }

    public void hpInfo(int hp) {
        if (hp == 0) {
            System.out.println("英雄已经死亡");
        } else if (hp <= 10) {
            System.out.println("英雄濒临死亡");
        } else if (hp <= 20) {
            System.out.println("身中重伤");
        } else if (hp <= 30) {
            System.out.println("身伤有伤，严重");
        } else if (hp <= 40) {
            System.out.println("身伤有伤，比较严重");
        } else if (hp <= 50) {
            System.out.println("身伤有伤");
        } else if (hp <= 60) {
            System.out.println("这身有旧伤");
        } else if (hp <= 70) {
            System.out.println("身体不好");
        } else if (hp <= 80) {
            System.out.println("身体一般");
        } else if (hp <= 90) {
            System.out.println("身体还行");
        } else if (hp <= 100) {
            System.out.println("身体健康");
        } else if (hp <= 120) {
            System.out.println("体质很好");
        } else if (hp <= 150) {
            System.out.println("极其强壮");
        } else if (hp < 190) {
            System.out.println("超人体质");
        }
        if (hp >= 190){
            System.out.println("神体质");
        }
    }


    public void setHero(String name ,int age, int sex,String weapon ,String skills){
        this.name = name ;
        this.age =age;
        this.sex= sex;
        this.weapon =weapon;
        this.skills =skills;
    }


    public void setBt(int at,int df, int hp, int mp){
        this.at = at ;
        this.df = df;
        this.hp= hp;
        this.mp =mp;
    }


    private void getName() {
        System.out.print("英雄名字："+name);

    }
    public void heroInfo(){
        this.sexInfo(sex);
        btInfo( at, df,hp);
        this.hpInfo(hp);
        System.out.println("******************************************");
        System.out.println("名字: "+name);
        System.out.println("年纪: "+age);
        System.out.println("武器: "+weapon);
        System.out.println("得意技能: "+skills);
        System.out.println("攻击: "+at);
        System.out.println("防御: "+df);
        System.out.println("生命值: "+hp);
        System.out.println("魔法值: "+mp);
        System.out.println("******************************************");

    }
}


class Zs extends Hero {
    static Zs z;


    public static Zs creatZs() {
        if (z == null) {
            Zs z = new Zs();
            return z;
        }
        return z;

    }
    private Zs() {

        System.out.println("你创建了一个战士 : ");
    }



}
    class Fs extends Hero {
        static Fs f;


        public static Fs creatFs() {
            if (f == null) {
                Fs f = new Fs();
                return f;
            }
            return f;

        }

        private Fs() {

            System.out.println("你创建了一个法师 : ");
        }


    }

class Ms extends Hero {
    static Ms m;


    public static Ms creatMs() {
        if (m == null) {
            Ms m = new Ms();
            return m;
        }
        return m;

    }

    private Ms() {

        System.out.println("你创建了一个牧师 : ");
    }


}

    /**
     * @author star
     */
    public  class TestHero {


        private static int herocount ;


        public static void main(String[] args) {

            System.out.println("请指定英雄能力范围，本系统会随机生成一个英雄的属性");
            Scanner input = new Scanner(System.in);
            int setline = input.nextInt();


            Random r = new Random();
//        r.nextInt();      //获取随机数 				int
//        r.nextInt(10);    //获取随机数 [0-10)的随机数             int
//        r.nextBoolean();  //获取随机布尔值			bolean
//        r.nextDouble();   //获取随机数				double
//        r.nextFloat();    //获取随机数				float
//        r.nextLong();     //获取随机数   			        long


            int a = r.nextInt(setline);
            int d = r.nextInt(setline);
            int h = r.nextInt(setline);
            int m = r.nextInt(setline);

            Zs p1 = Zs.creatZs();
            p1.setHero("大娃", 7, 1, "空手", "变大");
            p1.setBt(a, d, h,m);
            p1.heroInfo();

            int a1 = r.nextInt(setline);
            int d1 = r.nextInt(setline);
            int h1 = r.nextInt(setline);
            int m1 = r.nextInt(setline);

            Fs p2 = Fs.creatFs();

            p2.setHero(" 三娃", 7, 1, "空手", "喷火");
            p2.setBt(a1, d1, h1,m1);
            p2.heroInfo();


            int a2 = r.nextInt(setline);
            int d2 = r.nextInt(setline);
            int h2 = r.nextInt(setline);
            int m2 = r.nextInt(setline);

            Ms p3 = Ms.creatMs();

            p3.setHero("七娃", 7, 1, "葫芦", "法宝");
            p3.setBt(a2, d2, h2,m2);
            p3.heroInfo();

            Random chose = new Random();
            int ch = chose.nextInt(3);
            String[] hero = {"战士", "法师", "牧师"};
            System.out.println("你 随机到了" + hero[ch]);
            int hc = herocount++;
            System.out.println("目前有 " + hc + " 个英雄 ");


        }
    }


