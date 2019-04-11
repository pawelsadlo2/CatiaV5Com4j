import CatiaV5TypeLibs.InfItfTypeLib.*;
package CatiaV5TypeLibs.PartItfTypeLib;

/**
 */
public enum CatConstraintStatus {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  catCstStatusOK, // 0
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  catCstStatusKOStronglyNotSatisfied, // 1
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  catCstStatusKOWrongOrientOrSide, // 2
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  catCstStatusKOWrongValue, // 3
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  catCstStatusKOWrongGeomEltType, // 4
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  catCstStatusKOBroken, // 5
}
