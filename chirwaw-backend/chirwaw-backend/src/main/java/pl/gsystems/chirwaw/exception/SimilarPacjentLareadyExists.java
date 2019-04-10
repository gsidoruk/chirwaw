package pl.gsystems.chirwaw.exception;


import java.util.List;

public class SimilarPacjentLareadyExists extends RuntimeException{
    List<Integer> similarPacjentIds;
}