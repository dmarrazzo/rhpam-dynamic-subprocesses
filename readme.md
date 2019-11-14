Subprocesses
=======================

How to dynamically call a subprocess from another process.

Usage
-----------------------
Start the main process and pass as process id one of the two childs:

- `subproc.child1`
- `subproc.child2`

Code Snippet
-----------------------

```java
kcontext.getKieRuntime().startProcess(processId, params);
```