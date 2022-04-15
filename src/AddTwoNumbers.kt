import java.util.LinkedList

class AddTwoNumbers {

    /**
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order, and each of their nodes contains a single digit.
     * Add the two numbers and return the sum as a linked list.
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     */
    fun getSumAsLinkedList(l1: LinkedList<Int>, l2: LinkedList<Int>) =
        LinkedList ((l1.reverseInt() + l2.reverseInt()).toString()
            .split("")
            .filterNot { it == "" }
            .map { it.toInt() })

    private fun LinkedList<Int>.reverseInt() = this.reversed().reduce { acc, i -> (acc.toString() + i.toString()).toInt() }
}