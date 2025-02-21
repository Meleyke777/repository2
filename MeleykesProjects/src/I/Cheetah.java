package I;

class Cheetah implements Walker, Runner {
    @Override
    public void walk() {
        System.out.println("Cheetah is walking...");
    }

    @Override
    public void run() {
        System.out.println("Cheetah is running fast!");
    }
}
