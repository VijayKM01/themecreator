(ns app.db
  (:require [reagent.core :as r]))

(def preset
  {:themename "preset"
   :mainbg "#ffffff"
   :mainfg "#303030"
   :builtin "#000000"
   :keyword "#000000"
   :string  "#000000"
   :functionname "#000000"
   :variable "#000000"
   :type "#000000"
   :constant "#000000"
   :comment "#606060"
   :warning "#ff0000"
   :warning2 "#ff8800"
   :name "atc"})

(def white-sand
  {:themename "white-sand"
   :mainbg  "#f5ebe1"                ;
   :mainfg  "#585858"
   :keyword  "#4a858c"
   :builtin  "#1a8591"
   :string  "#b3534b"
   :functionname  "#bd745e"
   :variable  "#476238"
   :type  "#8c4a79"
   :constant  "#697024"
   :comment  "#a9a9a9"
   :warning  "#ff1276"
   :warning2  "#ff4d12"})

(def warm-night
  {:themename "warm-night"
   :mainbg "#292424"
   :mainfg "#b1b1b1"
   :keyword "#96905f"
   :builtin "#71a46c"
   :string "#71a19f"
   :functionname "#b680b1"
   :variable "#c27d7b"
   :type "#8b8fc6"
   :constant "#bd845f"
   :comment "#5d5a58"
   :warning "#e81050"
   :warning2 "#e86310"})

(def oldlace
  {:themename "Oldlace"
   :mainfg "#525252"
   :mainbg "#fdf5e6"
   :keyword "#3f567b"
   :builtin "#7b4135"
   :string "#305f5e"
   :functionname "#714355"
   :variable "#3f5b32"
   :type "#634575"
   :constant "#64502f"
   :comment "#949494"
   :warning "#fa0c0c"
   :warning2 "#fa7b0c"})

(def greymatters
  {:themename "Greymatters"
   :mainfg "#2f2f2f"
   :mainbg "#f9fbfd"
   :keyword "#3f567b"
   :builtin "#7b4135"
   :string "#305f5e"
   :functionname "#714355"
   :variable "#3f5b32"
   :type "#634575"
   :constant "#64502f"
   :comment "#949494"
   :warning "#fa0c0c"
   :warning2 "#fa7b0c"})

(def soft-charcoal
  {:themename "soft-charcoal"
   :mainfg "#c2c2c2"
   :mainbg "#191919"
   :keyword "#8aa234"
   :builtin "#54686d"
   :string "#5d90cd"
   :functionname "#7a8bbd"
   :variable "#8885b2"
   :type "#8aa6c1"
   :constant "#8aa6c1"
   :comment "#808080"
   :warning "#ff6523"
   :warning2 "#ff2370"})

(def contrastcolors
  [:mainfg :keyword :builtin :string :functionname :variable :type
   :constant :comment])

(def randomcolors
  [:keyword :builtin :string :functionname :variable :type :constant])


(def app-db
  (r/atom
   warm-night))

(def adjustbg
  (r/atom
   false))


(defn switch-theme
  [theme]
  (reset! app-db theme ))

(defn toggle-adjust []
  (reset! adjustbg (not @adjustbg)))



;; (def storagename "mswift42morethemes")

;; (defn save-to-storage
;;   []
;;   (.setItem (.-localStorage js/window) storagename (clj->js @app-db)))

;; (defn load-from-storage
;;   []
;;   (switch-theme (.getItem (.-localStorage js/window) storagename)))




