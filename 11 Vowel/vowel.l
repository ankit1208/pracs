%{

#include<stdio.h>
%}

%%
[aeiouAEIOU]+ { printf("Is a Vowel.");}
. {printf("not a vowel, consonant");}
%%

int main()
{
	printf("Enter a letter to check whether its a vowel or not\n");
	yylex();
    return 0;
}



