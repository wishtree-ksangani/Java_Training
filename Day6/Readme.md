# Synchronization

- Synchronized block
    - lock on the object
- Synchronized method
    - lock on the object
- Static synchronization
    - lock on the casss

### When to use the Synchronized
- For objet it is using the shared lock mechenism and while we are going to synchronize the method it will goint to lock the whole object.
- so try to use synchronized on the critical section only.

### Volatile
- The values of the volatile variable will never be cached and all writes and reads will be done to and from the main memory.
- Real-time application :- for defining flags.

### Atomic
- Realtime application :- For variables

### Synchronized
- for critical operations
---
### Deadlock
- Bankers Algorithm for safe sequence
- conditions for the deadlock
    - mutual exclusion
    - hold and wait
    - circular wait
    - No Preamption

### ReentrantLock
- lock()
- unlock()
- trylock()
- tryLock(tmeout, timeunit)