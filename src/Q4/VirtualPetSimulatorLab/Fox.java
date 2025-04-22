package Q4.VirtualPetSimulatorLab;

public class Fox extends Pet {
    public Fox(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomFoxImg());
    }

    @Override
    public void feed() {
        super.setEnergy(getEnergy() + 10);
        if (super.getEnergy() > 100)
            super.setEnergy(100);
        super.setHappiness(getHappiness() + 10);
        if (super.getHappiness() > 100)
            super.setHappiness(100);
        super.setHunger(getHunger() - 10);
        if (super.getHunger() < 0)
            super.setHunger(0);
    }

    @Override
    public void play() {
        super.setEnergy(getEnergy() - 5);
        if (super.getEnergy() < 0)
            super.setEnergy(0);
        super.setHappiness(getHappiness() + 10);
        if (super.getHappiness() > 100)
            super.setHappiness(100);
        super.setHunger(getHunger() + 10);
        if (super.getHunger() > 100)
            super.setHunger(100);
    }

    @Override
    public void sleep() {
        super.setEnergy(getEnergy() + 15);
        if (super.getEnergy() > 100)
            super.setEnergy(100);
        super.setHappiness(getHappiness() + 10);
        if (super.getHappiness() > 100)
            super.setHappiness(100);
        super.setHunger(getHunger() + 5);
        if (super.getHunger() > 100)
            super.setHunger(100);
    }
}
