!function () {
    "use strict";
    var a = angular.module("ngNotify", []), b = !1;
    try {
        angular.module("ngSanitize") && (angular.module("ngNotify").requires.push("ngSanitize"), b = !0)
    } catch (c) {
    }
    var d = '<div class="ngn" ng-class="ngNotify.notifyClass" ng-style="ngNotify.notifyStyle"><span class="ngn-dismiss" ng-click="dismiss()">&times;</span><span ng-if="ngNotify.notifyHtml" ng-bind-html="ngNotify.notifyMessage"></span><span ng-if="!ngNotify.notifyHtml" ng-bind="ngNotify.notifyMessage"></span></div>';
    a.run(["$templateCache", function (a) {
        a.put("templates/ng-notify/ng-notify.html", d)
    }]), a.provider("ngNotify", function () {
        this.$get = ["$document", "$compile", "$log", "$rootScope", "$timeout", "$interval", "$templateCache", function (a, c, d, e, f, g, h) {
            var i, j, k = "", l = " ", m = 3e3, n = "ngn-sticky", o = 1, p = -1, q = 200, r = 500, s = 25, t = 0, u = 1, v = {
                theme: "pure",
                position: "bottom",
                duration: m,
                type: "info",
                sticky: !1,
                html: !1
            }, w = { notifyClass: "", notifyMessage: "", notifyStyle: { display: "none", opacity: t } }, x = {
                pure: k,
                prime: "ngn-prime",
                pastel: "ngn-pastel",
                pitchy: "ngn-pitchy"
            }, y = {
                info: "ngn-info",
                error: "ngn-error",
                success: "ngn-success",
                warn: "ngn-warn",
                grimace: "ngn-grimace"
            }, z = {
                bottom: "ngn-bottom",
                top: "ngn-top"
            }, A = e.$new(), B = c(h.get("templates/ng-notify/ng-notify.html"))(A);
            A.ngNotify = angular.extend({}, w), a.find("body").append(B);
            var C = function (a) {
                var b = a.type || v.type;
                return (y[b] || y.info) + l
            }, D = function (a) {
                var b = a.theme || v.theme;
                return (x[b] || x.pure) + l
            }, E = function (a) {
                var b = a.position || v.position;
                return (z[b] || z.bottom) + l
            }, F = function (a) {
                var b = a.duration || v.duration;
                return angular.isNumber(b) ? b : m
            }, G = function (a) {
                var b = void 0 !== a.sticky ? a.sticky : v.sticky;
                return b ? !0 : !1
            }, H = function (a) {
                if ((a.html || v.html) && !b)return d.debug("ngNotify warning: \ngSanitize couldn't be located.  In order to use the 'html' option, be sure the ngSanitize source is included in your project."), !1;
                var c = void 0 !== a.html ? a.html : v.html;
                return c ? !0 : !1
            }, I = function (a, b) {
                var c = C(a) + D(a) + E(a);
                return c += b ? n : k
            }, J = function () {
                A.ngNotify = angular.extend({}, w)
            }, K = function (a, b, c, d) {
                var e = s / c;
                A.ngNotify.notifyStyle = { display: "block", opacity: b };
                var f = function () {
                    b += a * e, A.ngNotify.notifyStyle.opacity = b, (t >= b || b >= u) && (g.cancel(j), j = !1, d())
                };
                j || (j = g(f, s))
            }, L = function (a, b) {
                K(p, u, a, b)
            }, M = function (a, b) {
                K(o, t, a, b)
            };
            return A.dismiss = function () {
                L(r, function () {
                    J()
                })
            }, {
                config: function (a) {
                    a = a || {}, angular.extend(v, a)
                }, set: function (a, b) {
                    if (a) {
                        g.cancel(j), j = !1, f.cancel(i);
                        var c = {};
                        "object" == typeof b ? c = b : c.type = b;
                        var d = G(c), e = F(c);
                        angular.extend(A.ngNotify, {
                            notifyHtml: H(c),
                            notifyClass: I(c, d),
                            notifyMessage: a
                        }), M(q, function () {
                            d || (i = f(function () {
                                A.dismiss()
                            }, e))
                        })
                    }
                }, dismiss: function () {
                    A.dismiss()
                }, addTheme: function (a, b) {
                    a && b && (x[a] = b)
                }, addType: function (a, b) {
                    a && b && (y[a] = b)
                }
            }
        }]
    })
}();
//# sourceMappingURL=ng-notify.min.js.map