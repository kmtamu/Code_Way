from Problems.LinkedList.LinkedList import LinkedList
#Numbers are entered in reverse order, one digit per node. Head at the least significant position.


def digitSum(num1, num2):
    temp1 = num1.head
    temp2 = num2.head
    carry =0
    Result = LinkedList()
    while(temp1!=None or temp2!=None):
        if temp1==None:
            data1=0
        else:
            data1=temp1.data
        if temp2==None:
            data2=0
        else:
            data2 = temp2.data
        Result.addNode((carry+data1+data2) % 10)
        if (carry+data1+data2)>=10:
            carry=1
        else:
            carry=0
        if temp1!=None:
            temp1 = temp1.nextNode
        if temp2!=None:
            temp2 = temp2.nextNode

    if carry==1:
        Result.addNode(carry)
    #The result will be printed in correct order. Head at the most significant position
    Result.displayNodes()



num1 = LinkedList()
num2 = LinkedList()
#num1 = 963
num1.addNode(9)
num1.addNode(6)
num1.addNode(3)
#num2 = 84
num2.addNode(8)
num2.addNode(4)
digitSum(num1,num2)


