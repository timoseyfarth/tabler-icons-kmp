package dev.seyfarth.tablericons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Filled.SquareLetterW: ImageVector
    get() {
        if (_SquareLetterW != null) {
            return _SquareLetterW!!
        }
        _SquareLetterW = ImageVector.Builder(
            name = "Filled.SquareLetterW",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                close()
                moveTo(14.008f, 7.876f)
                lineToRelative(-0.52f, 4.153f)
                lineToRelative(-0.56f, -1.4f)
                curveToRelative(-0.319f, -0.799f, -1.41f, -0.837f, -1.803f, -0.114f)
                lineToRelative(-0.053f, 0.114f)
                lineToRelative(-0.561f, 1.4f)
                lineToRelative(-0.519f, -4.153f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -0.876f)
                lineToRelative(-0.116f, 0.008f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.868f, 1.116f)
                lineToRelative(1f, 8f)
                curveToRelative(0.128f, 1.025f, 1.537f, 1.207f, 1.92f, 0.247f)
                lineToRelative(1.072f, -2.678f)
                lineToRelative(1.072f, 2.678f)
                curveToRelative(0.383f, 0.96f, 1.792f, 0.778f, 1.92f, -0.247f)
                lineToRelative(1f, -8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.984f, -0.248f)
            }
        }.build()

        return _SquareLetterW!!
    }

@Suppress("ObjectPropertyName")
private var _SquareLetterW: ImageVector? = null
