package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.EyeExclamation: ImageVector
    get() {
        if (_EyeExclamation != null) {
            return _EyeExclamation!!
        }
        _EyeExclamation = ImageVector.Builder(
            name = "Filled.EyeExclamation",
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
                moveTo(10f, 12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.03f, 17.478f)
                arcToRelative(8.797f, 8.797f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.03f, 0.522f)
                curveToRelative(-3.6f, 0f, -6.6f, -2f, -9f, -6f)
                curveToRelative(2.4f, -4f, 5.4f, -6f, 9f, -6f)
                curveToRelative(3.6f, 0f, 6.6f, 2f, 9f, 6f)
                arcToRelative(20.48f, 20.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.258f, 0.419f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                verticalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 22f)
                verticalLineToRelative(0.01f)
            }
        }.build()

        return _EyeExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _EyeExclamation: ImageVector? = null
