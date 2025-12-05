package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.Businessplan: ImageVector
    get() {
        if (_Businessplan != null) {
            return _Businessplan!!
        }
        _Businessplan = ImageVector.Builder(
            name = "Filled.Businessplan",
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
                moveTo(16f, 6f)
                moveToRelative(-5f, 0f)
                arcToRelative(5f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10f, 0f)
                arcToRelative(5f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, -10f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 6f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.657f, 2.239f, 3f, 5f, 3f)
                reflectiveCurveToRelative(5f, -1.343f, 5f, -3f)
                verticalLineToRelative(-4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 10f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.657f, 2.239f, 3f, 5f, 3f)
                reflectiveCurveToRelative(5f, -1.343f, 5f, -3f)
                verticalLineToRelative(-4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11f, 14f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.657f, 2.239f, 3f, 5f, 3f)
                reflectiveCurveToRelative(5f, -1.343f, 5f, -3f)
                verticalLineToRelative(-4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 9f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                horizontalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                horizontalLineToRelative(-2.5f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 15f)
                verticalLineToRelative(1f)
                moveToRelative(0f, -8f)
                verticalLineToRelative(1f)
            }
        }.build()

        return _Businessplan!!
    }

@Suppress("ObjectPropertyName")
private var _Businessplan: ImageVector? = null
