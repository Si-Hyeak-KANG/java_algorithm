package dataStructureSudy.base01;

// 기본적인 해시 테이블 구현
public class Hash {

    // Hash table
    public Slot[] hashTable;

    // Hash 객체를 생성할 때 table 사이즈 지정
    public Hash(Integer size) {
        this.hashTable = new Slot[size];
    }

    // Slot에는 value를 가짐
    public class Slot {

        String value;

        Slot(String value) {
            this.value = value;
        }
    }

    //Hash function
    public int hashFunction(String key) {
        return (int)(key.charAt(0)) % this.hashTable.length; // 나머지지
   }

   public boolean saveData(String key, String value) {

        Integer address = this.hashFunction(key); // key는 해시 함수를 거쳐서 해시 값(해시, 해시 주소)을 반환 -> 여기선 배열의 index와 동일

       if(this.hashTable[address] != null) { // 해당 주소에 이미 데이터가 있을 경우
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

        myHash.saveData("Lee","01098251090");
        myHash.saveData("James","01094064180");
        myHash.saveData("Denny","01013205230");

        System.out.println(myHash.getData("Lee"));
        System.out.println(myHash.getData("James"));
        System.out.println(myHash.getData("Denny"));

    }
}
