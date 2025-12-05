package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.PlayCard10: ImageVector
    get() {
        if (_PlayCard10 != null) {
            return _PlayCard10!!
        }
        _PlayCard10 = ImageVector.Builder(
            name = "Filled.PlayCard10",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineToRelative(-10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                close()
                moveTo(17.01f, 18f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                moveToRelative(-8.01f, -10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                moveToRelative(4.5f, 0f)
                curveToRelative(-1.453f, 0f, -2.5f, 1.395f, -2.5f, 3f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.605f, 1.047f, 3f, 2.5f, 3f)
                reflectiveCurveToRelative(2.5f, -1.395f, 2.5f, -3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.605f, -1.047f, -3f, -2.5f, -3f)
                moveToRelative(0f, 2f)
                curveToRelative(0.203f, 0f, 0.5f, 0.395f, 0.5f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.605f, -0.297f, 1f, -0.5f, 1f)
                reflectiveCurveToRelative(-0.5f, -0.395f, -0.5f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.605f, 0.297f, -1f, 0.5f, -1f)
                moveToRelative(-6.49f, -6f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
            }
        }.build()

        return _PlayCard10!!
    }

@Suppress("ObjectPropertyName")
private var _PlayCard10: ImageVector? = null
