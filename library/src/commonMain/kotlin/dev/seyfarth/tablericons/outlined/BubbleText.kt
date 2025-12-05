package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BubbleText: ImageVector
    get() {
        if (_BubbleText != null) {
            return _BubbleText!!
        }
        _BubbleText = ImageVector.Builder(
            name = "Filled.BubbleText",
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
                moveTo(7f, 10f)
                horizontalLineToRelative(10f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 14f)
                horizontalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.4f, 3f)
                arcToRelative(5.34f, 5.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.906f, 3.239f)
                arcToRelative(5.333f, 5.333f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.195f, 10.6f)
                arcToRelative(4.26f, 4.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.28f, 1.863f)
                lineToRelative(-3.831f, 2.298f)
                verticalLineToRelative(-3.134f)
                arcToRelative(2.668f, 2.668f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.795f, -3.773f)
                arcToRelative(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.908f, -8.933f)
                arcToRelative(5.33f, 5.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.287f, -2.16f)
            }
        }.build()

        return _BubbleText!!
    }

@Suppress("ObjectPropertyName")
private var _BubbleText: ImageVector? = null
