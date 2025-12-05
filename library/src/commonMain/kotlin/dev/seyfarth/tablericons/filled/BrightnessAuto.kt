package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.BrightnessAuto: ImageVector
    get() {
        if (_BrightnessAuto != null) {
            return _BrightnessAuto!!
        }
        _BrightnessAuto = ImageVector.Builder(
            name = "Filled.BrightnessAuto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.707f, 2.793f)
                lineToRelative(2.208f, 2.207f)
                horizontalLineToRelative(3.085f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(3.085f)
                lineToRelative(2.207f, 2.208f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.083f, 1.32f)
                lineToRelative(-0.083f, 0.094f)
                lineToRelative(-2.207f, 2.207f)
                verticalLineToRelative(3.086f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-3.086f)
                lineToRelative(-2.207f, 2.207f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, 0.083f)
                lineToRelative(-0.094f, -0.083f)
                lineToRelative(-2.208f, -2.207f)
                horizontalLineToRelative(-3.085f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-3.085f)
                lineToRelative(-2.207f, -2.208f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.083f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(2.207f, -2.209f)
                verticalLineToRelative(-3.084f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.883f, -0.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(3.084f)
                lineToRelative(2.209f, -2.207f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, 0f)
                moveToRelative(-0.707f, 5.207f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(3.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.883f, 0.993f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineToRelative(-3.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                moveToRelative(0f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.883f, -0.993f)
                close()
            }
        }.build()

        return _BrightnessAuto!!
    }

@Suppress("ObjectPropertyName")
private var _BrightnessAuto: ImageVector? = null
