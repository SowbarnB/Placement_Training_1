#include <bits/stdc++.h>
using namespace std;

void swap(int a, int b)
{
    int temp = a;
    a = b;
    b = temp;

    cout << "Swapping Method: " << a << ' ' << b << endl;
}

int findMax(int *arr, int n)
{
    int max = *arr;

    for (int i = 1; i < n; i++)
    {
        if (*(arr + i) > max)
        {
            max = *(arr + i);
        }
    }

    return max;
}

int SumArr(int *arr, int n)
{
    int sum = 0;

    for (int i = 0; i < n; i++)
    {
        sum = sum + *(arr + i);
    }

    return sum;
}

void reverseword(char *str, int lenStr)
{
    char *start = str;
    char *end = str + lenStr - 1;

    while (start < end)
    {
        char temp = *start;
        *start = *end;
        *end = temp;
        start++;
        end--;
    }
}

void copy(char *str, char *duplicate)
{
    while (*str != '\0')
    {
        *duplicate = *str;
        str++;
        duplicate++;
    }
    *duplicate = '\0';
}

double AvgArr(int *arr, int n)
{
    double sum = SumArr(arr, n);
    return sum / n;
}

bool search(char *str, char target, int lenStr)
{
    for (int i = 0; i < lenStr; i++)
    {
        if (*(str + i) == target)
        {
            return true;
        }
    }
    return false;
}

int SearchElement(int *arr, int targetele, int n)
{
    for (int i = 0; i < n; i++)
    {
        if (*(arr + i) == targetele)
        {
            return 1;
        }
    }

    return 0;
}
void factorial(int n)
{
    int fact = 1;
    
    for(int i = 1; i <= n; i++)
    {
        fact = fact * i;
    }
    cout << "Iterative approach: Factorial of " << n << " is: ";
    cout << fact << endl;
}
int recursivefactorial(int n)
{
    if(n == 0 || n == 1) return 1;
    
    return n * recursivefactorial(n - 1);
}

void fibonacci(int n)
{
    cout << "Fibonacci Series for " << n << " is: ";
    int term1 = 0, term2 = 1;
    cout << term1 << " " << term2 << " ";
    for(int i = 2; i <= n; i++)
    {
        int term3 = term1 + term2;
        cout << term3 << " ";
        term1 = term2;
        term2 = term3;
    }
    cout << endl;
}
bool isVowel(char ch)
{
    return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
}

void countVowels(string str)
{
    int count = 0;
    for(int i = 0; i < str.size(); i++)
    {
        if(isVowel(str[i]))
        {
            count++;
        }
    }
    cout << "Number of Vowels in " << str << " is: " << count << endl;
}
int main()
{
    int a, b;
    cin >> a >> b;

    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    char str[100];
    cin >> str;
    int lenStr = strlen(str);

    char target;
    cin >> target;

    int targetele;
    cin >> targetele;

    char duplicate[100];

    swap(a, b);
    cout << "Finding Maximum Element Method: " << findMax(arr, n) << endl;
    cout << "Sum of the array: " << SumArr(arr, n) << endl;
    copy(str, duplicate);
    cout << "Copying the Array: " << duplicate << endl;
    reverseword(str, lenStr);
    cout << "Reversing the word: " << str << endl;
    cout << "Average of the Array: " << AvgArr(arr, n) << endl;
    cout << "Searching the Character: ";

    if (search(str, target, lenStr))
    {
        cout << "true" << endl;
    }
    else
    {
        cout << "false" << endl;
    }
    cout << "Searching the Number: ";;
    if (SearchElement(arr, targetele, n))
    {
        cout << "true" << endl;
    }
    else
    {
        cout << "false" << endl;
    }
    factorial(5);
    cout << "Recursive approach: Factorial of 5 is: " << recursivefactorial(5) << " " << endl;
    fibonacci(5);
    countVowels("rhythm");
}
