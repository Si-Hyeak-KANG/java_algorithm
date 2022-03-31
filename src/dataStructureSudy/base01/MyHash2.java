package dataStructureSudy.base01;

// How to solve collision to Linear Probing
public class MyHash2 {

    private Slot[] hashTable;

    public MyHash2(Integer size) {
        this.hashTable = new Slot[size];
    }

    public class Slot {
        String key;
        String value;

        public Slot(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public Integer hashFunction(String key) {
        return (int)(key.charAt(0)) % hashTable.length;
    }

    public boolean saveData(String key, String value) {

        Integer address = this.hashFunction(key);

        if(this.hashTable[address] != null) {

            if(this.hashTable[address].key == key) {
                this.hashTable[address].value = value;
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

                this.hashTable[currAddress] = new Slot(key,value);
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

                while(this.hashTable[currAddress] != null) {

                    if(this.hashTable[currAddress].key == key) {
                        return hashTable[currAddress].value;
                    } else {
                        currAddress++;

                        if(currAddress >= this.hashTable.length) {
                            return null;
                        }
                    }
                }
                return null;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        MyHash2 myHash = new MyHash2(20);

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
