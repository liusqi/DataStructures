<?php
class Node{
    public $val;
    public $prev;
    public $next;
    
    public function __construct($val, Node $prev=null, Node $next=null){
        $this->val = $val;
        $this->prev = $prev;
        $this->next = $next;
    }
}

class LinkedList {
    public $size;
    public $head;
    public $tail;
    
    public function __construct($size = null) {
        $this->size = $size;
    }
    
    public function insert(Node $node){
        if(empty($this->head)){
            $this->head = $node;
            $this->tail = $node;
        }
        else{
            $node->next = $this->head;
            $this->head = $node;
        }
    }
    
    public function getList(){
        $current = $this->head;
        while(!empty($current)){
            echo $current->val . '<br>';
            $current = $current->next;
        }
    }
}