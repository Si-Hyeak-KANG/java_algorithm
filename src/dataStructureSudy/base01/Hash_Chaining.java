package dataStructureSudy.base01;

public class Hash_Chaining {

    // hash table -> 배열로 할당이 되어있다.
    public Slot[] hashTable;

    public Hash_Chaining(Integer size) {
        this.hashTable = new Slot[size]; // 미리 사이즈 할당
    }

    public class Slot {

        String key;
        String value;
        Slot next;

        Slot(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
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

        if(this.hashTable[address] != null) { // 해당 주소에 이미 데이터가 존재할 경우

            Slot findSlot = this.hashTable[address]; // head에 해당
            Slot prevSlot = this.hashTable[address];

            while (findSlot != null) {
                if(findSlot.key == key) {
                    findSlot.value = value;
                    return true;
                } else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }

            prevSlot.next = new Slot(key, value);

        } else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunction(key);

        if(this.hashTable[address] != null) {
            Slot findSlot = this.hashTable[address];
            while(findSlot != null) {
                if(findSlot.key == key) {
                    return findSlot.value;
                } else {
                    findSlot = findSlot.next;
                }
            }
            return null;

        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        Hash_Chaining myHash = new Hash_Chaining(20);

        myHash.saveData("DaveLee","01094064180");
        myHash.saveData("Leesoo","01098251090");
        myHash.saveData("James","01044444180");
        myHash.saveData("Daves","01012347180");
        myHash.saveData("Dalyes","01099999999");

        System.out.println(myHash.getData("LeeSoo"));
        System.out.println(myHash.getData("James"));
        System.out.println(myHash.getData("DaveLee"));
        System.out.println(myHash.getData("Daves"));
        System.out.println(myHash.getData("Dalyes"));
    }
}
