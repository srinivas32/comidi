(defproject puppetlabs/comidi "0.3.3-SNAPSHOT"
  :description "Puppet Labs utility functions and compojure-like wrappers for use with the bidi web routing library"
  :url "https://github.com/puppetlabs/comidi"

  :pedantic? :abort

  :min-lein-version "2.7.1"

  :parent-project {:coords [puppetlabs/clj-parent "1.6.0"]
                   :inherit [:managed-dependencies]}

  :dependencies [[org.clojure/clojure]

                 [bidi "2.1.3"]
                 [compojure]
                 [prismatic/schema]
                 [puppetlabs/kitchensink]]

  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/clojars_jenkins_username
                                     :password :env/clojars_jenkins_password
                                     :sign-releases false}]]

  :plugins  [[lein-parent "0.3.1"]])
