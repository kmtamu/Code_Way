from Problems.LinkedList.LinkedList import LinkedList
from Problems.LinkedList.Node import Node


def RemoveDuplicate(myll):
    tmp=myll.head
    tmp2=tmp.nextNode
    if tmp.data == tmp2.data:
        

myll = LinkedList()
myll.AddNode(11)
myll.AddNode(11)
myll.AddNode(11)
myll.AddNode(0)
myll.AddNode(19)
myll.AddNode(1)
myll.AddNode(1)
myll.AddNode(188)
myll.DisplayNodes()
RemoveDuplicate(myll)
myll.DisplayNodes()