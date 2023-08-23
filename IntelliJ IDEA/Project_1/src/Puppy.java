public class Puppy {
    int puppyAge;
    public Puppy(String name){
        System.out.println("🐕叫：" + name);
    }
    public  void  setAge(int age){
        puppyAge = age;
    }

    public int getAge(){
        System.out.println("🐕有" + puppyAge + "岁");
        return puppyAge;
    }

    public static void main(String[] args){
        Puppy myPuppy = new Puppy("Du1l0ve");
        myPuppy.setAge(22);
        myPuppy.getAge();
        System.out.println("变量值：" + myPuppy.puppyAge);
    }
}
