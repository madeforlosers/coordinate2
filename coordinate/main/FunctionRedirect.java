package coordinate.main;

import java.util.ArrayList;

/*  
 *  COORDINATE LANGUAGE
 *  by madeforlosers 2026
 *  
 *  FunctionRedirect.java
 *      Redirects for the functions
 * 
 *  TODO:
 *      error catch
 *      comment code more
*/

public class FunctionRedirect {
    public static void wait(Long milliseconds) {
        coordinate.main.Functions.Program.Timing.wait(milliseconds);
    }

    public static Object push(Long item) {
        return coordinate.main.Functions.Program.Tape.Setting.push(item);
    }

    public static Object push(Double item) {
        return coordinate.main.Functions.Program.Tape.Setting.push(item);
    }

    public static Object push(String item) {
        return coordinate.main.Functions.Program.Tape.Setting.push(item);
    }

    public static Object push(ArrayList<?> item) {
        return coordinate.main.Functions.Program.Tape.Setting.push(item);
    }

    public static String set(Long index, String item) {
        return coordinate.main.Functions.Program.Tape.Setting.set(index, item);
    }

    public static Object set(Long index, Double item) {
        return coordinate.main.Functions.Program.Tape.Setting.set(index, item);
    }

    public static Boolean set(Long index, Boolean item) {
        return coordinate.main.Functions.Program.Tape.Setting.set(index, item);
    }

    public static Object set(Long index, ArrayList<?> item) {
        return coordinate.main.Functions.Program.Tape.Setting.set(index, item);
    }

    public static Long set(Long index, Long item) {
        return coordinate.main.Functions.Program.Tape.Setting.set(index, item);
    }

    public static Double increment(Long index) {
        return coordinate.main.Functions.Program.Tape.Setting.increment(index);
    }

    public static Double decrement(Long index) {
        return coordinate.main.Functions.Program.Tape.Setting.decrement(index);
    }

    public static boolean more(Double number1, Double number2) {
        return coordinate.main.Functions.Number.Comparison.more(number1, number2);
    }

    public static ArrayList<Boolean> more(ArrayList<Double> number1, Double number2) {
        return coordinate.main.Functions.List.Comparison.more(number1, number2);
    }

    public static ArrayList<Boolean> more(ArrayList<Double> number1, Long number2) {
        return more(number1, number2.doubleValue());
    }

    public static boolean more(Long number1, Double number2) {
        return coordinate.main.Functions.Number.Comparison.more(number1, number2);
    }

    public static boolean more(Double number1, Long number2) {
        return coordinate.main.Functions.Number.Comparison.more(number1, number2);
    }

    public static boolean more(Long number1, Long number2) {
        return coordinate.main.Functions.Number.Comparison.more(number1, number2);
    }

    public static boolean less(Double number1, Double number2) {
        return coordinate.main.Functions.Number.Comparison.less(number1, number2);
    }

    public static boolean less(Long number1, Double number2) {
        return coordinate.main.Functions.Number.Comparison.less(number1, number2);
    }

    public static boolean less(Double number1, Long number2) {
        return coordinate.main.Functions.Number.Comparison.less(number1, number2);
    }

    public static boolean less(Long number1, Long number2) {
        return coordinate.main.Functions.Number.Comparison.less(number1, number2);
    }

    public static ArrayList<Boolean> less(ArrayList<Double> number1, Double number2) {
        return coordinate.main.Functions.List.Comparison.less(number1, number2);
    }

    public static ArrayList<Boolean> less(ArrayList<Double> number1, Long number2) {
        return less(number1, number2.doubleValue());
    }

    public static boolean moreis(Double number1, Double number2) {
        return coordinate.main.Functions.Number.Comparison.moreis(number1, number2);
    }

    public static boolean moreis(Long number1, Double number2) {
        return coordinate.main.Functions.Number.Comparison.moreis(number1, number2);
    }

    public static boolean moreis(Double number1, Long number2) {
        return coordinate.main.Functions.Number.Comparison.moreis(number1, number2);
    }

    public static boolean moreis(Long number1, Long number2) {
        return coordinate.main.Functions.Number.Comparison.moreis(number1, number2);
    }

