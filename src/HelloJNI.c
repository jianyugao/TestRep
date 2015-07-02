#include <jni.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "jni2_jni2.h"
JNIEXPORT void JNICALL Java_jni2_jni2_readFile
  (JNIEnv *env, jobject obj){
  system("ls /dev/ttyS* > /home/gary/github/TestRep/src/test.txt");
  //system("ls /home/gary > /home/gary/Desktop/mytest.txt");
  char line[30];
  int i =0;
  char uart_port[100][30];
  FILE *fp;
  fp = fopen("test.txt","r");
  if(fp == NULL){
	  	printf("Error while opening the file\n");
	exit(EXIT_FAILURE);	  	
  }
  while(fgets ( line, sizeof line, fp ) != NULL)
  	{
  		strcpy(uart_port[i], line);
  		printf("%s", uart_port[i]);
  		i++;
  	}
  		
  		
  fclose(fp);
  return;

  }