package dmytro.bozhor;

import java.util.List;

public class ArrayListFiller implements Runnable {

    private List<Integer> integerList;

    public ArrayListFiller(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5_000; i++) {
            synchronized (integerList){
                integerList.add(i);
            }
        }

    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }
}
