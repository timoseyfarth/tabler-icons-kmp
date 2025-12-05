package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.BinaryTree: ImageVector
    get() {
        if (_BinaryTree != null) {
            return _BinaryTree!!
        }
        _BinaryTree = ImageVector.Builder(
            name = "Filled.BinaryTree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.348f, 4.868f)
                lineToRelative(2f, 3.203f)
                quadToRelative(0.317f, -0.071f, 0.652f, -0.071f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.347f, 1.132f)
                lineToRelative(-2f, -3.203f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.304f, 0f)
                lineToRelative(-2.001f, 3.203f)
                curveToRelative(0.408f, 0.513f, 0.652f, 1.162f, 0.652f, 1.868f)
                reflectiveCurveToRelative(-0.244f, 1.356f, -0.653f, 1.868f)
                lineToRelative(2.002f, 3.203f)
                quadToRelative(0.315f, -0.071f, 0.651f, -0.071f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.347f, 1.132f)
                lineToRelative(-2.003f, -3.203f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.302f, 0f)
                lineToRelative(-2.002f, 3.203f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.696f, -1.06f)
                lineToRelative(2.002f, -3.204f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.998f, -4.798f)
                lineToRelative(2.002f, -3.202f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.348f, -4.868f)
            }
        }.build()

        return _BinaryTree!!
    }

@Suppress("ObjectPropertyName")
private var _BinaryTree: ImageVector? = null
