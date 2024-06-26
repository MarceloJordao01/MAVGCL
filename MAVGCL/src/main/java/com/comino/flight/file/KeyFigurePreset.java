/****************************************************************************
 *
 *   Copyright (c) 2017,2018 Eike Mansfeld ecm@gmx.de. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 * 3. Neither the name of the copyright holder nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS
 * OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 ****************************************************************************/
package com.comino.flight.file;

public class KeyFigurePreset {
    private int group;
    private int id;
    private int[] keyFigures;
    private int annotation;
    private String name;

    public KeyFigurePreset() {
    	this.keyFigures = new int[4];
    }

    public void setName(String name) {
    	this.name = name;
    }

    public KeyFigurePreset(int id, int group, int annotation, int...hash) {
    	this.keyFigures = new int[4];
    	for(int i=0; i< 4 && i< hash.length;i++)
    		keyFigures[i] = hash[i];
    	this.id = id;
    	this.group = group;
    	this.annotation = annotation;
    	
    }

    public void set(int id, int group, int annotation, int...hash) {
    	for(int i=0; i< 4 && i< hash.length;i++)
    		keyFigures[i] = hash[i];
    	this.id = id;
    	this.group = group;
    	this.annotation = annotation;
    }

    public int getId() {
    	return this.id;
    }

    public int getKeyFigure(int i) {
    	return keyFigures[i];
    }

    public int getGroup() {
    	return this.group;
    }
    
    public int getAnnotation() {
    	return this.annotation;
    }

    public String getName() {
    	return name;
    }

}
