(ns ^:figwheel-no-load demo.app
  (:require [demo.core :as core]
            [devtools.core :as devtools]))

(enable-console-print!)

(devtools/install!)

(core/init!)
