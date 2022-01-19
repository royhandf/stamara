/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

public class LinkQueue {
    public String nomor;
    public LinkQueue next;

    public LinkQueue(String value) {
        this.nomor = value;
        this.next = null;
    }
}
