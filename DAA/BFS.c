#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node* left;
    struct node* right;
};

struct Node* createNode(int data){
    struct node* newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

void preOrder(struct node* root){
    if (root!=NULL)
    {
        printf("%d\n", root->data);
        preOrder(root->left);
        preOrder(root->right);
    }
}

void inOrder(struct node* root){
    if (root!=NULL)
    {
        inOrder(root->left);
        printf("%d\n", root->data);
        inOrder(root->right);
    }
}

void postOrder(struct node* root){
    if(root!=NULL){
        postOrder(root->left);
        postOrder(root->right);
        printf("%d\n", root->data);
    }
}

int main(){
    struct node* root = createNode(6);
    root->left = createNode(2);
    root->left->left = createNode(1);
    root->left->right = createNode(3);
    root->right = createNode(7);
    root->right->left = createNode(6);
    root->right->right = createNode(8);

    printf("PRE ORDER TRAVERSAL : \n");
    preOrder(root);

    printf("INORDER TRAVERSAL: \n");
    inOrder(root);

    printf("POSTORDER TRAVERSAL: \n");
    postOrder(root);


    return 0;

}
