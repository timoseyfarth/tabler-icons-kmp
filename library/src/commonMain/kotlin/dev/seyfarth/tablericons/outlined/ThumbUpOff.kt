package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.ThumbUpOff: ImageVector
    get() {
        if (_ThumbUpOff != null) {
            return _ThumbUpOff!!
        }
        _ThumbUpOff = ImageVector.Builder(
            name = "Filled.ThumbUpOff",
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
                moveTo(7f, 11f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineToRelative(-7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(3f)
                arcToRelative(3.987f, 3.987f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.828f, -1.172f)
                moveToRelative(1.172f, -2.828f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4f, 0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                curveToRelative(-0.222f, 1.112f, -0.39f, 1.947f, -0.5f, 2.503f)
                moveToRelative(-0.758f, 3.244f)
                curveToRelative(-0.392f, 0.823f, -1.044f, 1.312f, -1.742f, 1.253f)
                horizontalLineToRelative(-7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
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

        return _ThumbUpOff!!
    }

@Suppress("ObjectPropertyName")
private var _ThumbUpOff: ImageVector? = null