    public static ArrayList<Boolean> moreis(ArrayList<Double> number1, Double number2) {
        return coordinate.main.Functions.List.Comparison.moreis(number1, number2);
    }

    public static ArrayList<Boolean> moreis(ArrayList<Double> number1, Long number2) {
        return moreis(number1, number2.doubleValue());
    }

    public static boolean lessis(Double number1, Double number2) {
        return coordinate.main.Functions.Number.Comparison.lessis(number1, number2);
    }

    public static boolean lessis(Long number1, Double number2) {
        return coordinate.main.Functions.Number.Comparison.lessis(number1, number2);
    }

    public static boolean lessis(Double number1, Long number2) {
        return coordinate.main.Functions.Number.Comparison.lessis(number1, number2);
    }

    public static boolean lessis(Long number1, Long number2) {
        return coordinate.main.Functions.Number.Comparison.lessis(number1, number2);
    }

    public static ArrayList<Boolean> lessis(ArrayList<Double> number1, Double number2) {
        return coordinate.main.Functions.List.Comparison.lessis(number1, number2);
    }

    public static ArrayList<Boolean> lessis(ArrayList<Double> number1, Long number2) {
        return lessis(number1, number2.doubleValue());
    }

    // hasnumber

    public static boolean is(Double number1, Double number2) {
        return coordinate.main.Functions.Number.Comparison.is(number1, number2);
    }

    public static boolean is(Double number1, Long number2) {
        return coordinate.main.Functions.Number.Comparison.is(number1, number2);
    }

    public static boolean is(Long number1, Double number2) {
        return coordinate.main.Functions.Number.Comparison.is(number1, number2);
    }

    public static boolean is(Long number1, Long number2) {
        return coordinate.main.Functions.Number.Comparison.is(number1, number2);
    }

    public static boolean is(String number1, String number2) {
        return coordinate.main.Functions.String.Comparison.is(number1, number2);
    }

    public static ArrayList<Boolean> is(ArrayList<?> number1, Double number2) {
        return coordinate.main.Functions.List.Comparison.is(number1, number2);
    }

    public static ArrayList<Boolean> is(ArrayList<?> number1, Long number2) {
        return is(number1, number2.doubleValue());
    }

    public static String ask(String question) {
        return coordinate.main.Functions.Program.IO.Input.ask(question);
    }

    public static Double subtract(Double number1, Double number2) {
        return coordinate.main.Functions.Number.Math.Arithmetic.subtract(number1, number2);
    }

    public static ArrayList<Double> subtract(ArrayList<?> number1, Double number2) {
        return coordinate.main.Functions.List.Math.Arithmetic.subtract(number1, number2);
    }

    public static ArrayList<Double> subtract(ArrayList<?> number1, Long number2) {
        return coordinate.main.Functions.List.Math.Arithmetic.subtract(number1, number2);
    }

    public static Double subtract(Double number1, Long number2) {
        return coordinate.main.Functions.Number.Math.Arithmetic.subtract(number1, number2);
    }

    public static Double subtract(Long number1, Double number2) {
        return coordinate.main.Functions.Number.Math.Arithmetic.subtract(number1, number2);
    }

    public static Long subtract(Long number1, Long number2) {
        return coordinate.main.Functions.Number.Math.Arithmetic.subtract(number1, number2);
    }

    public static ArrayList<Double> add(ArrayList<?> number1, Long number2) {
        return coordinate.main.Functions.List.Math.Arithmetic.add(number1, number2);
    }

    public static ArrayList<Double> add(ArrayList<?> number1, Double number2) {
        return coordinate.main.Functions.List.Math.Arithmetic.add(number1, number2);
    }

    public static Double add(Double number1, Double number2) {
        return coordinate.main.Functions.Number.Math.Arithmetic.add(number1, number2);
    }

    public static Long add(Long number1, Long number2) {
        return coordinate.main.Functions.Number.Math.Arithmetic.add(number1, number2);
    }

    public static Double add(Double number1, Long number2) {
        return coordinate.main.Functions.Number.Math.Arithmetic.add(number1, number2);
    }

    public static Double add(Long number1, Double number2) {
        return coordinate.main.Functions.Number.Math.Arithmetic.add(number1, number2);
    }

