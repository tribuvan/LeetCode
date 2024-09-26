class Solution(object):
    def isPalindrome(self, n):
        if n < 0:
            return False
        else:
            n1=n
            s=0
            while(n>0):
                r=n%10 
                s=s*10+r
                n=n//10
            if(s==n1):
                return True
        