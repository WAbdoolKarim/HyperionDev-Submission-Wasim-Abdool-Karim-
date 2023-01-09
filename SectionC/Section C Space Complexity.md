## HyperionDev Freelance Code Reviewer Take-Home Test
# Section C, Report

My solution utilises 4 variables, ISBNCode, sum, num13, and last. ISBNCode and num13 are at most 13 digit strings since ISBNCode is the input and num13 is used to store the temporary isbn13 version of an isbn10 input. sum and last are integer values relating to the sum of products necessary for validation and conversion, and the check digit for conversion. The program only takes one input at a time which limits the memory use further.

As a result the space complexity of my solution is O(1).