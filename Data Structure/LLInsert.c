#include<stdio.h>
#include<stdlib.h>

struct LinkedList
{
    int value;
    struct LinkedList *next;
};
struct LinkedList *list;
int length=0;

void insertfirst(int n)
{
    extern struct LinkedList *list;
    struct LinkedList *x=(struct LinkedList*)malloc(sizeof(struct LinkedList));
    x->value=n;
    if(length==0)
    {
        x->next=NULL;
        list=x;
    }
    else
    {
        x->next=list;
        list=x;
    }
    length++;
}

int deletefirst()
{
    extern struct LinkedList *list;
    int n;
    if(length==0)
    {
        printf("Linked List is empty .\n");
        return 0;
    }
    if(length==1)
    {
        n=list->value;
        length--;
        list=NULL;
    }
    else
    {
        n=list->value;
        length--;
        list=list->next;
    }
    return n;
}

void insertlast(int n)
{
    extern struct LinkedList *list;
    struct LinkedList *x;
    struct LinkedList *y=(struct LinkedList*)malloc(sizeof(struct LinkedList));
    y->value=n;
    y->next=NULL;
    
    if(length==0)
    {
        list=y;
        length++;
        return;
    }
    x=list;
    while(x->next!=NULL)
    {
        x=x->next;
    }
    x->next=y;
    length++;
}

int deletelast()
{
    extern struct LinkedList *list;
    int n,i;
    struct LinkedList *node;
    if(length==0)
    {
        printf("Linked List is empty .\n");
        return 0;
    }
    if(length==1)
    {
        n=list->value;
        length--;
        list=NULL;
    }
    else
    {
        node=list;
        for(i=1;i<length-1;i++)
        {
            node=node->next;
        }
        n=node->next->value;
        node->next=NULL;
        length--;
    }
    return n;
}

void insertposition(int n,int p)
{
    if(p>length+1||p<=0)
    {
        printf("Invalid Position.\n");
        return;
    }

    int i=0;
    extern struct LinkedList *list;
    struct LinkedList *y=(struct LinkedList*)malloc(sizeof(struct LinkedList));
    struct LinkedList *t;
    y->value=n;
    y->next=NULL;
    if(length==0)
    {
        length++;
        list=y;
        return;
    }

    struct LinkedList *x=list;
    while(x->next!=NULL)
    {
        i++;
        if(i==p-1)
        {
            break;
        }
        x=x->next;
    }
    t=x->next;
    y->next=t;
    x->next=y;
    length++;
}

int deleteposition(int p)
{
    extern struct LinkedList *list;
    int n,i;
    struct LinkedList *node;
    if(p>length||p<=0)
    {
        printf("Invalid position . \n");
    }
    if(length==0)
    {
        printf("Linked List is empty .\n");
        return 0;
    }
    if(length==1&&p==1)
    {
        n=list->value;
        length--;
        list=NULL;
    }
    else if(p==1)
    {
        n=list->value;
        length--;
        list=list->next;
    }
    else if(p==length)
    {
       return deletelast();
    }
    else
    {
        node=list;
        for(i=1;i<p-1;i++)
        {
            node=node->next;
        }
        n=node->next->value;
        node->next=node->next->next;
        length--;
    }
    return n;
}

void print()
{
    if(length==0)
    return;
    extern struct LinkedList *list;
    struct LinkedList *x=list;
    printf("[ ");
    while(x->next!=NULL)
    {
        printf("%d , ",x->value);
        x=x->next;
    }
    printf("%d , ",x->value);
    printf("\b\b]\n");
}

void help()
{
    printf("0 : insert at first position \n");
    printf("1 : insert at last position \n");
    printf("2 : insert at any position \n");
    printf("3 : delete from first position \n");
    printf("4 : delete from last position \n");
    printf("5 : delete from any position \n");
    printf("6 : display the list \n");
    printf("7 : help \n");
    printf("8 : clear \n");
    printf("else : exit \n");
}

int main()
{
    int x,n,p;
    help();
    start:
    
    scanf("%d",&x);
    switch(x)
    {
        case 0:
            printf("Enter a value : ");
            scanf("%d",&n);
            insertfirst(n);
        break;
        case 1:
            printf("Enter a value : ");
            scanf("%d",&n);
            insertlast(n);
        break;
        case 2:
            printf("Enter a value : ");
            scanf("%d",&n);
            printf("Enter a position :");
            scanf("%d",&p);
            insertposition(n,p);
        break;
        case 3:
            printf("Get : %d \n",deletefirst());
        break;
        case 4:
            printf("Get : %d \n",deletelast());
        break;
        case 5:
            printf("Enter position : ");
            scanf("%d",&p);
            printf("Get : %d\n",deleteposition(p));
        break;
        case 6:
            print();
        break;
        case 7:
            help();
        break;
        case 8:
            system("cls");
        break;
        default:
        goto end;
    }   
    goto start;
    end:; 
    return 0;
}