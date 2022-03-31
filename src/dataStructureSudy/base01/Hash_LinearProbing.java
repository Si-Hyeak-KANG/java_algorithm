package dataStructureSudy.base01;

public class Hash_LinearProbing {

    // hash table -> 배열로 할당이 되어있다.
    public Slot[] hashTable;

    public Hash_LinearProbing(Integer size) {
        this.hashTable = new Slot[size]; // 미리 사이즈 할당
    }

    public class Slot {

        String key;
        String value;

        Slot(String key, String value) {
            this.key = key;
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

        if(this.hashTable[address] != null) { // 해당 주소에 이미 데이터가 존재할 경우

            if (this.hashTable[address].key == key) {
                this.hashTable[address].value = value;
                return true;
            } else {
                Integer currAddress = address + 1;

                while(this.hashTable[currAddress] != null) {

                    if(this.hashTable[currAddress].key == key) {
                        this.hashTable[currAddress].value = value;
                        return true;
                    } else {
                        currAddress++;
                        if(currAddress >= this.hashTable.length) {
                            return false;
                        }
                    }

                }

                this.hashTable[currAddress] = new Slot(key, value);
                return true;
            }

        } else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunction(key);

        if(this.hashTable[address] != null) {
            if(this.hashTable[address].key == key) {
                return this.hashTable[address].value;
            } else {
                Integer currAddress = address + 1;

                while (this.hashTable[currAddress] != null) {
                    if (this.hashTable[currAddress].key == key) {
                        return this.hashTable[currAddress].value;
                    } else {
                        currAddress++;
                        if(currAddress >= this.hashTable.length) {
                            return null;
                        }
                    }
                }
                return null;
            }
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        Hash_LinearProbing myHash = new Hash_LinearProbing(20);

        myHash.saveData("DaveLee","01094064180");
        myHash.saveData("Lees","01098251090");
        myHash.saveData("James","01044444180");
        myHash.saveData("Daves","01012347180");
        myHash.saveData("Dalyes","01099999999");

        System.out.println(myHash.getData("Lees")); // 01095251090
        System.out.println(myHash.getData("James")); // 01044444180
        System.out.println(myHash.getData("DaveLee")); // 01094064180
        System.out.println(myHash.getData("Daves")); // 01012347180
        System.out.println(myHash.getData("Dalyes")); // 01099999999
        System.out.println(myHash.getData("zzzz")); // null
    }
}
