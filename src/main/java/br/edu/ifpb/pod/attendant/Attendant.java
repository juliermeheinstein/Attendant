/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.attendant;

import br.edu.ifpb.pod.queue.Queue;
/**
 *
 * @author Sinbad Heinstein
 */
public interface Attendant {
    
    void perform(Queue q);
    void report();
    
}
