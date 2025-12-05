package dev.seyfarth.tablericons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.seyfarth.tablericons.TablerIcons

val TablerIcons.Outlined.PigMoney: ImageVector
    get() {
        if (_PigMoney != null) {
            return _PigMoney!!
        }
        _PigMoney = ImageVector.Builder(
            name = "Filled.PigMoney",
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
                moveTo(15f, 11f)
                verticalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.173f, 8.378f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.656f, -1.377f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 4f)
                verticalLineToRelative(3.803f)
                arcToRelative(6.019f, 6.019f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.658f, 3.197f)
                horizontalLineToRelative(1.341f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineToRelative(-1.342f)
                curveToRelative(-0.336f, 0.95f, -0.907f, 1.8f, -1.658f, 2.473f)
                verticalLineToRelative(2.027f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                verticalLineToRelative(-0.583f)
                arcToRelative(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 0.083f)
                horizontalLineToRelative(-4f)
                arcToRelative(6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -0.083f)
                verticalLineToRelative(0.583f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                verticalLineToRelative(-2f)
                lineToRelative(0f, -0.027f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -10.473f)
                horizontalLineToRelative(2.5f)
                lineToRelative(4.5f, -3f)
                horizontalLineToRelative(0f)
                close()
            }
        }.build()

        return _PigMoney!!
    }

@Suppress("ObjectPropertyName")
private var _PigMoney: ImageVector? = null
