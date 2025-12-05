package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.BoxMultiple: ImageVector
    get() {
        if (_BoxMultiple != null) {
            return _BoxMultiple!!
        }
        _BoxMultiple = ImageVector.Builder(
            name = "Filled.BoxMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 5.667f)
                arcToRelative(3.667f, 3.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.667f, -3.667f)
                horizontalLineToRelative(8.666f)
                arcToRelative(3.667f, 3.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.667f, 3.667f)
                verticalLineToRelative(8.666f)
                arcToRelative(3.667f, 3.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.667f, 3.667f)
                horizontalLineToRelative(-8.666f)
                arcToRelative(3.667f, 3.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.667f, -3.667f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 9f)
                curveToRelative(0f, -1.094f, 0.533f, -1.828f, 1.514f, -2.374f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.972f, 1.748f)
                curveToRelative(-0.398f, 0.221f, -0.486f, 0.342f, -0.486f, 0.626f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.548f, 0.452f, 1f, 1f, 1f)
                horizontalLineToRelative(9.998f)
                curveToRelative(0.32f, 0f, 0.618f, -0.154f, 0.805f, -0.407f)
                lineToRelative(0.065f, -0.1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.738f, 0.99f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.606f, 1.517f)
                horizontalLineToRelative(-10f)
                curveToRelative(-1.652f, 0f, -3f, -1.348f, -3f, -3f)
                close()
            }
        }.build()

        return _BoxMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _BoxMultiple: ImageVector? = null
