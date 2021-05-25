# Recommender-Pyspark-ALS

Recommender system is an information filtering tool which predict what user likes. This project recommends the movie type for the users according to the movies they prefer.

### Content base filtering(CBF)
recommends the ithems similar to the items previously liked and reviewed by the user. To apply CBF doesn't need a strong user base. 

### Collaborative Filtering (CF)
CF aggregates the past behaviours of all users. This recommendation based on the items liked by another set of users. It's a user-user based CF. 

## ALS model

Alternating Least Squares (ALS) is a the model we’ll use to fit our data and find similarities. But before we dive into how it works we should look at 
some of the basics of matrix factorization which is what we aim to use ALS to accomplish.


npnnegative = True because this will look into ratings greater than 0. And work with xplicit ratings. 
