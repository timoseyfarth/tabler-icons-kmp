package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.SquareRotated: ImageVector
    get() {
        if (_SquareRotated != null) {
            return _SquareRotated!!
        }
        _SquareRotated = ImageVector.Builder(
            name = "Filled.SquareRotated",
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
                moveTo(13.446f, 2.6f)
                lineToRelative(7.955f, 7.954f)
                arcToRelative(2.045f, 2.045f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.892f)
                lineToRelative(-7.955f, 7.955f)
                arcToRelative(2.045f, 2.045f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.892f, 0f)
                lineToRelative(-7.955f, -7.955f)
                arcToRelative(2.045f, 2.045f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.892f)
                lineToRelative(7.955f, -7.955f)
                arcToRelative(2.045f, 2.045f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.892f, 0f)
                close()
            }
        }.build()

        return _SquareRotated!!
    }

@Suppress("ObjectPropertyName")
private var _SquareRotated: ImageVector? = null
