/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gillo;


/**
 *
 * @author BED
 */
public class Gillo {

    static int[] data = new int[100];
    static int size = 0;

    public static void add(int value) {
        data[size++] = value;
    }

    public static int peek() {
        if (size == 0) {
            System.out.println("List is empty. Nothing to peek.");
            return -1;
        }
        return data[0];
    }

    public static int poll() {
        if (size == 0) {
            System.out.println("List is empty. Nothing to poll.");
            return -1;
        }
        int first = data[0];
        for (int i = 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        return first;
    }

    public static int pop() {
        if (size == 0) {
            System.out.println("List is empty. Nothing to pop.");
            return -1;
        }
        return data[--size];
    }

    public static void printList() {
        System.out.print("List: ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        add(10);
        add(20);
        add(30);
        printList();

        System.out.println("Peek: " + peek());
        System.out.println("Poll: " + poll());
        printList();
        System.out.println("Pop: " + pop());
        printList();
    }
}


   
