package dataStructureSudy.base01;

public class Hash {

    // hash table -> 배열로 할당이 되어있다.
    public Slot[] hashTable;

    public Hash(Integer size) {
        this.hashTable = new Slot[size]; // 미리 사이즈 할당
    }

    public class Slot {

        String value;

        Slot(String value) {
            this.value = value;
        }
    }

    /*
    String name = "DaveLee";
    name.charAt(0); // 문자열에서 index에 해당하는 문자 출력

    (int)(name.charAt(0)); // 정수로 변환하면 아스키 코드로 정수값 출력

    (int)(name.charAt(0)) % 20; // division 기법 : 나머지 리턴
     */

    // 해시 함수 구현
    public Integer hashFunction(String key) {

        return (int)(key.charAt(0)) % this.hashTable.length;

    }

    // 저장을 성공했는가
    public boolean saveData(String key, String value) {

        Integer address = this.hashFunction(key);

        if(this.hashTable[address] != null) {
            this.hashTable[address].value = value;
        } else {
            this.hashTable[address] = new Slot(value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunction(key);

        if(this.hashTable[address] != null) {
            return this.hashTable[address].value;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        Hash myHash = new Hash(20);

        myHash.saveData("DaveLee","01094064180");
        myHash.saveData("Leesoo","01098251090");
        myHash.saveData("James","01044444180");

        System.out.println(myHash.getData("LeeSoo"));
    }
}