    public static String add(String one, String two) {
        return coordinate.main.Functions.String.Manipulation.add(one, two);
    }

    public static Double multiply(Double number1, Double number2) {
        return coordinate.main.Functions.Number.Math.Arithmetic.multiply(number1, number2);
    }

    public static Double multiply(Long number1, Double number2) {
        return coordinate.main.Functions.Number.Math.Arithmetic.multiply(number1, number2);
    }

    public static Double multiply(Double number1, Long number2) {
        return coordinate.main.Functions.Number.Math.Arithmetic.multiply(number1, number2);
    }

    public static Long multiply(Long number1, Long number2) {
        return coordinate.main.Functions.Number.Math.Arithmetic.multiply(number1, number2);
    }

    public static Double divide(Double number1, Double number2) {
        return coordinate.main.Functions.Number.Math.Arithmetic.divide(number1, number2);
    }

    public static Double divide(Double number1, Long number2) {
        return coordinate.main.Functions.Number.Math.Arithmetic.divide(number1, number2);
    }

    public static Double divide(Long number1, Double number2) {
        return coordinate.main.Functions.Number.Math.Arithmetic.divide(number1, number2);
    }

    public static Long divide(Long number1, Long number2) {
        return coordinate.main.Functions.Number.Math.Arithmetic.divide(number1, number2);
    }

    public static Long and(Long number1, Long number2) {
        return coordinate.main.Functions.Number.Math.Bitwise.and(number1, number2);
    }

    public static Boolean and(Boolean number1, Boolean number2) {
        return coordinate.main.Functions.Boolean.Comparison.and(number1, number2);
    }

    public static Long or(Long number1, Long number2) {
        return coordinate.main.Functions.Number.Math.Bitwise.or(number1, number2);
    }

    public static Boolean or(Boolean number1, Boolean number2) {
        return coordinate.main.Functions.Boolean.Comparison.or(number1, number2);
    }

    public static Long xor(Long number1, Long number2) {
        return coordinate.main.Functions.Number.Math.Bitwise.xor(number1, number2);
    }

    public static Boolean xor(Boolean number1, Boolean number2) {
        return coordinate.main.Functions.Boolean.Comparison.xor(number1, number2);
    }

    public static boolean not(Boolean bool) {
        return coordinate.main.Functions.Boolean.Operations.not(bool);
    }

    public static boolean not(Long bool) {
        return coordinate.main.Functions.Boolean.Operations.not(bool);
    }

    public static boolean not(Double bool) {
        return coordinate.main.Functions.Boolean.Operations.not(bool);
    }

    public static Double modulo(Double number1, Double number2) {
        return coordinate.main.Functions.Number.Math.Arithmetic.modulo(number1, number2);
    }

    public static Double modulo(Long number1, Double number2) {
        return modulo(number1.doubleValue(), number2);
    }

    public static Double modulo(Double number1, Long number2) {
        return modulo(number1, number2.doubleValue());
    }

    public static Double modulo(Long number1, Long number2) {
        return modulo(number1.doubleValue(), number2.doubleValue());
    }

    public static Double exp(Double number1, Double number2) {
        return coordinate.main.Functions.Number.Math.Complex.exp(number1, number2);
    }

    public static Double exp(Long number1, Double number2) {
        return coordinate.main.Functions.Number.Math.Complex.exp(number1, number2);
    }

    public static Double exp(Double number1, Long number2) {
        return coordinate.main.Functions.Number.Math.Complex.exp(number1, number2);
    }

    public static Long exp(Long number1, Long number2) {
        return coordinate.main.Functions.Number.Math.Complex.exp(number1, number2);
    }

    public static ArrayList<Double> exp(ArrayList<Double> number1, Double number2) {
        return coordinate.main.Functions.List.Math.Complex.exp(number1, number2);
    }

    public static ArrayList<Double> exp(ArrayList<Double> number1, Long number2) {
        return exp(number1, number2.doubleValue());
    }

    public static Double root(Double number1, Double number2) {
        return coordinate.main.Functions.Number.Math.Complex.root(number1, number2);
    }

    public static Double root(Long number1, Double number2) {
        return root(number1.doubleValue(), number2.doubleValue());
    }

