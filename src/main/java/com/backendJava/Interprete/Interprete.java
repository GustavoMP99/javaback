package com.backendJava.Interprete;

import generated.ParserMain;
import generated.ParserMainBaseVisitor;

import java.util.Stack;

public class Interprete extends ParserMainBaseVisitor {
    private Stack<Object> pilaExpresiones;
    private AlmacenDatos almacenDatos;

    public Interprete(){
        this.pilaExpresiones= new Stack<Object>();
        this.almacenDatos = new AlmacenDatos();
    }

    @Override
    public Object visitProgramAST(ParserMain.ProgramASTContext ctx) {
        return super.visitProgramAST(ctx);
    }

    @Override
    public Object visitCallvariableDeclAST(ParserMain.CallvariableDeclASTContext ctx) {
        return super.visitCallvariableDeclAST(ctx);
    }

    @Override
    public Object visitCallClassDeclAST(ParserMain.CallClassDeclASTContext ctx) {
        return super.visitCallClassDeclAST(ctx);
    }

    @Override
    public Object visitCallAssignamentAST(ParserMain.CallAssignamentASTContext ctx) {
        return super.visitCallAssignamentAST(ctx);
    }

    @Override
    public Object visitCallArrayAssignamentAST(ParserMain.CallArrayAssignamentASTContext ctx) {
        return super.visitCallArrayAssignamentAST(ctx);
    }

    @Override
    public Object visitCallPrintStatementAST(ParserMain.CallPrintStatementASTContext ctx) {
        return super.visitCallPrintStatementAST(ctx);
    }

    @Override
    public Object visitCallIfStatementAST(ParserMain.CallIfStatementASTContext ctx) {
        return super.visitCallIfStatementAST(ctx);
    }

    @Override
    public Object visitCallWhileStatementAST(ParserMain.CallWhileStatementASTContext ctx) {
        return super.visitCallWhileStatementAST(ctx);
    }

    @Override
    public Object visitCallReturnStatementAST(ParserMain.CallReturnStatementASTContext ctx) {
        return super.visitCallReturnStatementAST(ctx);
    }

    @Override
    public Object visitCallFuntionDeclAST(ParserMain.CallFuntionDeclASTContext ctx) {
        return super.visitCallFuntionDeclAST(ctx);
    }

    @Override
    public Object visitCallBlockAST(ParserMain.CallBlockASTContext ctx) {
        return super.visitCallBlockAST(ctx);
    }

    @Override
    public Object visitBlockAST(ParserMain.BlockASTContext ctx) {
        return super.visitBlockAST(ctx);
    }

    @Override
    public Object visitFuntionDeclAST(ParserMain.FuntionDeclASTContext ctx) {
        return super.visitFuntionDeclAST(ctx);
    }

    @Override
    public Object visitFormalParamsAST(ParserMain.FormalParamsASTContext ctx) {
        return super.visitFormalParamsAST(ctx);
    }

    @Override
    public Object visitFormalParamAST(ParserMain.FormalParamASTContext ctx) {
        return super.visitFormalParamAST(ctx);
    }

    @Override
    public Object visitWhileStatementAST(ParserMain.WhileStatementASTContext ctx) {
        return super.visitWhileStatementAST(ctx);
    }

    @Override
    public Object visitIfStatementAST(ParserMain.IfStatementASTContext ctx) {
        return super.visitIfStatementAST(ctx);
    }

    @Override
    public Object visitReturnStatementAST(ParserMain.ReturnStatementASTContext ctx) {
        return super.visitReturnStatementAST(ctx);
    }

    @Override
    public Object visitPrintStatementAST(ParserMain.PrintStatementASTContext ctx) {
        return super.visitPrintStatementAST(ctx);
    }

    @Override
    public Object visitClassDeclAST(ParserMain.ClassDeclASTContext ctx) {
        return super.visitClassDeclAST(ctx);
    }

    @Override
    public Object visitClassVariableDeclAST(ParserMain.ClassVariableDeclASTContext ctx) {
        return super.visitClassVariableDeclAST(ctx);
    }

