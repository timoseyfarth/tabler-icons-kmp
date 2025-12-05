package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.CliffJumping: ImageVector
    get() {
        if (_CliffJumping != null) {
            return _CliffJumping!!
        }
        _CliffJumping = ImageVector.Builder(
            name = "Filled.CliffJumping",
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
                moveTo(14f, 7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 18f)
                lineToRelative(2.5f, 2f)
                lineToRelative(2f, -2f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 21f)
                lineToRelative(3f, -3f)
                lineToRelative(-4f, -2f)
                lineToRelative(-1f, -5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.5f, 7.5f)
                lineToRelative(2f, 3f)
                lineToRelative(3.5f, 0.5f)
                lineToRelative(3f, -2f)
                lineToRelative(0.5f, -3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 21f)
                verticalLineToRelative(-1f)
                lineToRelative(2f, -3f)
                lineToRelative(0.5f, -2.5f)
                lineToRelative(1.5f, -2.5f)
                lineToRelative(-1f, -5f)
                lineToRelative(1f, -3f)
                lineToRelative(-1f, -1f)
                lineToRelative(-2f, 0.5f)
                lineToRelative(-2f, -0.5f)
            }
        }.build()

        return _CliffJumping!!
    }

@Suppress("ObjectPropertyName")
private var _CliffJumping: ImageVector? = null
