package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ArrowsSplit2: ImageVector
    get() {
        if (_ArrowsSplit2 != null) {
            return _ArrowsSplit2!!
        }
        _ArrowsSplit2 = ImageVector.Builder(
            name = "Filled.ArrowsSplit2",
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
                moveTo(21f, 17f)
                horizontalLineToRelative(-5.397f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.096f, -2.133f)
                lineToRelative(-0.514f, -0.734f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.096f, -2.133f)
                horizontalLineToRelative(-3.897f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 7f)
                horizontalLineToRelative(-5.395f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.098f, 2.135f)
                lineToRelative(-0.51f, 0.73f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.097f, 2.135f)
                horizontalLineToRelative(-3.9f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 10f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 20f)
                lineToRelative(3f, -3f)
                lineToRelative(-3f, -3f)
            }
        }.build()

        return _ArrowsSplit2!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsSplit2: ImageVector? = null
