from Problems.LinkedList.LinkedList import LinkedList
from Problems.LinkedList.Node import Node


def RemoveDuplicate(myll):
<<<<<<< HEAD
    tmp=myll.head
    tmp2=tmp.nextNode
    while tmp2 != None:
        if tmp.data == tmp2.data:
            tmp.nextNode = tmp2.nextNode
            tmp2 = tmp2.nextNode
        else:
            tmp = tmp.nextNode
            tmp2 = tmp2.nextNode
=======
	tmp = myll.head
	tmp2 = myll.head.nextNode
	while tmp2!=None:
		if tmp.data == tmp2.data:
			tmp.nextNode = tmp2.nextNode
			tmp2 = tmp2.nextNode
		else:
			tmp=tmp.nextNode
			tmp2=tmp2.nextNode
        
>>>>>>> origin/master

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
