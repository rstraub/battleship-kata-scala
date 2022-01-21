# TODO:

- [X] Player placing a ship
- [X] Shooting a player
- [ ] Player status
    - [X] Sunk
    - [ ] Arranged
- [ ] Game setup (arranging pieces)
- [ ] Game turns, alternate between players
- [ ] Announcing hit / miss
- [ ] Announce game status (winner, draw, in progress)

# Unhappy paths

- [ ] Shooting the same square twice
- [ ] Ship squares should be unique
- [ ] Ship squares should be adjoining
- [ ] Ships cannot overlap
- [ ] Placing the same ships twice
- [ ] Placing more than 5 ships
- [ ] Player should have placed all 5 ships before playing

# Improvements

- [ ] use booleans instead of type hierarchy on square
- [ ] hide case class implementations to prevent creation of invalid invariants
    - [ ] Grid
    - [ ] Ship
- [X] use mocks to make test setup simpler
