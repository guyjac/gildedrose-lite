# Gilded Rose starting position in Java

## Intro
GildedRose is an inventory system that updates daily.
It contains special items (Brie, Backstage Passes, Sulfuras), and normal items (everything else).

All Items contain the properties: Sellin and Quality. 

## Your task
The inventory system has been 'vibe coded' by an overly eager project manager, and it is
your task to refactor it.

You are expected to (in any order):
- Refactor and improve the `GildedRose` class in any way you see fit
- Implement unit tests in the `UnitTests` for Items handled inventory system

You may not:
- Refactor or alter the Item class
- Refactor or alter any `BaselineFixture` or `VerifyOutput`

## Verifying the application output
You can verify that your changes have not broken anything by running the test `VerifyOutput`.
Tip: If something has broken, you can click the 'view differences' button to investigate what.

## Hints
The following unit tests may be useful:

- Quality & SellIn for normal items
- Quality & SellIn for special items
- Quality once the sell-in date has passed
- The Quality of Brie 
- The Quality of backstage passes 