## Unit testing

Unit test tests a unit of code (methods)

##### Goals:
* correctness of new functionality
* correctness of old features after new functionlity is implemented or code was refactored
* can uncover design issues
* provide additional documentation to the code

##### Unit test needs to be
* _Fast_ - there can be a lot of tests, make them fast
* _Independet_ - test must not depend on each other's state/results
* _Repeatable_ - always gives the same result
* _Self-determinating_ - can decide about itself if test is successful
* _Timely_ - write test when you implement something, not later

##### Some general advices:
* use an existing testing framework, don't write your own
* don't mix testing frameworks
* read the documention of the framework

##### Mocking:
* replace external dependecies with mocks (fake object with defined behavior)
* use mock framework for this
* don't mock core language elements, unless they call external sources (databases, webservices)
* only verify behavior if it's critical, otherwise you get overcompilcated tests (hard to maintain)
