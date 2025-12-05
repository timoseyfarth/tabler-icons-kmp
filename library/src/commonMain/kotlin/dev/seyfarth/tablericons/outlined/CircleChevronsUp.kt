package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CircleChevronsUp: ImageVector
    get() {
        if (_CircleChevronsUp != null) {
            return _CircleChevronsUp!!
        }
        _CircleChevronsUp = ImageVector.Builder(
            name = "Filled.CircleChevronsUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 15f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 11f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 21f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.265f, 0f)
                lineToRelative(0.265f, 0f)
                close()
            }
        }.build()

        return _CircleChevronsUp!!
    }

@Suppress("ObjectPropertyName")
private var _CircleChevronsUp: ImageVector? = null
