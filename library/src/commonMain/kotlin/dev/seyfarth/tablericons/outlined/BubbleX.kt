package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BubbleX: ImageVector
    get() {
        if (_BubbleX != null) {
            return _BubbleX!!
        }
        _BubbleX = ImageVector.Builder(
            name = "Filled.BubbleX",
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
                moveTo(13.5f, 18.75f)
                curveToRelative(-0.345f, 0.09f, -0.727f, 0.25f, -1.1f, 0.25f)
                arcToRelative(4.3f, 4.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.57f, -0.298f)
                lineToRelative(-3.83f, 2.298f)
                verticalLineToRelative(-3.134f)
                arcToRelative(2.668f, 2.668f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.795f, -3.773f)
                arcToRelative(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.908f, -8.933f)
                arcToRelative(5.335f, 5.335f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.194f, 1.078f)
                arcToRelative(5.333f, 5.333f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.484f, 6.778f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 22f)
                lineToRelative(-5f, -5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 22f)
                lineToRelative(5f, -5f)
            }
        }.build()

        return _BubbleX!!
    }

@Suppress("ObjectPropertyName")
private var _BubbleX: ImageVector? = null