    @Override
    public Object visitVariableDeclAST(ParserMain.VariableDeclASTContext ctx) {
        return super.visitVariableDeclAST(ctx);
    }

    @Override
    public Object visitSimpleTypeTAST(ParserMain.SimpleTypeTASTContext ctx) {
        return super.visitSimpleTypeTAST(ctx);
    }

    @Override
    public Object visitArrayTypeTAST(ParserMain.ArrayTypeTASTContext ctx) {
        return super.visitArrayTypeTAST(ctx);
    }

    @Override
    public Object visitIdTAST(ParserMain.IdTASTContext ctx) {
        return super.visitIdTAST(ctx);
    }

    @Override
    public Object visitBoleanSTAST(ParserMain.BoleanSTASTContext ctx) {
        return super.visitBoleanSTAST(ctx);
    }

    @Override
    public Object visitCharSTAST(ParserMain.CharSTASTContext ctx) {
        return super.visitCharSTAST(ctx);
    }

    @Override
    public Object visitIntSTAST(ParserMain.IntSTASTContext ctx) {
        return super.visitIntSTAST(ctx);
    }

    @Override
    public Object visitStringSTAST(ParserMain.StringSTASTContext ctx) {
        return super.visitStringSTAST(ctx);
    }

    @Override
    public Object visitArrayTypeAST(ParserMain.ArrayTypeASTContext ctx) {
        return super.visitArrayTypeAST(ctx);
    }

    @Override
    public Object visitAssignmentAST(ParserMain.AssignmentASTContext ctx) {
        return super.visitAssignmentAST(ctx);
    }

    @Override
    public Object visitArrayAssignamentAST(ParserMain.ArrayAssignamentASTContext ctx) {
        return super.visitArrayAssignamentAST(ctx);
    }

    @Override
    public Object visitExpressionAST(ParserMain.ExpressionASTContext ctx) {
        return super.visitExpressionAST(ctx);
    }

    @Override
    public Object visitSimpleExpressionAST(ParserMain.SimpleExpressionASTContext ctx) {
        return super.visitSimpleExpressionAST(ctx);
    }

    @Override
    public Object visitTermAST(ParserMain.TermASTContext ctx) {
        return super.visitTermAST(ctx);
    }

    @Override
    public Object visitFactorLiteralAST(ParserMain.FactorLiteralASTContext ctx) {
        return super.visitFactorLiteralAST(ctx);
    }

    @Override
    public Object visitFactorIDAST(ParserMain.FactorIDASTContext ctx) {
        return super.visitFactorIDAST(ctx);
    }

    @Override
    public Object visitFactorfuntionCallAST(ParserMain.FactorfuntionCallASTContext ctx) {
        return super.visitFactorfuntionCallAST(ctx);
    }

    @Override
    public Object visitFactorArrayLookUpAST(ParserMain.FactorArrayLookUpASTContext ctx) {
        return super.visitFactorArrayLookUpAST(ctx);
    }

    @Override
    public Object visitFactorArrayLengthAST(ParserMain.FactorArrayLengthASTContext ctx) {
        return super.visitFactorArrayLengthAST(ctx);
    }

    @Override
    public Object visitFactorSubExpressionAST(ParserMain.FactorSubExpressionASTContext ctx) {
        return super.visitFactorSubExpressionAST(ctx);
    }

    @Override
    public Object visitFactorArrayAlocationAST(ParserMain.FactorArrayAlocationASTContext ctx) {
        return super.visitFactorArrayAlocationAST(ctx);
    }

    @Override
    public Object visitFactorAllocationAST(ParserMain.FactorAllocationASTContext ctx) {
        return super.visitFactorAllocationAST(ctx);
    }

    @Override
    public Object visitFactorUnary(ParserMain.FactorUnaryContext ctx) {
        return super.visitFactorUnary(ctx);
    }

    @Override
    public Object visitUnaryAST(ParserMain.UnaryASTContext ctx) {
        return super.visitUnaryAST(ctx);
    }

