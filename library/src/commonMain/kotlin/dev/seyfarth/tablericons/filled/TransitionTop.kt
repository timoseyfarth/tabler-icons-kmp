package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.TransitionTop: ImageVector
    get() {
        if (_TransitionTop != null) {
            return _TransitionTop!!
        }
        _TransitionTop = ImageVector.Builder(
            name = "Filled.TransitionTop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                lineToRelative(0.081f, 0.003f)
                lineToRelative(0.12f, 0.017f)
                lineToRelative(0.111f, 0.03f)
                lineToRelative(0.111f, 0.044f)
                lineToRelative(0.098f, 0.052f)
                lineToRelative(0.104f, 0.074f)
                lineToRelative(0.082f, 0.073f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.414f, 1.414f)
                lineToRelative(-1.293f, -1.292f)
                verticalLineToRelative(4.585f)
                horizontalLineToRelative(5f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 8f)
                horizontalLineToRelative(-12f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -8f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-4.585f)
                lineToRelative(-1.293f, 1.292f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, 0.083f)
                lineToRelative(-0.094f, -0.083f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.414f)
                lineToRelative(3f, -3f)
                lineToRelative(0.112f, -0.097f)
                lineToRelative(0.11f, -0.071f)
                lineToRelative(0.062f, -0.031f)
                lineToRelative(0.081f, -0.034f)
                lineToRelative(0.076f, -0.024f)
                lineToRelative(0.118f, -0.025f)
                lineToRelative(0.058f, -0.007f)
                close()
                moveTo(18f, 2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineToRelative(-12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                close()
            }
        }.build()

        return _TransitionTop!!
    }

@Suppress("ObjectPropertyName")
private var _TransitionTop: ImageVector? = null
