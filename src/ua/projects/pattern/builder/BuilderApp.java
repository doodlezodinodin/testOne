package ua.projects.pattern.builder;

/**
 * Created by alex on 07.05.2017.
 */
public class BuilderApp {
    public void execute(){
        Cigarette cig = new BuilderCigarette().buildName("Bond").build();
        System.out.println(cig);
    }
}

class Cigarette {
    private String name;
    private int count;
    private double resin;
    private double nicotine;

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setResin(double resin) {
        this.resin = resin;
    }

    public void setNicotine(double nicotine) {
        this.nicotine = nicotine;
    }

    @Override
    public String toString() {
        return "Cigarette{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", resin=" + resin +
                ", nicotine=" + nicotine +
                '}';
    }
}

class BuilderCigarette {
    private String name = "LM";
    private int count = 20;
    private double resin = 0.6;
    private double nicotine = 0.6;

    public BuilderCigarette buildName(String name) {
        this.name = name;
        return this;
    }

    public BuilderCigarette buildCount(int count) {
        this.count = count;
        return this;
    }

    public BuilderCigarette buildResin(double resin) {
        this.resin = resin;
        return this;
    }

    public BuilderCigarette buildNicotine(double nicotine) {
        this.nicotine = nicotine;
        return this;
    }

    public Cigarette build() {
        Cigarette cigarette = new Cigarette();

        cigarette.setName(name);
        cigarette.setCount(count);
        cigarette.setResin(resin);
        cigarette.setNicotine(nicotine);

        return cigarette;
    }
}






