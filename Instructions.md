1. Write the method `buyDrink` that is missing from Main. It should take a `Student` as a parameter and remove 2.50 from `moneyInPocket`.

2. Add a new variable `cansOfRockstarRequiredForLecture` to `Student`. Change `buyDrink` to add 1 to cansOfRockstarRequiredForLecture each time it is called.

3. Modify `main` to print out the amount of money each student has (and the number of cans of Rockstar they require) at the end of the method.

4. Create a `Bar` *object* at the top of `main`.
     ```java
     Bar bar = new Bar();
     ```
5. Modify `buyDrink` to take a `Bar` as a parameter and add 2.50 to its `takings` every time a drink is bought.
