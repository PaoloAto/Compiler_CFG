public class Visitor extends gBaseVisitor<Object> {

    @Override public Object visitPrule(gParser.PruleContext ctx) {

        return visitChildren(ctx);
    }

    @Override public Object visitS(gParser.SContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitC(gParser.CContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitR(gParser.RContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitO(gParser.OContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitN(gParser.NContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitD(gParser.DContext ctx) {
        return visitChildren(ctx);
     }

}
