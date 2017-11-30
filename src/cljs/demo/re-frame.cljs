(ns demo.re-frame
  (:require [re-frame.core :as rf]))

;; db
(def default-db
  {:page :home})



;;dispatchers

(rf/reg-event-db
  :initialize-db
  (fn [_ _]
    default-db))

(rf/reg-event-db
  :set-active-page
  (fn [db [_ page]]
    (assoc db :page page)))

(rf/reg-event-db
  :set-docs
  (fn [db [_ docs]]
    (assoc db :docs docs)))

;;subscriptions

(rf/reg-sub
 :initialized?
 (fn [db _]
   (not (empty? db))))

(rf/reg-sub
  :active-page
  (fn [db _]
    (:page db)))

(rf/reg-sub
  :docs
  (fn [db _]
    (:docs db)))
