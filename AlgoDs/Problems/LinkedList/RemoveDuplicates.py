from Problems.LinkedList.LinkedList import LinkedList
from Problems.LinkedList.Node import Node


def removeDuplicate(myll):
    tmp=myll.head
    tmp2=tmp.nextNode
    while tmp2 != None:
        if tmp.data == tmp2.data:
            tmp.nextNode = tmp2.nextNode
            tmp2 = tmp2.nextNode
        else:
            tmp = tmp.nextNode
            tmp2 = tmp2.nextNode

myll = LinkedList()
myll.addNode(11)
myll.addNode(11)
myll.addNode(11)
myll.addNode(0)
myll.addNode(19)
myll.addNode(1)
myll.addNode(1)
myll.addNode(188)
myll.displayNodes()
removeDuplicate(myll)
myll.displayNodes()