package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.RefreshOff: ImageVector
    get() {
        if (_RefreshOff != null) {
            return _RefreshOff!!
        }
        _RefreshOff = ImageVector.Builder(
            name = "Filled.RefreshOff",
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
                moveTo(20f, 11f)
                arcToRelative(8.1f, 8.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.271f, -6.305f)
                moveToRelative(-2.41f, 1.624f)
                arcToRelative(8.083f, 8.083f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.819f, 2.681f)
                moveToRelative(-0.5f, -4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 13f)
                arcToRelative(8.1f, 8.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.671f, 4.691f)
                moveToRelative(2.329f, -1.691f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
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

        return _RefreshOff!!
    }

@Suppress("ObjectPropertyName")
private var _RefreshOff: ImageVector? = null
