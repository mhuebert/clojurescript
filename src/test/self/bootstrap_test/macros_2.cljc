(ns bootstrap-test.macros-2)

(defmacro wrap [expr]
  `[:wrapped ~expr])