    public static Double root(Double number1, Long number2) {
        return root(number1.doubleValue(), number2.doubleValue());
    }

    public static Double root(Long number1, Long number2) {
        return root(number1.doubleValue(), number2.doubleValue());
    }

    public static Object get(Long index) {
        return coordinate.main.Functions.Program.Tape.Getting.get(index);
    }

    public static Object get(Double index) {
        return coordinate.main.Functions.Program.Tape.Getting.get(index);
    }

    public static Long toint(Boolean number) {
        return coordinate.main.Functions.Boolean.Conversion.toint(number);
    }

    public static Long toint(String number) {
        return coordinate.main.Functions.String.Conversion.toint(number);
    }

    public static Long toint(Object number) {
        return coordinate.main.Functions.Number.Operations.toint(number);
    }

    public static ArrayList<Double> toint(ArrayList<?> number1) {
        return coordinate.main.Functions.List.Conversion.toint(number1);
    }

    public static String reverse(String in) {
        return coordinate.main.Functions.String.Manipulation.reverse(in);
    }

    public static String tostr(Double number) {
        return coordinate.main.Functions.Number.Operations.tostr(number);
    }

    public static String tostr(Long number) {
        return coordinate.main.Functions.Number.Operations.tostr(number);
    }

    public static String tostr(boolean number) {
        return coordinate.main.Functions.Boolean.Conversion.tostr(number);
    }

    public static String tostr(String number) {
        return coordinate.main.Functions.String.Conversion.tostr(number);
    }

    public static String tostr(ArrayList<?> numbers) {
        return coordinate.main.Functions.List.Conversion.tostr(numbers);
    }

    public static Long toint(Double number) {
        return coordinate.main.Functions.Number.Operations.toint(number);
    }

    public static Double floor(Double number) {
        return coordinate.main.Functions.Number.Math.Complex.floor(number);
    }

    public static Long toint(Long number) {
        return coordinate.main.Functions.Number.Operations.toint(number);

    }

    public static Double log(Double number, Double base) {
        return coordinate.main.Functions.Number.Math.Complex.log(number, base);
    }

    public static Double log(Long number, Double base) {
        return log(number.doubleValue(), base);
    }

    public static Double log(Double number, Long base) {
        return log(number, base.doubleValue());
    }

    public static Double log(Long number, Long base) {
        return log(number.doubleValue(), base.doubleValue());
    }

    public static Double abs(Double number) {
        return coordinate.main.Functions.Number.Math.Complex.abs(number);
    }

    public static Long abs(Long number) {
        return coordinate.main.Functions.Number.Math.Complex.abs(number);
    }

    public static Double todec(Long number) {
        return coordinate.main.Functions.Number.Operations.todec(number);
    }

    public static Double todec(String number) {
        return coordinate.main.Functions.String.Conversion.todec(number);
    }

    public static Double todec(boolean number) {
        return coordinate.main.Functions.Boolean.Conversion.todec(number);
    }

    public static Double todec(Double number) {
        return coordinate.main.Functions.Number.Operations.todec(number);
    }

    public static Double round(Double number) {
        return coordinate.main.Functions.Number.Operations.round(number);
    }

    public static Long round(Long number) {
        return coordinate.main.Functions.Number.Operations.round(number);
    }

    public static Double fix(Double number, Long digits) {
        return coordinate.main.Functions.Number.Operations.fix(number, digits);
    }

    public static Double ceil(Double number) {
        return coordinate.main.Functions.Number.Math.Complex.ceil(number);
    }

    public static Long ceil(Long number) {
        return coordinate.main.Functions.Number.Math.Complex.ceil(number);
    }

    public static Double fpart(Double number) {
        return coordinate.main.Functions.Number.Operations.fpart(number);
    }

    public static Double fpart(Long number) {
        return coordinate.main.Functions.Number.Operations.fpart(number);
    }

    public static Double sum(ArrayList<?> list) {
        return coordinate.main.Functions.List.Operations.sum(list);
    }

    public static Number min(ArrayList<?> arguments) {
        return coordinate.main.Functions.List.Operations.min(arguments);
    }

    public static Number max(ArrayList<?> arguments) {
        return coordinate.main.Functions.List.Operations.max(arguments);
    }

