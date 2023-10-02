package main

import (
    "fmt"
)

type Node struct {
    Key int
    Left *Node
    Right *Node
}

func NewBST(key int) *Node {
    return &Node{
        Key: key,
        Left: nil,
        Right: nil,
    }
}

func (n *Node) Insert(key int) {
    if key < n.Key {
        if n.Left == nil {
            n.Left = NewBST(key)
        } else {
            n.Left.Insert(key)
        }
    } else {
        if n.Right == nil {
            n.Right = NewBST(key)
        } else {
            n.Right.Insert(key)
        }
    }
}

func (n *Node) Search(key int) *Node {
    if n == nil {
        return nil
    }

    if n.Key == key {
        return n
    } else if key < n.Key {
        return n.Left.Search(key)
    } else {
        return n.Right.Search(key)
    }
}

func (n *Node) Delete(key int) {
    if n == nil {
        return
    }

    if key == n.Key {
        if n.Left == nil && n.Right == nil {
            return nil
        } else if n.Left == nil {
            return n.Right
        } else if n.Right == nil {
            return n.Left
        } else {
            // Find the minimum element in the right subtree.
            minNode := n.Right.Search(n.Right.Min())
            minNode.Key = n.Key
            minNode.Left = n.Left
            minNode.Right = n.Right.Delete(n.Key)
            return minNode
        }
    } else if key < n.Key {
        n.Left = n.Left.Delete(key)
    } else {
        n.Right = n.Right.Delete(key)
    }
}

func (n *Node) Min() int {
    if n.Left == nil {
        return n.Key
    } else {
        return n.Left.Min()
    }
}

func main() {
    // Create a new BST.
    bst := NewBST(10)

    // Insert some elements into the BST.
    bst.Insert(5)
    bst.Insert(15)
    bst.Insert(2)
    bst.Insert(7)
    bst.Insert(12)

    // Search for an element in the BST.
    node := bst.Search(12)
    if node != nil {
        fmt.Println("Found element:", node.Key)
    } else {
        fmt.Println("Element not found.")
    }

    // Delete an element from the BST.
    bst.Delete(12)

    // Search for the element again.
    node = bst.Search(12)
    if node != nil {
        fmt.Println("Found element:", node.Key)
    } else {
        fmt.Println("Element not found.")
    }
}
