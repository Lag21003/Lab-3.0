publicxs class Greek implements Pizza {

    @override
    public void prepare() {
        System.out.println("Preparing a Greek Pizza");
    }

    @override
    public void bake() {
        System.out.println("Baking a Greek Pizza");
    }

    @override
    public void cut () {
        System.out.println("Cutting a Greek Pizza");
    }

    @override 
    public void box () {
        System.out.println("Boxxing a Greek Pizza");
    }

    public String getName() {
        return name;
    }
}