    @Override
    public Object visitAllocationExpressionAST(ParserMain.AllocationExpressionASTContext ctx) {
        return super.visitAllocationExpressionAST(ctx);
    }

    @Override
    public Object visitArrayAlocationExpressionAST(ParserMain.ArrayAlocationExpressionASTContext ctx) {
        return super.visitArrayAlocationExpressionAST(ctx);
    }

    @Override
    public Object visitSubExpressionAST(ParserMain.SubExpressionASTContext ctx) {
        return super.visitSubExpressionAST(ctx);
    }

    @Override
    public Object visitFuntionCallAST(ParserMain.FuntionCallASTContext ctx) {
        return super.visitFuntionCallAST(ctx);
    }

    @Override
    public Object visitActualParamsAST(ParserMain.ActualParamsASTContext ctx) {
        return super.visitActualParamsAST(ctx);
    }

    @Override
    public Object visitArrayLookUpAST(ParserMain.ArrayLookUpASTContext ctx) {
        return super.visitArrayLookUpAST(ctx);
    }

    @Override
    public Object visitArrayLengthAST(ParserMain.ArrayLengthASTContext ctx) {
        return super.visitArrayLengthAST(ctx);
    }

    @Override
    public Object visitMinusOPAST(ParserMain.MinusOPASTContext ctx) {
        return super.visitMinusOPAST(ctx);
    }

    @Override
    public Object visitMaxOPAST(ParserMain.MaxOPASTContext ctx) {
        return super.visitMaxOPAST(ctx);
    }

    @Override
    public Object visitIdenticalOPAST(ParserMain.IdenticalOPASTContext ctx) {
        return super.visitIdenticalOPAST(ctx);
    }

    @Override
    public Object visitDifOPAST(ParserMain.DifOPASTContext ctx) {
        return super.visitDifOPAST(ctx);
    }

    @Override
    public Object visitMinSequalOPAST(ParserMain.MinSequalOPASTContext ctx) {
        return super.visitMinSequalOPAST(ctx);
    }

    @Override
    public Object visitMaxSequalAST(ParserMain.MaxSequalASTContext ctx) {
        return super.visitMaxSequalAST(ctx);
    }

    @Override
    public Object visitSumOPAST(ParserMain.SumOPASTContext ctx) {
        return super.visitSumOPAST(ctx);
    }

    @Override
    public Object visitSubtractOPAST(ParserMain.SubtractOPASTContext ctx) {
        return super.visitSubtractOPAST(ctx);
    }

    @Override
    public Object visitOrOPAST(ParserMain.OrOPASTContext ctx) {
        return super.visitOrOPAST(ctx);
    }

    @Override
    public Object visitMultOPAST(ParserMain.MultOPASTContext ctx) {
        return super.visitMultOPAST(ctx);
    }

    @Override
    public Object visitDivOPAST(ParserMain.DivOPASTContext ctx) {
        return super.visitDivOPAST(ctx);
    }

    @Override
    public Object visitAndOPAST(ParserMain.AndOPASTContext ctx) {
        return super.visitAndOPAST(ctx);
    }

    @Override
    public Object visitIntLiteralAST(ParserMain.IntLiteralASTContext ctx) {
        return super.visitIntLiteralAST(ctx);
    }

    @Override
    public Object visitRealLiteralAST(ParserMain.RealLiteralASTContext ctx) {
        return super.visitRealLiteralAST(ctx);
    }

    @Override
    public Object visitBooleanLiteralAST(ParserMain.BooleanLiteralASTContext ctx) {
        return super.visitBooleanLiteralAST(ctx);
    }

    @Override
    public Object visitStringLiteralAST(ParserMain.StringLiteralASTContext ctx) {
        return super.visitStringLiteralAST(ctx);
    }

    @Override
    public Object visitTrueAST(ParserMain.TrueASTContext ctx) {
        return super.visitTrueAST(ctx);
    }

    @Override
    public Object visitFalseAST(ParserMain.FalseASTContext ctx) {
        return super.visitFalseAST(ctx);
    }
}