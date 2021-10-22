## Geometry Dash

You are designing a simplified version of the popular game Geometry Dash. The game involves moving from the start of a level to the end of the level. Each level involves solid tiles denoted by `_` that are safe to step on. And then there are some tiles that are dangerous, denoted by `^`. Each level consists on `N` tiles numbered `0` through `N-1` and the goal is to reach tile `N-1` without stepping on any of the dangerous tiles.

At each time unit, a player can stay on the same tile (denoted by `0`), move to the immediate next tile (such a move is denoted by a `1`), hop two tiles (such a move is denoted by a `2` and the player moves from tile `i` to tile `i+2`) or jump three tiles (such a move is denoted by a `3` and the player moves from tile `i` to `i+3`).

To complete a level, a player starts on tile `0` and must end on tile `N-1`.

### Task 1

Given a level (represented by a `String` that consists of only `_` and `^` characters) and a play (also represented by a `String` that represents the moves a player makes, and consists only of the characters `0`, `1`, `2` and `3`), determine if the play is successful (the player completes the level) or not.

Note that the cases where a level starts or ends with a `^` are (clearly) not playable.

Here is an [animation](ppt_animated.gif) that approximates the game play.

### Task 2

Suppose a player starts with energy `E` (`E` units) and moves `1`, `2` and `3` consume 1, 2 and 3 units of energy, respectively. Each `0` move allows a player to regain one unit of energy. However, a `0` move can be played only if the current energy is less than 3 units. Moreover, a player's energy should never fall below 0 units.

For this task, a level may also have a special tile, denoted `*`, that teleports a player 4 tiles ahead for no extra energy cost (if tile `i` is a `*` then a player that lands on this tile would immediate be teleported to tile `i+4`).

Given a set of possible plays, a starting energy `E` and a target resting energy `Er`, return the subset of plays that will allow a player to successfully complete the level with `Er` or more units of energy remaining. Once a player reaches tile `N-1` then no further moves are possible; a player cannot keep playing the `0` move at tile `N-1` to reach energy `Er`.

For the special `*` tiles, if the teleportation will place one outside the level then landing on such a tile would not be a successful play.

You can also assume that the starting energy and the target resting energy will be at least 0.

### Task 3

Task 3 builds on the requirements outlined in Task 2.

1.   Given the representation of a level, with the energy requirements, the `*` tiles, and a target resting energy of `Er`, determine the shortest play (and return a corresponding `String`) that would allow a player to complete the level. In the case that the level cannot be completed, throw an `UnplayableLevelException`. When there are multiple plays that are equally short, any one of those plays can be returned.
2.   Determine the number of plays (not just the shortest play) that would allow a player to complete a given level with a target resting energy `Er` or higher.

For Task 3, your implementation must be reasonably fast. For instance `test_shortestPlay2()` should not take more than 8 seconds to complete on a machine with 2GB RAM and a 1GHz CPU.

## Submission Instructions

+ Submit your work to the Github classroom repository that was created for you.
+ **Do not alter the directory/folder structure. You should retain the structure as in this repository.**
+ Do not wait until the last minute to push your work to Github. It is a good idea to push your work at intermediate points as well. _We would recommend that you get your Git and Github workflow set up at the start._
+ You should submit your work to the `main` branch.

## What Should You Implement / Guidelines

+ You should implement all the methods that are indicated with `TODO`.
+ Passing the provided tests is the minimum requirement. Use the tests to identify cases that need to be handled. Passing the provided tests is *not sufficient* to infer that your implementation is complete and that you will get full credit. Additional tests will be used to evaluate your work. The provided tests are to guide you.
+ You can implement additional helper methods if you need to but you should keep these methods `private` to the appropriate classes.
+ You do not need to implement new classes.
+ You can use additional **standard** Java libraries by importing them.
+ Do not throw new exceptions unless the specification for the method permits exceptions.

## Honour Code

By submitting your work to Github you agree to the following:

+ You did not consult with any other person for the purpose of completing this activity.
+ You did not aid any other person in the class in completing their activity.
+ If you consulted any external sources, such as resources available on the World Wide Web, in completing the examination then you have cited the source. (You do not need to cite class notes or Sun/Oracle Java documentation.)
+ You are not aware of any infractions of the honour code for this activity.