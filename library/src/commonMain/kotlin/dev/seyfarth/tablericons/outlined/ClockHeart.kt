package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ClockHeart: ImageVector
    get() {
        if (_ClockHeart != null) {
            return _ClockHeart!!
        }
        _ClockHeart = ImageVector.Builder(
            name = "Filled.ClockHeart",
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
                moveTo(20.956f, 11.107f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9.579f, 9.871f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 22f)
                lineToRelative(3.35f, -3.284f)
                arcToRelative(2.143f, 2.143f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.005f, -3.071f)
                arcToRelative(2.242f, 2.242f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.129f, -0.006f)
                lineToRelative(-0.224f, 0.22f)
                lineToRelative(-0.223f, -0.22f)
                arcToRelative(2.242f, 2.242f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.128f, -0.006f)
                arcToRelative(2.143f, 2.143f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.006f, 3.071f)
                lineToRelative(3.355f, 3.296f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 7f)
                verticalLineToRelative(5f)
                lineToRelative(0.5f, 0.5f)
            }
        }.build()

        return _ClockHeart!!
    }

@Suppress("ObjectPropertyName")
private var _ClockHeart: ImageVector? = null
