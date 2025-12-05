package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CopyX: ImageVector
    get() {
        if (_CopyX != null) {
            return _CopyX!!
        }
        _CopyX = ImageVector.Builder(
            name = "Filled.CopyX",
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
                moveTo(7f, 9.667f)
                arcToRelative(2.667f, 2.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.667f, -2.667f)
                horizontalLineToRelative(8.666f)
                arcToRelative(2.667f, 2.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.667f, 2.667f)
                verticalLineToRelative(8.666f)
                arcToRelative(2.667f, 2.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.667f, 2.667f)
                horizontalLineToRelative(-8.666f)
                arcToRelative(2.667f, 2.667f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.667f, -2.667f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.012f, 16.737f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.012f, -1.737f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(10f)
                curveToRelative(0.75f, 0f, 1.158f, 0.385f, 1.5f, 1f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.5f, 11.5f)
                lineToRelative(4.9f, 5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 11.5f)
                lineToRelative(-5.1f, 5f)
            }
        }.build()

        return _CopyX!!
    }

@Suppress("ObjectPropertyName")
private var _CopyX: ImageVector? = null
