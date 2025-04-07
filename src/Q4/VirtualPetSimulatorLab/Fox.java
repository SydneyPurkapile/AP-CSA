package Q4.VirtualPetSimulatorLab;

public class Fox extends Pet {
    public Fox(String name) {
        super(name);
        super.setImage(ImageHelper.getRandomFoxImg());
    }

    @Override
    public void feed() {
        // TODO: Implement feeding behavior for Dog
    }

    @Override
    public void play() {
        // TODO: Implement playing behavior for Dog
    }

    @Override
    public void sleep() {
        // TODO: Implement sleeping behavior for Dog
    }
}
