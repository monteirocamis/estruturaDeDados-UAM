package a1;

public class No {
    private String name;
    private No refNo = null;

    public No(String name) {
        this.name = name;
    }


    public No() {
    }

    public String getname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "Nome:" + name +
                '}';
    }


}
