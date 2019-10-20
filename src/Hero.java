import java.util.Random;

class Zs{
    static Zs z;
    private String name;
    private int sex;
    private int age ;
    private  String weapon;
    private String  skills;
    private int at;
    private int df;
    private int hp;

    static {
       // System.out.println("你选择了一个战士 : " );
//        this.name = "无名小辈" ;
//        this.weapon = "手无寸铁";
//        this.skills = "无所长技能" ;
            //creatZs()  ;

    }
    public static Zs creatZs(){
        if (z ==null) {
            Zs z = new Zs();
            return  z ;
        }
        return  z ;

    }
    private Zs() {

        System.out.println("你创建了一个战士 : " );
    }

    private Zs(String name) {
        this.name=name ;
        //System.out.println("名字 : "+name );
    }

    private Zs(String name, int age) {
        this(name) ;
        this.age=age ;
       // System.out.println("年纪 : "+age );
    }
    private void sexInfo(int sex)  {
        if (sex == 1  ) {
             System.out.println("这是一个男战士" );
        }else {
            System.out.println("这是一个女战士");
        }

    }
      private  void btInfo(int at, int df){

        if (at > 50 && df >50) {
            System.out.println("这是一个攻守相对平衡的英雄");
        } else if  (at >70  ) {
            System.out.println("这是一个极度攻击英雄");
        }else if  (at<50&&df >70 ){
            System.out.println("这是一个防御英雄" );
        } else if  (at< 30 && df > 90){
            System.out.println("这是一个极度防御英雄" );
        }else
            System.out.println("这是一个攻守平衡的英雄" );
      }
    private void hpInfo(int hp)  {
        if (hp == 0 ) {
            System.out.println("这个英雄已经死亡" );
        }else if (hp <= 10){
            System.out.println("这个英雄濒临死亡");
        }else if (hp <= 20){
            System.out.println("这个英雄身中重伤");
        }else if (hp <= 30){
            System.out.println("这个英雄身伤有伤，严重");
        }else if (hp <= 40) {
            System.out.println("这个英雄身伤有伤，比较严重");
        }else if (hp <= 50) {
            System.out.println("这个英雄身伤有伤");
        }else if (hp <= 60) {
            System.out.println("这个英雄身伤有旧伤");
        }else if (hp <= 70) {
            System.out.println("这个英雄身体不好");
        }else if (hp <= 80) {
            System.out.println("这个英雄身体一般");
        }else if (hp <= 90) {
            System.out.println("这个英雄身体还行");
        } else if (hp <= 100) {
            System.out.println("这个英雄身体健康");
        }else if (hp <= 120) {
            System.out.println("这个英雄体质很好");
        }else if (hp <= 150) {
            System.out.println("这个英雄极其强壮");
        } else if (hp <= 190) {
            System.out.println("这个英雄是超人");
        }
    }
    private Zs(String name, int age,int sex) {
        this(name,age) ;
        this.sex=sex;
        sexInfo(sex);


    }

    private Zs(String name ,int age,int sex,String weapon ) {
        this(name,age,sex) ;
        this.weapon=weapon;
       // System.out.println("武器 : "+weapon );

    }

    private Zs(String name ,int age, int sex,String weapon ,String skills) {
        this(name,age,sex,weapon);
        this.skills=skills;
       // System.out.println("技能 : "+skills );
    }

    public void setHero(String name ,int age, int sex,String weapon ,String skills){
        this.name = name ;
        this.age =age;
        this.sex= sex;
        this.weapon =weapon;
        this.skills =skills;
    }


    public void setBt(int at,int df, int hp){
        this.at = at ;
        this.df = df;
        this.hp= hp;
    }


    private void getName() {
        System.out.print("英雄名字："+name);

    }
    public void heroInfo(){
        this.sexInfo(sex);
        btInfo( at, df);
        this.hpInfo(hp);
        System.out.println("名字: "+name);
        System.out.println("年纪: "+age);
        System.out.println("武器: "+weapon);
        System.out.println("得意技能: "+skills);
        System.out.println("攻击: "+at);
        System.out.println("防御: "+df);
        System.out.println("生命值: "+hp);


    }
}

public class Hero {
    int herocount;

    public static void main(String[] args){

        Random r = new Random();
//        r.nextInt();      //获取随机数 				int
//        r.nextInt(10);    //获取随机数 [0-10)的随机数             int
//        r.nextBoolean();  //获取随机布尔值			bolean
//        r.nextDouble();   //获取随机数				double
//        r.nextFloat();    //获取随机数				float
//        r.nextLong();     //获取随机数   			        long
                int a = r.nextInt(200);
                int d = r.nextInt(200);
                int h = r.nextInt(200);
//
        Zs p1 = Zs.creatZs();
        p1.setHero("大娃",7,1,"空手","变大");
        p1.setBt(a,d,h);
       p1.heroInfo();


    }
}

