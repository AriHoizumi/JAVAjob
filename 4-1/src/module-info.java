package check;

public class Pet {
    private String name;
    private String masterName;
    
    private Pet(String name, String masterName) {
        this.name = name;
        this.masterName = masterName;
    }
    
    protected String getName() {
        return name;
    }
    
    protected String getMasterName() {
        return masterName;
    }
    
    public void introduce() {
        System.out.println("僕の名前は" + name + "です");
        System.out.println("ご主人様は" + masterName + "です");
    }
}

class RobotPet extends Pet {
    public RobotPet(String name, String masterName) {
        super(name, masterName);
    }
    
    @Override
    public void introduce() {
        System.out.println("私はロボット。名前は" + getName() + "。");
        System.out.println("ご主人様は" + getMasterName() + "。");
    }
}

public class Constants {
    
    public static final String CHECK_CLASS_JAVA = "java吉";
    public static final String CHECK_CLASS_HOGE = "hoge";
    public static final String CHECK_CLASS_R2D2 = "R2D2";
    public static final String CHECK_CLASS_LUKE = "ルーク";
}

public class Main {
    public static void main(String[] args) {
        
        Main main = new Main();
        
        main.printName();
    }
    
    private String firstName = "Ari";
    private String lastName = "Hoizumi";
    
    System.out.println("printNameメソッド → "+firstName+" "+lastName);
}

class firstName {
    firstName() {
    }
}

class lastName {
    lastName() {
    }
}