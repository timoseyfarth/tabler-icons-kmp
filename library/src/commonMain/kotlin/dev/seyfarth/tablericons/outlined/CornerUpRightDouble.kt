package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CornerUpRightDouble: ImageVector
    get() {
        if (_CornerUpRightDouble != null) {
            return _CornerUpRightDouble!!
        }
        _CornerUpRightDouble = ImageVector.Builder(
            name = "Filled.CornerUpRightDouble",
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
                moveTo(4f, 18f)
                verticalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(7f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 13f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
                moveToRelative(5f, 8f)
                lineToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
            }
        }.build()

        return _CornerUpRightDouble!!
    }

@Suppress("ObjectPropertyName")
private var _CornerUpRightDouble: ImageVector? = null
