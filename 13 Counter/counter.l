%{ 
int linecount = 0, charcount = 0, wordcount = 0; 
%} 
 
%% 

([a-zA-Z0-9])*    {wordcount++; charcount += strlen(yytext);}
\n { linecount++; } 
. { charcount++; } 




%% 
 
void main() 
{ 
 yylex(); 
 printf("# of lines = %d, # of chars = %d, # of words = %d", linecount, charcount,wordcount);  
} 