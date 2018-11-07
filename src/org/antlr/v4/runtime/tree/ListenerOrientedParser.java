//package org.antlr.v4.runtime.tree;
//
//
//import org.antlr.v4.runtime.ANTLRInputStream;
//import org.antlr.v4.runtime.CharStream;
//import org.antlr.v4.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.TokenStream;
//import org.antlr.v4.runtime.domain.Class;
//import org.antlr.v4.runtime.misc.NotNull;
//
//import org.antlr.v4.runtime.domain.*;
//
//
//
//import java.util.ArrayList;
//import java.util.Collection;
//
//public class ListenerOrientedParser implements Parser{
//
//    @Override
//    public Class parse(String code) {
//        CharStream charStream = new ANTLRInputStream(code);
//        YARSLexer lexer = new YARSLexer(charStream);
//        TokenStream tokens = new CommonTokenStream(lexer);
//        YARSParser parser = new YARSParser(tokens);
//
//        ClassListener classListener = new ClassListener();
//        parser.yars().enterRule(classListener);
//        return classListener.getParsedClass();
//    }
//
//    class ClassListener extends YARSBaseListener {
//
//        private Class parsedClass;
//
//        @Override
//        public void enterClassDeclaration(@NotNull YARSParser.VertexDeclarationContext ctx) {
//            String className = ctx.className().getText();
//            MethodListener methodListener = new MethodListener();
//            ctx.method().forEach(method -> method.enterRule(methodListener));
//            Collection<Method> methods = methodListener.getMethods();
//            parsedClass = new Class(className,methods);
//        }
//
//        public Class getParsedClass() {
//            return parsedClass;
//        }
//    }
//
//    class MethodListener extends YARSBaseListener {
//
//        private Collection<Method> methods;
//
//        public MethodListener() {
//            methods = new ArrayList<>();
//        }
//
//        @Override
//        public void enterMethod(@NotNull YARSParser.MethodContext ctx) {
//            String methodName = ctx.methodName().getText();
//            InstructionListener instructionListener = new InstructionListener();
//            ctx.instruction().forEach(instruction -> instruction.enterRule(instructionListener));
//            Collection<Instruction> instructions = instructionListener.getInstructions();
//            methods.add(new Method(methodName, instructions));
//        }
//
//        public Collection<Method> getMethods() {
//            return methods;
//        }
//    }
//
//    class InstructionListener extends YARSBaseListener {
//
//        private Collection<Instruction> instructions;
//
//        public InstructionListener() {
//            instructions = new ArrayList<>();
//        }
//
//        @Override
//        public void enterInstruction(@NotNull YARSParser.InstructionContext ctx) {
//            String instructionName = ctx.getText();
//            instructions.add(new Instruction(instructionName));
//        }
//
//        public Collection<Instruction> getInstructions() {
//            return instructions;
//        }
//    }
//}