# TODO:

- [X] Player placing a ship
- [X] Shooting a player
- [ ] Player status
    - [ ] Placing
    - [ ] Ready
    - [ ] Dead
- [ ] Game setup (arranging pieces)
- [ ] Game turns, alternate between players
- [ ] Announce game status (winner, draw, in progress)
- [ ] Announcing hit / miss

# Unhappy paths

- [ ] Shooting the same square twice
- [ ] Ship squares should be unique
- [ ] Ship squares should be adjoining
- [ ] Ships cannot overlap
- [ ] Placing the same ships twice
- [ ] Placing more than 5 ships
- [ ] Player should have placed all 5 ships before playing

# Improvements

- [X] use booleans instead of type hierarchy on square
- [X] hide case class implementations to prevent creation of invalid invariants
    - [X] Square
    - [X] Ship
- [X] use mocks to make test setup simpler
- [ ] use map instead of set in grid to make access of squares easier
