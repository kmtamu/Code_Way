from Problems.LinkedList.Node import Node
class LinkedList:
    def __init__(self):
        self.head=None
        self.length=0

    def AddNode(self,temp):
        tmp = Node(temp)
        if self.head==None:
            self.head = tmp
            self.length=1
        else:
            tmp.nextNode = self.head
            self.head=tmp

    def DisplayNodes(self):
        tmp=self.head
        while tmp!=None:
            print tmp.data
            tmp=tmp.nextNode
