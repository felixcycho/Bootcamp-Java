#  Data Structure

## ArrayList (List)
-  with order
-  allow duplicated objects
-  faster to access (i.e. get(index)) an identified object/address, especially for middle object / address
-  faster to add an object to the last address (i.e. addLast(Object))
-  but if add / remove an object in middle address (i.e. remove(Object)), still need to for-loop.

## LinkedList (Deque / Queue / List)
-  with order
-  allow duplicated objects
-  faster to replace or remove (i.e. poll first / poll last) head or tail (java LinkedList --> double LinkedList)
-  no need to for-loop all addresses when remove head or tail object
-  but still need to for-loop if to replace or remove middle objects

## ArrayDeque (Deque / Queue)
-  with order
-  allow duplicated objects
-  for Deque, faster to add / remove an object to the last address (i.e. addLast(Object))

## HashSet (Set)
-  No order
-  disallow duplicated objects
-  Underlying data structure (Array? LinkedList?)

## HashMap (Map)
-  No order
-  Entry (Key + Value)
-  Underlying data structure (Array? LinkedList?)