package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.RosetteNumber1: ImageVector
    get() {
        if (_RosetteNumber1 != null) {
            return _RosetteNumber1!!
        }
        _RosetteNumber1 = ImageVector.Builder(
            name = "Filled.RosetteNumber1",
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
                moveTo(10f, 10f)
                lineToRelative(2f, -2f)
                verticalLineToRelative(8f)
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
                curveToRelative(0.412f, 0.41f, 0.97f, 0.64f, 1.55f, 0.64f)
                horizontalLineToRelative(1f)
                arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.2f, 2.2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.58f, 0.23f, 1.138f, 0.64f, 1.55f)
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

        return _RosetteNumber1!!
    }

@Suppress("ObjectPropertyName")
private var _RosetteNumber1: ImageVector? = null
