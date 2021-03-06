public class Printer {
    private int sheetsOfPaper;
    private int tonerVolume;

    public Printer(int sheetsOfPaper, int tonerVolume) {
        this.sheetsOfPaper = sheetsOfPaper;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsOfPaper() {
        return sheetsOfPaper;
    }

    public void setSheetsOfPaper(int sheetsOfPaper) {
        this.sheetsOfPaper = sheetsOfPaper;
    }

    public int print(int pages, int copies) {
        int numberOfPagesToBePrinted = (pages * copies);
        if(this.sheetsOfPaper >= numberOfPagesToBePrinted && this.tonerVolume >= numberOfPagesToBePrinted) {
            setTonerVolume(this.tonerVolume - numberOfPagesToBePrinted);
            return this.sheetsOfPaper - numberOfPagesToBePrinted;
        }
        return this.sheetsOfPaper;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void setTonerVolume(int tonerVolume) {
        this.tonerVolume = tonerVolume;
    }
}
