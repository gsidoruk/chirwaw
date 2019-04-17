package pl.gsystems.chirwaw.common.exception;


import java.util.List;

public class SimilarPacjentLareadyExists extends RuntimeException{
    List<Integer> similarPacjentIds;
}