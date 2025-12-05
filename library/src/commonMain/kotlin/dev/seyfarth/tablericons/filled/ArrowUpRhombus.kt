package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.ArrowUpRhombus: ImageVector
    get() {
        if (_ArrowUpRhombus != null) {
            return _ArrowUpRhombus!!
        }
        _ArrowUpRhombus = ImageVector.Builder(
            name = "Filled.ArrowUpRhombus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
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
                verticalLineToRelative(10.17f)
                lineToRelative(2.207f, 2.208f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.414f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, 0f)
                lineToRelative(-2.5f, -2.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.414f)
                lineToRelative(2.207f, -2.209f)
                verticalLineToRelative(-10.169f)
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
            }
        }.build()

        return _ArrowUpRhombus!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpRhombus: ImageVector? = null
