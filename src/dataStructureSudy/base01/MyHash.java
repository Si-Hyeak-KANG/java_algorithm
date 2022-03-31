package dataStructureSudy.base01;

// How to solve collision to chaining
public class MyHash {

    private Slot[] hashTable;

    public MyHash(Integer size) {
        this.hashTable = new Slot[size];
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

    public Integer hashFunction(String key) {

        return (int)(key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {

        Integer address = this.hashFunction(key);

        if (this.hashTable[address] != null) {

            Slot findSlot = this.hashTable[address];
            Slot prevSlot = this.hashTable[address];

            while(findSlot != null) {

                if(findSlot.key == key) {
                    findSlot.value = value;
                    return true;
                } else {
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }

            }

            prevSlot.next = new Slot(key, value); // 왜 prevSlot 으로 했을까 Debugging 해볼 것

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

        }

        return null;
    }

    public static void main(String[] args) {
        MyHash myHash = new MyHash(20);

        myHash.saveData("apple","3000");
        myHash.saveData("banana", "1500");
        myHash.saveData("peer", "1800");
        myHash.saveData("peach", "700");
        myHash.saveData("orange", "4500");
        myHash.saveData("oriental melon", "6000");

        System.out.println(myHash.getData("banana"));
        System.out.println(myHash.getData("peer"));
        System.out.println(myHash.getData("peach"));
        System.out.println(myHash.getData("orange"));
        System.out.println(myHash.getData("oriental melon"));
        System.out.println(myHash.getData("aaaa"));




    }

}
