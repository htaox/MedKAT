

/* First created by JCasGen Wed Jun 11 12:10:51 EDT 2008 */
package org.ohnlp.medkat.taes.conceptMapper;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Annotation for dictionary lookup matches
 * Updated by JCasGen Mon Mar 23 14:01:46 EDT 2009
 * XML source: C:/ohnlp/MedKATp/descriptors/analysis_engine/aggregate/MedKATp.xml
 * @generated */
public class NoTerm extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(NoTerm.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected NoTerm() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NoTerm(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NoTerm(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NoTerm(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: DictCanon

  /** getter for DictCanon - gets canonical form
   * @generated */
  public String getDictCanon() {
    if (NoTerm_Type.featOkTst && ((NoTerm_Type)jcasType).casFeat_DictCanon == null)
      jcasType.jcas.throwFeatMissing("DictCanon", "org.ohnlp.medkat.taes.conceptMapper.NoTerm");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NoTerm_Type)jcasType).casFeatCode_DictCanon);}
    
  /** setter for DictCanon - sets canonical form 
   * @generated */
  public void setDictCanon(String v) {
    if (NoTerm_Type.featOkTst && ((NoTerm_Type)jcasType).casFeat_DictCanon == null)
      jcasType.jcas.throwFeatMissing("DictCanon", "org.ohnlp.medkat.taes.conceptMapper.NoTerm");
    jcasType.ll_cas.ll_setStringValue(addr, ((NoTerm_Type)jcasType).casFeatCode_DictCanon, v);}    
   
    
  //*--------------*
  //* Feature: SemClass

  /** getter for SemClass - gets 
   * @generated */
  public String getSemClass() {
    if (NoTerm_Type.featOkTst && ((NoTerm_Type)jcasType).casFeat_SemClass == null)
      jcasType.jcas.throwFeatMissing("SemClass", "org.ohnlp.medkat.taes.conceptMapper.NoTerm");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NoTerm_Type)jcasType).casFeatCode_SemClass);}
    
  /** setter for SemClass - sets  
   * @generated */
  public void setSemClass(String v) {
    if (NoTerm_Type.featOkTst && ((NoTerm_Type)jcasType).casFeat_SemClass == null)
      jcasType.jcas.throwFeatMissing("SemClass", "org.ohnlp.medkat.taes.conceptMapper.NoTerm");
    jcasType.ll_cas.ll_setStringValue(addr, ((NoTerm_Type)jcasType).casFeatCode_SemClass, v);}    
   
    
  //*--------------*
  //* Feature: enclosingSpan

  /** getter for enclosingSpan - gets span that this NoTerm is contained within (i.e. its sentence)
   * @generated */
  public Annotation getEnclosingSpan() {
    if (NoTerm_Type.featOkTst && ((NoTerm_Type)jcasType).casFeat_enclosingSpan == null)
      jcasType.jcas.throwFeatMissing("enclosingSpan", "org.ohnlp.medkat.taes.conceptMapper.NoTerm");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((NoTerm_Type)jcasType).casFeatCode_enclosingSpan)));}
    
  /** setter for enclosingSpan - sets span that this NoTerm is contained within (i.e. its sentence) 
   * @generated */
  public void setEnclosingSpan(Annotation v) {
    if (NoTerm_Type.featOkTst && ((NoTerm_Type)jcasType).casFeat_enclosingSpan == null)
      jcasType.jcas.throwFeatMissing("enclosingSpan", "org.ohnlp.medkat.taes.conceptMapper.NoTerm");
    jcasType.ll_cas.ll_setRefValue(addr, ((NoTerm_Type)jcasType).casFeatCode_enclosingSpan, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: POS

  /** getter for POS - gets Part of speech
   * @generated */
  public String getPOS() {
    if (NoTerm_Type.featOkTst && ((NoTerm_Type)jcasType).casFeat_POS == null)
      jcasType.jcas.throwFeatMissing("POS", "org.ohnlp.medkat.taes.conceptMapper.NoTerm");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NoTerm_Type)jcasType).casFeatCode_POS);}
    
  /** setter for POS - sets Part of speech 
   * @generated */
  public void setPOS(String v) {
    if (NoTerm_Type.featOkTst && ((NoTerm_Type)jcasType).casFeat_POS == null)
      jcasType.jcas.throwFeatMissing("POS", "org.ohnlp.medkat.taes.conceptMapper.NoTerm");
    jcasType.ll_cas.ll_setStringValue(addr, ((NoTerm_Type)jcasType).casFeatCode_POS, v);}    
   
    
  //*--------------*
  //* Feature: matchedText

  /** getter for matchedText - gets 
   * @generated */
  public String getMatchedText() {
    if (NoTerm_Type.featOkTst && ((NoTerm_Type)jcasType).casFeat_matchedText == null)
      jcasType.jcas.throwFeatMissing("matchedText", "org.ohnlp.medkat.taes.conceptMapper.NoTerm");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NoTerm_Type)jcasType).casFeatCode_matchedText);}
    
  /** setter for matchedText - sets  
   * @generated */
  public void setMatchedText(String v) {
    if (NoTerm_Type.featOkTst && ((NoTerm_Type)jcasType).casFeat_matchedText == null)
      jcasType.jcas.throwFeatMissing("matchedText", "org.ohnlp.medkat.taes.conceptMapper.NoTerm");
    jcasType.ll_cas.ll_setStringValue(addr, ((NoTerm_Type)jcasType).casFeatCode_matchedText, v);}    
  }

    