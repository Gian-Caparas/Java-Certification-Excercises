public class Phone {
    private boolean hasUnlimitedCalls;
    private boolean hasUnlimitedTexts;
    private int internetMB;

    public Phone(){
        this.hasUnlimitedCalls = false;
        this.hasUnlimitedTexts = false;
        this.internetMB = 0;
    }

    public void load(CellphoneLoad load){
        this.hasUnlimitedCalls = load.getHasUnlimitedCalls();
        this.hasUnlimitedTexts = load.getHasUnlimitedTexts();
        this.internetMB += load.getInternetMB();
    }

    public String toString(){
        return "Has unlimited calls = " + hasUnlimitedCalls + ", Has unlimited texts = " + hasUnlimitedTexts + ", internet MB = " + internetMB;
    }
}
