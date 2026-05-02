public class Button{
    int clickCount = 0;
    int longClickCount = 0;

    public Button(){}//Default Constructor
    public Button(int clickCount, int longClickCount){
        this.clickCount = clickCount;
        this.longClickCount = longClickCount;
    }

    public void click(){
        System.out.println("Button is clicked");
        clickCount++;
    }

    public void longClikc(){
        System.out.println("Button is long clicked");
        longClickCount++;
    }

    public String toString() {
        return String.format("Button clicked = %d\nLong clicked = %d", clickCount, longClickCount);
    }

}