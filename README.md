## Geometry Dash

You are designing a simplified version of the popular game Geometry Dash. The game involves moving from the start of a level to the end of the level. Each level involves solid tiles denoted by `_` that are safe to step on. And then there are some times that are dangerous, denoted by `^`. Each level consists on `N` tiles numbered `0` through `N-1` and the goal is to reach tile `N-1` without stepping on any of the dangerous tiles.

At each time unit, a player can stay on the same time (denoted by `0`), move to the immediate next tile (such a move is denoted by a `1`), hop two tiles (such a move is denoted by a `2` and the player moves from tile `i` to tile `i+2`) or jump three tiles (such a move is denoted by a `3` and the player moves from tile `i` to `i+3`).

To complete a level, a player starts on tile `0` and must end on tile `N-1`.

### Task 1

Given a level (represented by a `String` that consists of only `_` and `^` characters) and a play (also represented by a `String` that represents the moves a player makes, and consists only of the characters `0`, `1`, `2` and `3`), determine if the play is successful (the player completes the level) or not.

### Task 2

Suppose a player starts with energy level `E` (`E` units) and moves `1`, `2` and `3` consume 1, 2 and 3 units of energy, respectively. Each move `0` allows a player to regain one unit of energy. For this task, a level may also have a special tile, denoted `*`, that teleports a player 4 tiles ahead for no extra energy cost (if tile `i` is a `*` then a player that lands on this tile would immediate be teleported to tile `i+4`).

Given a set of possible plays, a target resting energy `Er`, return the subset of plays that will allow a player to successfully complete the level with `Er` units of energy remaining. Once a player reaches tile `N-1` then no further moves are possible so a player cannot keep playing the `0` move at tile `N-1` to reach energy level `Er`.

### Task 3

1.   Given the representation of a level, with the energy requirements, the `*` tiles, and a target resting energy of `Er`, determine the shortest play (and return a corresponding `String`) that would allow a player to complete the level. In the case that the level cannot be completed, throw an `UnplayableLevelException`.
2.   Determine the number of plays (not just the shortest play) that would allow a player to complete a given level with a target resting energy `Er`.