    public static Object single(ArrayList<?> list, Long index) {
        return coordinate.main.Functions.List.Operations.single(list, index);
    }

    public static Object single(ArrayList<?> list, Double index) {
        return coordinate.main.Functions.List.Operations.single(list, index);
    }

    public static ArrayList<Object> piece(Long start, Long end) {
        return coordinate.main.Functions.Program.Tape.Getting.piece(start, end);
    }

    public static ArrayList<Object> piece(Double start, Long end) {
        return piece(start.longValue(), end.longValue());
    }

    public static ArrayList<Object> piece(Double start, Double end) {
        return piece(start.longValue(), end.longValue());
    }

    public static ArrayList<Object> piece(Long start, Double end) {
        return piece(start, end.longValue());
    }

    public static ArrayList<Object> aslist(Object[] arguments) {
        return coordinate.main.Functions.List.Creation.aslist(arguments);
    }

    public static void check(Boolean item) {
        coordinate.main.Functions.Program.Flow.Check.check(item);
    }

    public static Long factorial(Long number) {
        return coordinate.main.Functions.Number.Math.Complex.factorial(number);
    }

    public static Double factorial(Double number) {
        return coordinate.main.Functions.Number.Math.Complex.factorial(number);
    }

    public static Double sin(Long num) {
        return coordinate.main.Functions.Number.Math.Complex.sin(num);
    }

    public static Double sin(Double num) {
        return coordinate.main.Functions.Number.Math.Complex.sin(num);
    }

    public static Double cos(Double num) {
        return coordinate.main.Functions.Number.Math.Complex.cos(num);
    }

    public static Double tan(Double num) {
        return coordinate.main.Functions.Number.Math.Complex.tan(num);
    }

    public static Double cos(Long num) {
        return coordinate.main.Functions.Number.Math.Complex.cos(num);
    }

    public static Double tan(Long num) {
        return coordinate.main.Functions.Number.Math.Complex.tan(num);
    }

    public static Double radtodeg(Double rad) {
        return coordinate.main.Functions.Number.Math.Complex.radtodeg(rad);
    }

    public static Double radtodeg(Long rad) {
        return coordinate.main.Functions.Number.Math.Complex.radtodeg(rad);
    }

    public static Double degtorad(Double deg) {
        return coordinate.main.Functions.Number.Math.Complex.degtorad(deg);
    }

    public static Double degtorad(Long deg) {
        return degtorad(deg.doubleValue());
    }

    public static void incloop(Long id, Double start, Double end, Double increment) {
        coordinate.main.Functions.Program.Flow.Looping.Outline.incloop(id, start, end, increment);
    }

    public static Double incvar(Long id) {
        return coordinate.main.Functions.Program.Flow.Looping.Outline.incvar(id);
    }

    public static Double incset(Long id, Double thing) {
        return coordinate.main.Functions.Program.Flow.Looping.Outline.incset(id, thing);
    }

    public static Double incset(Long id, Long thing) {
        return coordinate.main.Functions.Program.Flow.Looping.Outline.incset(id, thing);
    }

    public static void next() {
        coordinate.main.Functions.Program.Flow.Looping.Outline.next();

    }

    public static void loopwhile(Boolean condition) { // fix
        coordinate.main.Functions.Program.Flow.Looping.Outline.loopwhile(condition);
    }

    public static void endloop() {
        coordinate.main.Functions.Program.Flow.Looping.Outline.endloop();
    }

    public static void otherwise() {
        coordinate.main.Functions.Program.Flow.Check.otherwise();
    }

    public static void endch() {
        // nothing
    }

    public static Boolean tobool(Double num) {
        return coordinate.main.Functions.Number.Operations.tobool(num);
    }

    public static Boolean tobool(Long num) {
        return coordinate.main.Functions.Number.Operations.tobool(num);
    }

    public static Double summation(String code, Long start, Long end, Double increment) {
        return coordinate.main.Functions.Number.Math.Summation.summation(code, start, end, increment);
    }

    public static Double summation(String code, Long start, Double end) {
        return summation(code, start, end.longValue(), 1d);
    }

    public static Double summation(String code, Long start, Long end) {
        return summation(code, start, end.longValue(), 1d);
    }

