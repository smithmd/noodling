(ns noiseparticles.routes.home
  (:use compojure.core)
  (:require [noiseparticles.layout :as layout]
            [noiseparticles.util :as util]))

(defn home-page []
  (layout/render
    "home.html" {:content (util/md->html "/md/docs.md")}))

(defn about-page []
  (layout/render "about.html"))

(defn resume-page []
  (layout/render
    "resume.html" {:content (util/md->html "/md/resume.md")}))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page))
  (GET "/resume" [] (resume-page)))
