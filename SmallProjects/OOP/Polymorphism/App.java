package OOP.Polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return this.name;
    }

}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eat lots of people";
    }
}

class Batman extends Movie {
    public Batman() {
        super("Batman");
    }

    @Override
    public String plot() {
        return "Bat in human suit";
    }

}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 11; i++) {
            Movie movie = ranMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie ranMovie() {
        int randomNum = (int) (Math.random() * 3) + 1;
        System.out.println("Number generated was " + randomNum);
        switch (randomNum) {
            case 1:
                return new Jaws();
            case 2:
                return new Batman();
            case 3:
                return new Forgetable();
            default:
                return null;
        }
    }
}