    public static Double summation(String code, Double start, Double end) {
        return summation(code, start.longValue(), end.longValue(), 1d);
    }

    public static Double summation(String code, Double start, Long end) {
        return summation(code, start.longValue(), end.longValue(), 1d);
    }

    public static Double summation(String code, Double start, Double end, Double increment) {
        return summation(code, start.longValue(), end.longValue(), increment);
    }

    public static Double pi() {
        return coordinate.main.Functions.Number.Constants.pi();
    }

    public static void loop(String code, Long start, Long end, Double increment) {
        coordinate.main.Functions.Program.Flow.Looping.Inline.loop(code, start, end, increment);
    }

    public static void loop(String code, Long start, Long end) {
        loop(code, start, end.longValue(), 1d);
    }

    public static void loop(String code, Long start, Double end) {
        loop(code, start, end.longValue(), 1d);
    }

    public static void loop(String code, Double start, Double end) {
        loop(code, start.longValue(), end.longValue(), 1d);
    }

    public static void loop(String code, Double start, Long end) {
        loop(code, start.longValue(), end, 1d);
    }

    public static ArrayList<Object> funclist(String code, Long start, Long end) {
        return coordinate.main.Functions.List.Creation.funclist(code, start, end);
    }

    public static ArrayList<Object> funclist(String code, Long start, Double end) {
        return funclist(code, start, end.longValue());
    }

    public static ArrayList<Object> funclist(String code, Double start, Double end) {
        return funclist(code, start.longValue(), end.longValue());
    }

    public static ArrayList<Object> funclist(String code, Double start, Long end) {
        return funclist(code, start.longValue(), end);
    }

    public static Double sumvar(Long item) {
        return coordinate.main.Functions.Number.Math.Summation.sumvar(item);
    }

    public static Double sumvar(Double item) {
        return coordinate.main.Functions.Number.Math.Summation.sumvar(item);
    }

    public static void puts(String item) {
        coordinate.main.Functions.Program.IO.Output.puts(item);
    }

    public static void puts(Object item) {
        coordinate.main.Functions.Program.IO.Output.puts(item);
    }

    public static void puts(Boolean item) {
        coordinate.main.Functions.Program.IO.Output.puts(item);
    }

    public static void puts(Long item) {
        coordinate.main.Functions.Program.IO.Output.puts(item);
    }

    public static void puts(Double item) {
        coordinate.main.Functions.Program.IO.Output.puts(item);
    }

    public static void putsin(String item) {
        coordinate.main.Functions.Program.IO.Output.putsin(item);
    }

    public static void putsin(Boolean item) {
        coordinate.main.Functions.Program.IO.Output.putsin(item);
    }

    public static void putsin(Long item) {
        coordinate.main.Functions.Program.IO.Output.putsin(item);
    }

    public static void putsin(Double item) {
        coordinate.main.Functions.Program.IO.Output.putsin(item);
    }

    public static void puts(ArrayList<?> item) {
        coordinate.main.Functions.Program.IO.Output.puts(item);
    }

    public static String cut(String item, Long start) {
        return coordinate.main.Functions.String.Manipulation.cut(item, start);
    }

    public static String cut(String item, Long start, Long end) {
        return coordinate.main.Functions.String.Manipulation.cut(item, start, end);
    }

    public static Long find(String item, String find) {
        return coordinate.main.Functions.String.Manipulation.find(item, find);
    }

    public static String pad(String item, String chr, Long tolength) {
        return coordinate.main.Functions.String.Manipulation.pad(item, chr, tolength);
    }

    public static String replace(String item, String what, String with) {
        return coordinate.main.Functions.String.Manipulation.replace(item, what, with);
    }

    public static String insertafter(String item, String find, String insert) {
        return coordinate.main.Functions.String.Manipulation.insertafter(item, find, insert);
    }

    public static ArrayList<String> split(String item, String spl) {
        return coordinate.main.Functions.String.Manipulation.split(item, spl);
    }

    public static String glue(ArrayList<String> item) {
        return coordinate.main.Functions.List.Manipulation.glue(item);
    }

    public static String glue(ArrayList<String> item, String delimiter) {
        return coordinate.main.Functions.List.Manipulation.glue(item, delimiter);
    }

