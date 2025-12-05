package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ColorFilter: ImageVector
    get() {
        if (_ColorFilter != null) {
            return _ColorFilter!!
        }
        _ColorFilter = ImageVector.Builder(
            name = "Filled.ColorFilter",
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
                moveTo(13.58f, 13.79f)
                curveToRelative(0.27f, 0.68f, 0.42f, 1.43f, 0.42f, 2.21f)
                curveToRelative(0f, 1.77f, -0.77f, 3.37f, -2f, 4.46f)
                arcToRelative(5.93f, 5.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 1.54f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -2.76f, 1.88f, -5.1f, 4.42f, -5.79f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.58f, 10.21f)
                curveToRelative(2.54f, 0.69f, 4.42f, 3.03f, 4.42f, 5.79f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                arcToRelative(5.93f, 5.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -1.54f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                moveToRelative(-6f, 0f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 0f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, 0f)
            }
        }.build()

        return _ColorFilter!!
    }

@Suppress("ObjectPropertyName")
private var _ColorFilter: ImageVector? = null
