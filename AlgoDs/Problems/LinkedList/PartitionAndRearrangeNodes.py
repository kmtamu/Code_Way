from Problems.LinkedList.LinkedList import LinkedList


def partitionAndRearrangeNodes(myll,x):
    Head1 = None
    Head2 =None
    temp1=None
    temp2 = None
    done1=None
    done2 = False
    current = myll.head
    while current!=None:
        if current.data >=x:
            if done1!=True:
                done1=True
                Head1=current
                temp1=current
                current=current.nextNode
            else:
                temp1.nextNode = current
                current = current.nextNode
                temp1=temp1.nextNode
        else:
            if done2!=True:
                done2 = True
                Head2=current
                temp2=current
                current=current.nextNode
            else:
                temp2.nextNode = current
                current=current.nextNode
                temp2=temp2.nextNode

    temp1.nextNode=Head2
    myll.head=Head1

myll2 = LinkedList()
#myll2.DisplayNodes()
myll2.addNode(9)
myll2.addNode(16)
myll2.addNode(6)
myll2.addNode(11)
myll2.addNode(15)
myll2.addNode(4)
myll2.addNode(2)
myll2.displayNodes()
partitionAndRearrangeNodes(myll2, 11)
myll2.displayNodes()