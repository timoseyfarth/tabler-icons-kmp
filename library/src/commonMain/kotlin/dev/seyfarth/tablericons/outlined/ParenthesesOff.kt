package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ParenthesesOff: ImageVector
    get() {
        if (_ParenthesesOff != null) {
            return _ParenthesesOff!!
        }
        _ParenthesesOff = ImageVector.Builder(
            name = "Filled.ParenthesesOff",
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
                moveTo(5.743f, 5.745f)
                arcToRelative(12.253f, 12.253f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.257f, 14.255f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 4f)
                arcToRelative(12.25f, 12.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.474f, 11.467f)
                moveToRelative(-1.22f, 2.794f)
                arcToRelative(12.291f, 12.291f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.254f, 1.739f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()

        return _ParenthesesOff!!
    }

@Suppress("ObjectPropertyName")
private var _ParenthesesOff: ImageVector? = null
