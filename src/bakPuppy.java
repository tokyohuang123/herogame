class Puppy {
    int puppyAge;

    public Puppy(String name) {
        // 这个构造器仅有一个参数：name
        System.out.println("小狗的名字是 : " + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("小狗的年龄为 : " + puppyAge);
        return puppyAge;
    }

    public static int[] sortArr(int[] arr) {
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length-i; i++) {
                for (int j = 0; j < arr.length -i - 1; j++)
                    if (arr[j+1] > arr[j]) {
                        int tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j + 1] = tmp;
                    }
            }
        }
        int[] arr2 = arr;
                return arr2    ;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

    public static void main(String[] args) {
//        int year = 2019;
//        int mouth =1;
//        int day = -1;
//        int x = 1;
//        int y = 2;
//        int money = 19000;
            int[] arr ={1,3,22,4,66,28,57};
//        /* 创建对象 */
//        Puppy myPuppy = new Puppy("tommy");
//        /* 通过方法来设定age */
//        myPuppy.setAge(2);
//        /* 调用另一个方法获取age */
//        myPuppy.getAge();
//        /*你也可以像下面这样访问成员变量 */
//        System.out.println("变量值 : " + myPuppy.puppyAge);
//        System.out.println(x >= y);
//
//        if (money > 1000 && money <= 3000) {
//            System.out.println("A" + money);
//        }
//
//        if (money > 3000 && money <= 5000) {
//            System.out.println("B" + money);
//        }
//        if (money > 5000 && money <= 13000) {
//            System.out.println("C" + money);
//        } else {
//            System.out.println("?" + money);
//        }
//
//        switch (mouth){
//            case 1:{
//                System.out.println("1");
//            }
//        }
//    }
        for (int i =0 ; i < arr.length; i ++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
          printArr(arr);
        System.out.println();
       int[] arr3 = sortArr(arr);
        printArr((arr3));
    }
}