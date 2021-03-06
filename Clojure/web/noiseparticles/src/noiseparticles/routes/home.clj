(ns noiseparticles.routes.home
  (:use compojure.core)
  (:require [noiseparticles.layout :as layout]
            [noiseparticles.util :as util]))

(defn home-page []
  (layout/render
    "home.html" {:content (util/md->html "/md/docs.md")}))

(defn about-page []
  (layout/render "about.html"))

(defn dice-page []
  (layout/render "dice.html"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page))
  (GET "/dice" [] (dice-page)))
