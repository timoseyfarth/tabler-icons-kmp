package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BubbleMinus: ImageVector
    get() {
        if (_BubbleMinus != null) {
            return _BubbleMinus!!
        }
        _BubbleMinus = ImageVector.Builder(
            name = "Filled.BubbleMinus",
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
                moveTo(12.4f, 19f)
                arcToRelative(4.2f, 4.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.57f, -0.298f)
                lineToRelative(-3.83f, 2.298f)
                verticalLineToRelative(-3.134f)
                arcToRelative(2.668f, 2.668f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.795f, -3.773f)
                arcToRelative(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.908f, -8.933f)
                arcToRelative(5.335f, 5.335f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.194f, 1.078f)
                arcToRelative(5.333f, 5.333f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.404f, 8.771f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 19f)
                horizontalLineToRelative(6f)
            }
        }.build()

        return _BubbleMinus!!
    }

@Suppress("ObjectPropertyName")
private var _BubbleMinus: ImageVector? = null
