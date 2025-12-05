package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.RosetteDiscount: ImageVector
    get() {
        if (_RosetteDiscount != null) {
            return _RosetteDiscount!!
        }
        _RosetteDiscount = ImageVector.Builder(
            name = "Filled.RosetteDiscount",
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
                moveTo(9f, 15f)
                lineToRelative(6f, -6f)
            }
            path(
                fill = SolidColor(Color.Black),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 9.5f)
                moveToRelative(-0.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1f, 0f)
            }
            path(
                fill = SolidColor(Color.Black),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 14.5f)
                moveToRelative(-0.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 7.2f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.2f, -2.2f)
                horizontalLineToRelative(1f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.55f, -0.64f)
                lineToRelative(0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.12f, 0f)
                lineToRelative(0.7f, 0.7f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.55f, 0.64f)
                horizontalLineToRelative(1f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.2f, 2.2f)
                verticalLineToRelative(1f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.64f, 1.55f)
                lineToRelative(0.7f, 0.7f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3.12f)
                lineToRelative(-0.7f, 0.7f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.64f, 1.55f)
                verticalLineToRelative(1f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.2f, 2.2f)
                horizontalLineToRelative(-1f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.55f, 0.64f)
                lineToRelative(-0.7f, 0.7f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.12f, 0f)
                lineToRelative(-0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.55f, -0.64f)
                horizontalLineToRelative(-1f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.2f, -2.2f)
                verticalLineToRelative(-1f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.64f, -1.55f)
                lineToRelative(-0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3.12f)
                lineToRelative(0.7f, -0.7f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.64f, -1.55f)
                verticalLineToRelative(-1f)
            }
        }.build()

        return _RosetteDiscount!!
    }

@Suppress("ObjectPropertyName")
private var _RosetteDiscount: ImageVector? = null