    public static ArrayList<String> chararray(String item) {
        return coordinate.main.Functions.String.Manipulation.chararray(item);
    }

    public static String empty() {
        return coordinate.main.Functions.String.Constants.empty();
    }

    public static String charat(String item, Long index) {
        return coordinate.main.Functions.String.Operations.charat(item, index);
    }

    public static String charat(String item, Double index) {
        return coordinate.main.Functions.String.Operations.charat(item, index);
    }

    public static Long length(String item) {
        return coordinate.main.Functions.String.Operations.length(item);
    }

    public static Object recruit(ArrayList<?> list, Long item) {
        return coordinate.main.Functions.List.Manipulation.recruit(list, item);
    }

    public static Object recruit(ArrayList<?> list, Double item) {
        return coordinate.main.Functions.List.Manipulation.recruit(list, item);
    }

    public static Object recruit(ArrayList<?> list, String item) {
        return coordinate.main.Functions.List.Manipulation.recruit(list, item);
    }

    public static Long length(ArrayList<?> item) {
        return coordinate.main.Functions.List.Operations.length(item);
    }

    public static double random() {
        return coordinate.main.Functions.Number.Constants.random();
    }

    public static Object send(Object returned) {
        return coordinate.main.Functions.Program.Flow.Function.send(returned);
    }

    public static String edit(String str, Long id, String text) {
        return coordinate.main.Functions.String.Manipulation.edit(str, id, text);
    }

    public static String edit(String str, Double id, String text) {
        return edit(str, id.longValue(), text);
    }

    public static String edit(String str, Double id, Long text) {
        return edit(str, id.longValue(), text.toString());
    }

    public static String edit(String str, Double id, Double text) {
        return edit(str, id.longValue(), text.toString());
    }

    public static Object edit(ArrayList<?> str, Long id, Object text) {
        return coordinate.main.Functions.List.Manipulation.edit(str, id, text);
    }

    public static Object edit(ArrayList<?> str, Long id, String text) {
        return coordinate.main.Functions.List.Manipulation.edit(str, id, text);
    }

    public static Object edit(ArrayList<?> str, Long id, ArrayList<?> text) {
        return coordinate.main.Functions.List.Manipulation.edit(str, id, text);
    }

    public static Object edit(ArrayList<?> str, Long id, Double text) {
        return edit(str, id.longValue(), text.toString());
    }

    public static Object edit(ArrayList<?> str, Double id, Double text) {
        return edit(str, id.longValue(), text.toString());
    }

    public static Object edit(ArrayList<?> str, Double id, Long text) {
        return edit(str, id.longValue(), text.toString());
    }

    public static Object edit(ArrayList<?> str, Long id, Long text) {
        return edit(str, id.longValue(), text.toString());
    }

    public static Object callfunc(Long id, Object arg1, Object arg2, Object arg3, Object arg4) {
        return coordinate.main.Functions.Program.Flow.Function.callfunc(id, arg1, arg2, arg3, arg4);

    }

    public static Object callfunc(Long id, Object arg1) {
        Object nn = new Object();
        return callfunc(id, arg1, nn, nn, nn);
    }

    public static Object callfunc(Long id, Object arg1, Object arg2) {
        Object nn = new Object();
        return callfunc(id, arg1, arg2, nn, nn);
    }

    public static Object callfunc(Long id, Object arg1, Object arg2, Object arg3) {
        return callfunc(id, arg1, arg2, arg3, new Object());
    }

    public static Object getarg(Long id) {
        return Runner.memory.function.getA(id.intValue());
    }

    public static void function(Long id) {
        coordinate.main.Functions.Program.Flow.Function.function(id);
    }

    public static String repeat(String str, Long rep) {
        return coordinate.main.Functions.String.Manipulation.repeat(str, rep);
    }

    public static String repeat(String str, Double rep) {
        return coordinate.main.Functions.String.Manipulation.repeat(str, rep);
    }

    public static String tochar(Long chr) {
        return coordinate.main.Functions.Number.Operations.tochar(chr);
    }

    public static Long charcode(String chr) {
        return coordinate.main.Functions.String.Conversion.charcode(chr);
    }

    public static void endfunc() {
        // nothing;
    }
}
