package _8Polymorphism;

abstract class  Language {
    public abstract void greetings();


}

class Hindi extends Language{
    @Override
    public void greetings() {
        System.out.println("Suprabhat !");;
    }
}

class English extends Language{
    @Override
    public void greetings() {
        System.out.println("Good Morning !");;
    }
}

class French extends Language{
    @Override
    public void greetings() {
        System.out.println("Bon Jour !");;
    }
}


class UseLanguage{
    public static void main(String[] args) {
        Language lng;

        lng=new Hindi();
        lng.greetings();

        lng=new English();
        lng.greetings();

        lng=new French();
        lng.greetings();
    }
}
