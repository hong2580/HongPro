public class DefNewWordFac implements INewWordFac {
    private static DefNewWordFac instance = new DefNewWordFac();

    public static DefNewWordFac getInstance() {
        return instance;
    }

    private DefNewWordFac() {

    }

    @Override
    public INewWord getNewWordProcessor() {
        return new DefNewWord();
    }
}
