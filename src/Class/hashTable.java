/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author asus
 */
public class hashTable {
    private dataHash[] hashArr;
    private int size;
    
    public hashTable(int size) {
        this.size = size;
        hashArr = new dataHash[size];
    }
    
    public int hashFunc(int key) {
        return key % size;
    }

    public void insert(int nik, String nama, String tujuan) {
        dataHash data = new dataHash(nik, nama, tujuan);
        int key = data.getKey();
        int hashVal = hashFunc(key);
        while (hashArr[hashVal] != null) {
            ++hashVal;
            hashVal %= size;
        }
        hashArr[hashVal] = data;
    }
    
    public dataHash delete(int key) {
        int hashVal = hashFunc(key);
        while (hashArr[hashVal] != null) {
            if (hashArr[hashVal].getKey() == key) {
                dataHash temp = hashArr[hashVal];
                hashArr[hashVal] = null;
                return temp;
            }
            ++hashVal;
            hashVal %= size;
        }
        return null;
    }

    public dataHash find(int key) {
        int hashVal = hashFunc(key);
        while (hashArr[hashVal] != null) {
            if (hashArr[hashVal].getKey() == key) {
                return hashArr[hashVal];
            }
            ++hashVal;
            hashVal %= size;
        }
        return null;
    }

//    public dataHash getAll(int i) {
//        return hashArray[i];
//    }
    
//    public String getTujuan(int key) {
//        int hashVal = hashFunc(key);
//        while (hashArr != null) {
//            if (hashArr[hashVal].getKey() == key) {
//                return hashArr[hashVal].getTujuan();
//            }
//        }
//        return null;
//    }
    
    public void displayTable() {
        System.out.println("Table: ");
        for (int j = 0; j < size; j++) {
            if (hashArr[j] != null) {
                System.out.println(" | "+j+"\t | "+hashArr[j].getNama()+" | "+hashArr[j].getKey()+" | "+hashArr[j].getTujuan()+" | ");
            } else {
                System.out.println(" | " + j + "\t | -- | -- | -- |");
            }
        }
    }
}

//class hashTableApp {
//    public static void main(String[] args) throws IOException {
//        dataHash data;
//        int key, maxSize, number;
//        String nama;
//        
//        System.out.print("Masukkan Total Data: "); // 15
//        maxSize = getInt();
//        System.out.print("Masukkan Data yang Ingin Diinput: "); // 10
//        number = getInt();
//        
//        hashTable hash = new hashTable(maxSize);
//        for (int i = 0; i < number; i++) {
//            System.out.print("Entry nik: ");
//            key = getInt();
//            System.out.print("Entry nama: ");
//            nama = getString();
//            hash.insert(key, nama);
//        }
//        
//        while (true) {
//            System.out.print("Enter first letter of show, insert, "
//                            + "delete, or find: ");
//            char choice = getChar();
//            switch(choice) {
//                case 's':
//                    hash.displayTable();
//                    break;
//                case 'i':
//                    System.out.print("Entry nik: ");
//                    key = getInt();
//                    System.out.print("Entry nama: ");
//                    nama = getString();
//                    break;
//                case 'd':
//                    System.out.print("Enter key value to delete: ");
//                    key = getInt();
//                    hash.delete(key);
//                    break;
//                case 'f':
//                    System.out.print("Enter key value to find: ");
//                    key = getInt();
//                    data = hash.find(key);
//                    if (data != null) {
//                        System.out.println("Found : "+key);
//                    } else {
//                        System.out.println("Couldn't find: "+key);
//                    }
//                    break;
//                default: 
//                    System.out.print("Invalid entry\n");
//            }
//        }
//    }
//    
//    public static String getString() throws IOException { 
//        InputStreamReader input = new InputStreamReader(System.in); 
//        BufferedReader br = new BufferedReader(input); 
//        String st = br.readLine(); 
//        return st; 
//    } 
//        
//    public static char getChar() throws IOException { 
//        String st = getString(); 
//        return st.charAt(0); 
//    }
//    
//    public static int getInt() throws IOException { 
//        String st = getString(); 
//        return Integer.parseInt(st); 
//    }
//}