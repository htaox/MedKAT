
/* First created by JCasGen Tue Oct 28 20:47:42 EDT 2008 */
package uima.tt;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;

import org.apache.uima.jcas.tcas.Annotation_Type;

/** Phrase Annotation
 * Updated by JCasGen Mon Mar 23 13:29:51 EDT 2009
 * @generated */
public class PhraseAnnotation_Type extends Annotation_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (PhraseAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = PhraseAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new PhraseAnnotation(addr, PhraseAnnotation_Type.this);
  			   PhraseAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new PhraseAnnotation(addr, PhraseAnnotation_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = PhraseAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("uima.tt.PhraseAnnotation");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public PhraseAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    