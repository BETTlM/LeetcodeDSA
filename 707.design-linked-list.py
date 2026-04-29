#
# @lc app=leetcode id=707 lang=python
#
# [707] Design Linked List
#

# @lc code=start
class Node:
    def __init__(self, val=0, nextNode=None):
        self.val = val
        self.next = nextNode


class MyLinkedList:
    def __init__(self):
        self.head = Node(0)  # dummy node
        self.size = 0

    def get(self, index):
        if index >= self.size:  # invalid index
            return -1

        cur = self.head
        for _ in range(index + 1):
            cur = cur.next
        return cur.val

    def addAtHead(self, val):
        self.addAtIndex(0, val)

    def addAtTail(self, val):
        self.addAtIndex(self.size, val)

    def addAtIndex(self, index, val):
        if index > self.size:  # invalid index
            return

        prev = self.head
        for _ in range(index):
            prev = prev.next

        # Add newNode between [prev] and [prev.next]
        newNode = Node(val, prev.next)
        prev.next = newNode
        self.size += 1

    def deleteAtIndex(self, index):
        if index >= self.size:  # invalid index
            return

        prev = self.head
        for _ in range(index):
            prev = prev.next

        prev.next = prev.next.next
        self.size -= 1


# Your MyLinkedList object will be instantiated and called as such:
# obj = MyLinkedList()
# param_1 = obj.get(index)
# obj.addAtHead(val)
# obj.addAtTail(val)
# obj.addAtIndex(index,val)
# obj.deleteAtIndex(index)
# @lc code=end

