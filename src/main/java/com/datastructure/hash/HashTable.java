package com.datastructure.hash;

/**
 * Created by nanzhou on 2017/8/7.
 */
public class HashTable {

    private DataItem[] hashArray;

    private int arraySize;

    private DataItem nonItem;

    public HashTable(int size) {

        arraySize = size;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1);
    }

    public void displayTable() {

        System.out.print("Table : ");

        for (int j = 0; j < arraySize; j++) {

            if (hashArray[j] != null) {

                System.out.print(hashArray[j].getKey() + " ");

            } else {

                System.out.print("** ");
            }
        }
    }

    public int hashFunc(int key) {

        return key / arraySize;
    }

    public void insert(DataItem data) {

        int key = data.getKey();

        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {

            ++hashVal;
            hashVal %= arraySize;
        }
        hashArray[hashVal] = data;
    }

    public DataItem delete(int key) {

        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {

            if (hashArray[hashVal].getKey() == key) {

                DataItem temp = hashArray[hashVal];
                hashArray[hashVal] = nonItem;
                return temp;
            }
            ++hashVal;
            hashVal %= arraySize;
        }
        return null;
    }

    public DataItem find(int key) {

        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null) {

            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];

            }
            ++hashVal;
            hashVal %= arraySize;
        }
        return null;
    }


}