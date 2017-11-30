(ns demo.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [demo.core-test]))

(doo-tests 'demo.core-test)

