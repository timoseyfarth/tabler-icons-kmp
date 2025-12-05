package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.BookmarkOff: ImageVector
    get() {
        if (_BookmarkOff != null) {
            return _BookmarkOff!!
        }
        _BookmarkOff = ImageVector.Builder(
            name = "Filled.BookmarkOff",
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
                moveTo(7.708f, 3.721f)
                arcToRelative(3.982f, 3.982f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.292f, -0.721f)
                horizontalLineToRelative(4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                verticalLineToRelative(7f)
                moveToRelative(0f, 4f)
                verticalLineToRelative(3f)
                lineToRelative(-6f, -4f)
                lineToRelative(-6f, 4f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -0.308f, 0.035f, -0.609f, 0.1f, -0.897f)
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

        return _BookmarkOff!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkOff: ImageVector? = null
